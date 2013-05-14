package com.xively.android.service;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import com.xively.android.service.exception.RequestUnsuccessfulException;

/**
 * Implementation of the AIDL service. An {@link AsyncTask} is created per HTTP
 * request and the response is returned from the {@link AsyncTask}. The parsing
 * of the response is managed by the {@link Response} class.
 * 
 * <p>
 * The intent this service listens to is as per HttpService.INTENT_NAME.
 * <p>
 * The response is expected to return from AsyncTask within the time as
 * specified in HttpService.DEFAULT_TIMEOUT. An exception will be thrown
 * otherwise.
 * 
 * @author s0pau
 * 
 */
public class HttpService extends Service
{
	public static final String INTENT_NAME = "com.xively.android.service.HttpService";
	private static final String TAG = HttpService.class.getSimpleName();
	public static final long DEFAULT_TIMEOUT = 5000;

	@Override
	public void onCreate()
	{
		super.onCreate();
		Log.d(TAG, "onCreate()");
	}

	@Override
	public void onDestroy()
	{
		super.onDestroy();
		Log.d(TAG, "onDestroy()");
	}

	@Override
	public IBinder onBind(Intent intent)
	{
		return new IHttpService.Stub()
		{
			private String apiKey = null;

			@Override
			public void setApiKey(String apiKey) throws RemoteException
			{
				this.apiKey = apiKey;
			}

			@Override
			public Response createFeed(String body) throws RemoteException
			{
				return post(new UriBuilder().feeds().resources(), body, apiKey);
			}

			@Override
			public Response updateFeed(int feedId, String body) throws RemoteException
			{
				return put(new UriBuilder().feeds().resource(feedId), body, apiKey);
			}

			@Override
			public Response listFeed() throws RemoteException
			{
				return get(new UriBuilder().feeds().resources(), apiKey);
			}

			@Override
			public Response getFeed(int feedId) throws RemoteException
			{
				return get(new UriBuilder().feeds().resource(feedId), apiKey);
			}

			@Override
			public Response deleteFeed(int feedId) throws RemoteException
			{
				return delete(new UriBuilder().feeds().resource(feedId), apiKey);
			}

			@Override
			public Response createDatastream(int feedId, String body) throws RemoteException
			{
				return post(new UriBuilder().datastreams(feedId).resources(), body, apiKey);
			}

			@Override
			public Response updateDatastream(int feedId, String datastreamId, String body) throws RemoteException
			{
				return put(new UriBuilder().datastreams(feedId).resource(datastreamId), body, apiKey);
			}

			@Override
			public Response listDatastream(int feedId) throws RemoteException
			{
				return get(new UriBuilder().datastreams(feedId).resources(), apiKey);
			}

			@Override
			public Response getDatastream(int feedId, String datastreamId) throws RemoteException
			{
				return get(new UriBuilder().datastreams(feedId).resource(datastreamId), apiKey);
			}

			@Override
			public Response deleteDatastream(int feedId, String datastreamId) throws RemoteException
			{
				return delete(new UriBuilder().datastreams(feedId).resource(datastreamId), apiKey);
			}

			@Override
			public Response createDatapoint(int feedId, String datastreamId, String body) throws RemoteException
			{
				return post(new UriBuilder().datapoints(feedId, datastreamId).resources(), body, apiKey);
			}

			@Override
			public Response updateDatapoint(int feedId, String datastreamId, String datapointAt, String body)
					throws RemoteException
			{
				return put(new UriBuilder().datapoints(feedId, datastreamId).resource(datapointAt), body, apiKey);
			}

			@Override
			public Response getDatapoint(int feedId, String datastreamId, String datapointAt) throws RemoteException
			{
				return get(new UriBuilder().datapoints(feedId, datastreamId).resource(datapointAt), apiKey);
			}

			@Override
			public Response deleteDatapoint(int feedId, String datastreamId, String datapointAt) throws RemoteException
			{
				return delete(new UriBuilder().datapoints(feedId, datastreamId).resource(datapointAt), apiKey);
			}

			@Override
			public Response createKey(String body) throws RemoteException
			{
				return post(new UriBuilder().apiKeys().resources(), body, apiKey);
			}

			@Override
			public Response updateKey(String keyId, String body) throws RemoteException
			{
				return put(new UriBuilder().apiKeys().resource(keyId), body, apiKey);
			}

			@Override
			public Response listKey() throws RemoteException
			{
				return get(new UriBuilder().apiKeys().resources(), apiKey);
			}

			@Override
			public Response getKey(String keyId) throws RemoteException
			{
				return get(new UriBuilder().apiKeys().resource(keyId), apiKey);
			}

			@Override
			public Response deleteKey(String keyId) throws RemoteException
			{
				return delete(new UriBuilder().apiKeys().resource(keyId), apiKey);
			}

			@Override
			public Response createTrigger(String body) throws RemoteException
			{
				return post(new UriBuilder().triggers().resources(), body, apiKey);
			}

			@Override
			public Response updateTrigger(int triggerId, String body) throws RemoteException
			{
				return put(new UriBuilder().triggers().resource(triggerId), body, apiKey);
			}

			@Override
			public Response listTrigger() throws RemoteException
			{
				return get(new UriBuilder().triggers().resources(), apiKey);
			}

			@Override
			public Response getTrigger(int triggerId) throws RemoteException
			{
				return get(new UriBuilder().triggers().resource(triggerId), apiKey);
			}

			@Override
			public Response deleteTrigger(int triggerId) throws RemoteException
			{
				return delete(new UriBuilder().triggers().resource(triggerId), apiKey);
			}
		};
	}

