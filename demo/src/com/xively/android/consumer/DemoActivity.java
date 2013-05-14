package com.xively.android.consumer;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.xively.android.service.IHttpService;
import com.xively.android.service.Response;

/**
 * A primitive activity to demo simple remote client connection to the Xively's
 * AIDL Service service.
 * 
 * @author s0pau
 * 
 */
public class DemoActivity extends Activity
{
	private static final String TAG = DemoActivity.class.getSimpleName();
	IHttpService service;
	HttpServiceConnection connection;

	// ------------- SET THE FOLLOWING ACCORDINGLY ----------------------

        // DEFINE YOUR CREDENTIALS BELOW (TODO: make these configurable)
        //private final String myApiKey = "REPLACE_WITH_YOUR_XIVELY_API_KEY";
        //private final int myFeedId = 540; 

	// a datastream id which belongs to myFeedId
	private final String myDatastreamId = "stream_id1";
	// a datapoint to be created on myDatastreamId
	private final String myNewDatapoint = "{ \"datapoints\":[ {\"at\":\"2010-05-20T11:01:43Z\",\"value\":\"294\"} ] }";

	// ------------------------------------------------------------------

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_demo);

		initService();

		// Setup the UI
		Button button1 = (Button) findViewById(R.id.doService1);
		button1.setOnClickListener(new OnClickListener()
		{
			TextView resultField = (TextView) findViewById(R.id.result);

			public void onClick(View v)
			{
				Response response = null;
				try
				{
					service.setApiKey(myApiKey);
					response = service.listFeed();
				} catch (RemoteException e)
				{
					Log.e(DemoActivity.TAG, "onClick failed", e);
				}

				if (response != null)
				{
					resultField.setText(response.getContent());
				}
			}
		});

		Button button2 = (Button) findViewById(R.id.doService2);
		button2.setOnClickListener(new OnClickListener()
		{
			TextView resultField = (TextView) findViewById(R.id.result);

			public void onClick(View v)
			{
				Response response = null;
				try
				{
					service.setApiKey(myApiKey);
					response = service.createDatapoint(myFeedId, myDatastreamId, myNewDatapoint);
				} catch (RemoteException e)
				{
					Log.e(DemoActivity.TAG, "onClick failed", e);
				}

				if (response != null)
				{
					resultField.setText(response.getContent());
				}
			}
		});
	}

	@Override
	protected void onDestroy()
	{
		super.onDestroy();
		releaseService();
	}

	/**
	 * Binds this activity to the service.
	 */
	private void initService()
	{
		connection = new HttpServiceConnection();
		Intent i = new Intent("com.xively.android.service.HttpService");
		boolean ret = bindService(i, connection, Context.BIND_AUTO_CREATE);
		Log.d(TAG, "initService() bound with " + ret);
	}

	/**
	 * Unbinds this activity from the service.
	 */
	private void releaseService()
	{
		unbindService(connection);
		connection = null;
		Log.d(TAG, "releaseService() unbound.");
	}

	class HttpServiceConnection implements ServiceConnection
	{
		public void onServiceConnected(ComponentName name, IBinder boundService)
		{
			service = IHttpService.Stub.asInterface((IBinder) boundService);
			Log.d(DemoActivity.TAG, "onServiceConnected() connected");
			Toast.makeText(DemoActivity.this, "Service connected", Toast.LENGTH_LONG).show();
		}

		public void onServiceDisconnected(ComponentName name)
		{
			service = null;
			Log.d(DemoActivity.TAG, "onServiceDisconnected() disconnected");
			Toast.makeText(DemoActivity.this, "Service connected", Toast.LENGTH_LONG).show();
		}
	}

}
