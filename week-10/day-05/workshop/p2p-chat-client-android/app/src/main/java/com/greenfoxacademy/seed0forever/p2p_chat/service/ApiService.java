package com.greenfoxacademy.seed0forever.p2p_chat.service;

import com.greenfoxacademy.seed0forever.p2p_chat.model.Message;
import com.greenfoxacademy.seed0forever.p2p_chat.model.rest.MessageResponse;
import com.greenfoxacademy.seed0forever.p2p_chat.model.rest.StatusResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {
    @GET("/api/messages")
    Call<MessageResponse> getMessages();

    @POST("/api/messages")
    Call<StatusResponse> postMessage(@Body Message message);
}