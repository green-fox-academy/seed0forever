package com.greenfoxacademy.messageservice.service;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {

  @Autowired
  MessageService messageService;

  public void processMessage(String message, String addressee) {
    messageService.sendMessage(message, addressee);
  }
}
