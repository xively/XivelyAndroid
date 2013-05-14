package com.xively.android.service;

/**
 * Value object holding all context necessary for making a request.
 * 
 * @author s0pau
 * 
 */
public class Request
{
	private static final String TAG = Request.class.getSimpleName();

	public static final String HTTP_METHOD_GET = "GET";
	public static final String HTTP_METHOD_PUT = "PUT";
	public static final String HTTP_METHOD_POST = "POST";
	public static final String HTTP_METHOD_DELETE = "DELETE";

	private String httpMethod;
	private String uriStr;
	private String apiKey;
	private String body;

	public Request(String httpMethod, String uriStr, String apiKey, String body)
	{
		this.httpMethod = httpMethod;
		this.uriStr = uriStr;
		this.apiKey = apiKey;
		this.body = body;
	}

	public String getHttpMethod()
	{
		return httpMethod;
	}

	public void setHttpMethod(String httpMethod)
	{
		this.httpMethod = httpMethod;
	}

	public String getUriStr()
	{
		return uriStr;
	}

	public void setUriStr(String uriStr)
	{
		this.uriStr = uriStr;
	}

	public String getApiKey()
	{
		return apiKey;
	}

	public void setApiKey(String apiKey)
	{
		this.apiKey = apiKey;
	}

	public String getBody()
	{
		return body;
	}

	public void setBody(String body)
	{
		this.body = body;
	}
}
