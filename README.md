# Xively Android library (BETA)

Please note that this library is still in beta.

## Overview

This is an Android remote (AIDL) service for accessing Xively API asynchronously.

The implementation can be found under _`service`_ subdirectory.

An example of the consumer of this service can be found under _`demo`_ subdirectory.

It uses Android's `URLConnection` for handling HTTP requests and have no external dependencies.

It is deliberately designed to be very lightweight.
For a fully featured HTTP client library, check out our [Java library](https://github.com/xively/Xively4J).

It currently supports API9 (Gingerbread) to API17 (Jelly Bean).

## Copyright

_This library is Open Source, under the BSD 3-Clause._

_Copyright © 2003-2013 LogMeIn, Inc. All rights reserved._

_See `LICENSE.md` for full text of the license._

## Xively Credentials

You will need to set your API key and feed ID in these files:

* _`test/src/com/xively/android/service/test/HttpServiceTest.java`_
* _`demo/src/com/xively/android/consumer/DemoActivity.java`_

## Configuring Android Service Consumer

The consumer of this service will be able to access Xively API via all methods defined in the _`IHttpService.aidl`_.

As seen from the demo project, the following files must be present in the consumer as per AIDL service specified by Android:

```Java
com.xively.android.service.Response.java
com.xively.android.service.IHttpService.aidl
com.xively.android.service.Response.aidl
```

The name of the intent this service listens to is `com.xively.android.service.HttpService`, as per the _`AndroidManifest.xml`_:

```XML
    <service android:name="com.xively.android.service.HttpService" >
        <intent-filter>
            <action android:name="com.xively.android.service.HttpService" />
        </intent-filter>
    </service>
```

Multiple client apps can connect to this service if the include the above snippet on _`AndroidManifest.xml`_.

## HTTP Service

RESTful requests to Xively API are managed by `HttpService` when invoked by an intent.

The service uses `AsyncTask` to make the request.

The response is expected to return from `AsyncTask` within the time as specified in `HttpService.DEFAULT_TIMEOUT`.

An exception will be thrown otherwise.

## Exception Hierarchy

All exception thrown out of this library is `RemoteException`, as prescribed by AIDL specification. 

For compatibility with Android version before API15, any caught exception in this service will be returned as a response with its status that represents an exception condition (`HTTPService.HTTP_SERVICE_ERROR`).

## Data Formats

The response from the service can be retrieved as string:

```Java
response.getContent()
```

which the client can then easily turned into a `JsonObject` by:

```Java
new JSONObject(response.getContent())
```
[![githalytics.com alpha](https://cruel-carlota.pagodabox.com/5dfa1a86b42cd5e742c1b4a8b777241c "githalytics.com")](http://githalytics.com/xively/XivelyAndroid)
