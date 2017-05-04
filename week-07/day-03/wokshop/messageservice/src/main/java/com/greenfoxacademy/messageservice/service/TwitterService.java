package com.greenfoxacademy.messageservice.service;

public class TwitterService implements MessageService {

  private static final String FORMAT = "Tweet Sent to %s with Message=%s";

  @Override
  public void sendMessage(String message, String addressee) {
    System.out.println(String.format(FORMAT, addressee, message));
  }
}