	/**
	 * Helper method to make http get request with given params.
	 * 
	 * @param uri
	 * @param apiKey
	 * @return response from the request made.
	 */
	private Response get(String uri, String apiKey)
	{
		Request request = new Request(Request.HTTP_METHOD_GET, uri, apiKey, null);
		return executeRequest(request);
	}

	/**
	 * Helper method to make http put request with given params.
	 * 
	 * @param uri
	 * @param body
	 * @param apiKey
	 * @return response from the request made.
	 */
	private Response put(String uri, String body, String apiKey)
	{
		Request request = new Request(Request.HTTP_METHOD_PUT, uri, apiKey, body);
		return executeRequest(request);
	}

	/**
	 * Helper method to make http put request with given params.
	 * 
	 * @param uri
	 * @param body
	 * @param apiKey
	 * @return response from the request made.
	 */
	private Response post(String uri, String body, String apiKey)
	{
		Request request = new Request(Request.HTTP_METHOD_POST, uri, apiKey, body);
		return executeRequest(request);
	}

	/**
	 * Helper method to make http delete request with given params.
	 * 
	 * @param uri
	 * @param apiKey
	 * @return response from the request made.
	 */
	private Response delete(String uri, String apiKey)
	{
		Request request = new Request(Request.HTTP_METHOD_DELETE, uri, apiKey, null);
		return executeRequest(request);
	}

	/**
	 * @param request
	 * @return the response from making the request; return a response with bad
	 *         code if exception is encountered in the process.
	 */
	private Response executeRequest(Request request)
	{
		AsyncTask<Request, Integer, Response[]> task = null;

		try
		{
			task = new HttpTask().execute(request);
		} catch (RequestUnsuccessfulException e)
		{
			String msg = "Unable to execute request";
			Log.w(TAG, msg, e);
			return ResponseHelper.writeException(msg, e);
		}

		Response[] responses = null;
		try
		{
			responses = task.get(DEFAULT_TIMEOUT, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e)
		{
			String msg = "Unable to retrieve results from httpTask";
			Log.w(TAG, msg, e);
			return ResponseHelper.writeException(msg, e);
		} catch (ExecutionException e)
		{
			String msg = "Unable to retrieve results from httpTask";
			Log.w(TAG, msg, e);
			return ResponseHelper.writeException(msg, e);
		} catch (TimeoutException e)
		{
			String msg = "Unable to retrieve results from httpTask";
			Log.w(TAG, msg, e);
			return ResponseHelper.writeException(msg, e);
		}

		return responses != null ? responses[0] : null;
	}
}
