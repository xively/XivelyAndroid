package com.xively.android.service.test;

import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.test.ServiceTestCase;

import com.xively.android.service.HttpService;
import com.xively.android.service.IHttpService;
import com.xively.android.service.Response;

public class HttpServiceTest extends ServiceTestCase<HttpService>
{
	public HttpServiceTest()
	{
		super(HttpService.class);
	}

	@Override
	protected void setUp()
	{
		setupService();
	}

        // DEFINE YOUR CREDENTIALS BELOW (TODO: make these configurable)
	//private final String myApiKey = "REPLACE_WITH_YOUR_XIVELY_API_KEY";
	//private final int myFeedId = 540; 

	// a datastream id which belongs to myFeedId
	private final String myDatastreamId = "stream_id1";
	// a datapoint to be created on myDatastreamId
	private final String myNewDatapoint = "{ \"datapoints\":[ {\"at\":\"2010-05-20T11:01:43Z\",\"value\":\"294\"} ] }";

	public void testCreateDatapoint()
	{
		IBinder service = this.bindService(new Intent(HttpService.class.getName()));

		// verify that we have binded to the right type of service
		assertNotNull(service);
		assertTrue(service instanceof IHttpService);

		IHttpService httpService = IHttpService.Stub.asInterface(service);
		assertNotNull(httpService);

		try
		{
			httpService.setApiKey(myApiKey);
			Response response = httpService.createDatapoint(myFeedId, myDatastreamId, myNewDatapoint);
			assertEquals(200, response.getStatusCode());
		} catch (RemoteException e)
		{
			fail("Remote Exception is not expected.");
		}
	}
}
