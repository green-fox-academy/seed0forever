package com.greenfoxacademy.seed0forever.p2p_chat.model.rest;

import com.greenfoxacademy.seed0forever.p2p_chat.model.Message;

import java.util.List;

public class MessageResponse {

    public List<Message> messages;
    public ChatClient client;

    public MessageResponse() {
    }

    public MessageResponse(List<Message> messages, ChatClient client) {
        this.messages = messages;
        this.client = client;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public ChatClient getClient() {
        return client;
    }

    public void setClient(ChatClient client) {
        this.client = client;
    }
}
