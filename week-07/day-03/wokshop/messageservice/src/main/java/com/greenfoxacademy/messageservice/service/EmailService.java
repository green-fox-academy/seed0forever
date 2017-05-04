package com.greenfoxacademy.messageservice.service;

public class EmailService implements MessageService {

  private static final String FORMAT = "Email Sent to %s with Message=%s";

  @Override
  public void sendMessage(String message, String addressee) {
    System.out.println(String.format(FORMAT, addressee, message));
  }
}
