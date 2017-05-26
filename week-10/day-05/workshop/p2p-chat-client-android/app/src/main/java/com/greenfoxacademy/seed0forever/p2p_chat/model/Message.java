package com.greenfoxacademy.seed0forever.p2p_chat.model;

import java.sql.Timestamp;

public class Message {

    private long id;
    private String username;
    private String text;
    private Timestamp timestamp;

    public Message() {
    }

    public Message(String username, String text) {
        this.username = username;
        this.text = text;
    }

    public Message(long id, String username, String text, Timestamp timestamp) {
        this.id = id;
        this.username = username;
        this.text = text;
        this.timestamp = timestamp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
