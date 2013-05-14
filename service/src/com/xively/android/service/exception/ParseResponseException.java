package com.xively.android.service.exception;


public class ParseResponseException extends XivelyClientException
{
	public ParseResponseException(String msg, Throwable e)
	{
		super(msg, e);
	}
}
