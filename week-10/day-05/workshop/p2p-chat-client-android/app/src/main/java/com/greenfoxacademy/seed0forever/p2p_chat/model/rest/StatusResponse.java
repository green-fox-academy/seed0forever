package com.greenfoxacademy.seed0forever.p2p_chat.model.rest;

/**
 * Created by marcell on 26/05/17.
 */

public class StatusResponse {

    private String status;

    public StatusResponse() {
    }

    public StatusResponse(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
