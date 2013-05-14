package com.xively.android.service.exception;

/**
 * An exception condition indicating error when trying to make a request.
 * 
 * @author s0pau
 */
public class RequestUnsuccessfulException extends XivelyClientException
{
	int statusCode;

	public RequestUnsuccessfulException(String msg, Throwable t)
	{
		super(msg, t);
	}
}