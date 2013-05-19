package com.xively.android.service;

/**
 * Fluent UriBuilder for API service endpoints.
 * 
 * @author s0pau
 * 
 */
public class UriBuilder
{
	private String DEFAULT_BASE_URI = "https://api.xively.com/v2/";

	/**
	 * @return url to all Feed API endpoints
	 */
	public Feed feeds()
	{
		return new Feed();
	}

	/**
	 * @param feedId
	 *            parent of the datastream
	 * @return url to all Datastream API endpoints
	 */
	public Datastream datastreams(int feedId)
	{
		return new Datastream(feedId);
	}

	/**
	 * @param feedId
	 *            indirect parent of the datapoint
	 * @param datastreamId
	 *            direct parent of the datapoint
	 * @return url to all Datapoint API endpoints
	 */
	public Datapoint datapoints(int feedId, String datastreamId)
	{
		return new Datapoint(feedId, datastreamId);
	}

	/**
	 * 
	 * @return url to all ApiKey API endpoints
	 */
	public ApiKey apiKeys()
	{
		return new ApiKey();
	}

	/**
	 * 
	 * @return url to all Trigger API endpoints
	 */
	public Trigger triggers()
	{
		return new Trigger();
	}

	public class Feed
	{
		public static final String ROOT = "feeds";

		private Feed()
		{

		}

		public String resource(int feedId)
		{
			return resources().concat("/").concat(String.valueOf(feedId));
		}

		public String resources()
		{
			return DEFAULT_BASE_URI.concat(ROOT);
		}
	}

	public class Datastream
	{
		public static final String ROOT = "datastreams";

		private int feedId;

		private Datastream(int feedId)
		{
			this.feedId = feedId;
		}

		public String resources()
		{
			return parent().concat(ROOT);
		}

		public String resource(String datastreamId)
		{
			return resources().concat("/").concat(datastreamId);
		}

		public String parent()
		{
			return feeds().resource(feedId).concat("/");
		}
	}

	public class Datapoint
	{
		public static final String ROOT = "datapoints";

		private int feedId;
		private String datastreamId;

		private Datapoint(int feedId, String datastreamId)
		{
			this.feedId = feedId;
			this.datastreamId = datastreamId;
		}

		public String resources()
		{
			return parent().concat(ROOT);
		}

		public String resource(String datapointAt)
		{
			return resources().concat("/").concat(datapointAt);
		}

		public String parent()
		{
			return datastreams(feedId).resource(datastreamId).concat("/");
		}
	}

	public class ApiKey
	{
		public static final String ROOT = "keys";

		private ApiKey()
		{

		}

		public String resource(String keyId)
		{
			return resources().concat("/").concat(keyId);
		}

		public String resources()
		{
			return DEFAULT_BASE_URI.concat(ROOT);
		}
	}

	public class Trigger
	{
		public static final String ROOT = "triggers";

		private Trigger()
		{

		}

		public String resource(int triggerId)
		{
			return resources().concat("/").concat(String.valueOf(triggerId));
		}

		public String resources()
		{
			return DEFAULT_BASE_URI.concat(ROOT);
		}
	}

}
