package com.xively.android.service;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;

import com.xively.android.service.exception.ParseResponseException;

public class ResponseHelper
{
	public static final int HTTP_SERVICE_ERROR = -1;
	public static final String CHARSET = "UTF-8";
	public static final int BUFFER_SIZE = 10240;

	static String read(InputStream content)
	{
		Reader reader = null;
		StringWriter writer = null;
		try
		{
			reader = new InputStreamReader(content, CHARSET);
			writer = new StringWriter();

			char[] buffer = new char[BUFFER_SIZE];
			for (int length = 0; (length = reader.read(buffer)) > 0;)
			{
				writer.write(buffer, 0, length);
			}
		} catch (UnsupportedEncodingException e)
		{
			throw new ParseResponseException("Unable to parse response stream to string.", e);
		} catch (IOException e)
		{
			throw new ParseResponseException("Unable to read from response stream reader during parse.", e);
		} finally
		{
			try
			{
				writer.close();
			} catch (IOException e)
			{
				throw new ParseResponseException("Unable to close writer after parsing response stream to string.", e);
			}

			try
			{
				reader.close();
			} catch (IOException e)
			{
				throw new ParseResponseException("Unable to close reader after parsing response stream to string.", e);
			}
		}

		return writer.toString();
	}

	/**
	 * "Exceptions are not yet supported across process" and RemoteException is
	 * not implemented for Android before API 15. So, wrap exceptions into a
	 * response with the exception message as content and a status code of
	 * HTTP_SERVICE_ERROR.
	 * 
	 * @param e
	 * @return response that represent an exception condition
	 */
	static Response writeException(String msg, Exception e)
	{
		Throwable cause = e.getCause() != null ? e.getCause() : e;
		return new Response(HTTP_SERVICE_ERROR, msg, String.format("%s, Cause: %s[%s]", e.getClass().getName(), cause.getClass()
				.getName(), cause.getLocalizedMessage()));
	}
}
