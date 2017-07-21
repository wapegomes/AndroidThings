package com.example.wgomes.androidthingshardware.model;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wgomes on 20/07/17.
 */

public class RequestQueue {

    public String requester;
    public Boolean requestDone;
    public String daterequest;
    public String dateRequestDone;
    public Boolean requestToOn;

    public RequestQueue() {

    }

    public RequestQueue(String requester, Boolean requestDone, String daterequest, String dateRequestDone, Boolean requestToOn) {
        this.requester = requester;
        this.requestDone = requestDone;
        this.daterequest = daterequest;
        this.dateRequestDone = dateRequestDone;
        this.requestToOn = requestToOn;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("requester", requester);
        result.put("requestDone", requestDone);
        result.put("daterequest", daterequest);
        result.put("dateRequestDone", dateRequestDone);
        result.put("requestToOn", requestToOn);

        return result;
    }
}
