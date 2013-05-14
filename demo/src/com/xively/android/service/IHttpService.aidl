package com.xively.android.service;

import com.xively.android.service.Response;

interface IHttpService {
    void setApiKey(in String apiKey);

    Response createFeed(in String body);
    Response updateFeed(in int feedId, in String body);
    Response listFeed();
    Response getFeed(in int feedId);
    Response deleteFeed(in int feedId);

    Response createDatastream(in int feedId, in String body);
    Response updateDatastream(in int feedId, in String datastreamId, in String body);
    Response listDatastream(in int feedId);
    Response getDatastream(in int feedId, in String datastreamId);
    Response deleteDatastream(in int feedId, in String datastreamId);

    Response createDatapoint(in int feedId, in String datastreamId, in String body);
    Response updateDatapoint(in int feedId, in String datastreamId, in String datapointAt, in String body);
    Response getDatapoint(in int feedId, in String datastreamId, in String datapointAt);
    Response deleteDatapoint(in int feedId, in String datastreamId, in String datapointAt);
    
    Response createKey(in String body);
    Response updateKey(in String keyId, in String body);
    Response listKey();
    Response getKey(in String keyId);
    Response deleteKey(in String keyId);

    Response createTrigger(in String body);
    Response updateTrigger(in int triggerId, in String body);
    Response listTrigger();
    Response getTrigger(in int triggerId);
    Response deleteTrigger(in int triggerId);    
}