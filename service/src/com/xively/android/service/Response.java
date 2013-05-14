package com.xively.android.service;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Value object holding all information returned from the response which is
 * returned from the AIDL service (a Parcelable).
 * 
 * @author s0pau
 * 
 */
public class Response implements Parcelable
{
	int statusCode;
	String message;
	String content;

	public static final Parcelable.Creator<Response> CREATOR = new Parcelable.Creator<Response>()
	{
		public Response createFromParcel(Parcel in)
		{
			return new Response(in);
		}

		public Response[] newArray(int size)
		{
			return new Response[size];
		}
	};

	public Response(int statusCode, String message, String content)
	{
		this.statusCode = statusCode;
		this.message = message;
		this.content = content;
	}

	private Response(Parcel in)
	{
		statusCode = in.readInt();
		message = in.readString();
		content = in.readString();
	}

	public int getStatusCode()
	{
		return statusCode;
	}

	public String getMessage()
	{
		return message;
	}

	public String getContent()
	{
		return content;
	}

	public int describeContents()
	{
		return 0;
	}

	public void writeToParcel(Parcel out, int flags)
	{
		out.writeInt(statusCode);
		out.writeString(message);
		out.writeString(content);
	}
}
