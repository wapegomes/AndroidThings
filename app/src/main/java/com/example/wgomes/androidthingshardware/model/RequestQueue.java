package com.example.wgomes.androidthingshardware.model;

/**
 * Created by wgomes on 20/07/17.
 */

public class RequestQueue {

    public String requester;
    public Boolean requestDone;
    public String daterequest;
    public String dateRequestDone;
    public Boolean requestToOn;

    public RequestQueue(String requester, Boolean requestDone, String daterequest, String dateRequestDone, Boolean requestToOn) {
        this.requester = requester;
        this.requestDone = requestDone;
        this.daterequest = daterequest;
        this.dateRequestDone = dateRequestDone;
        this.requestToOn = requestToOn;
    }
}
