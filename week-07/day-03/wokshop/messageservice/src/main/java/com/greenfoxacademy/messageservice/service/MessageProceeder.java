package com.greenfoxacademy.messageservice.service;

public class MessageProceeder {

  MessageService messageService;

  public MessageProceeder(MessageService messageService) {
    this.messageService = messageService;
  }

  public void processMessage(String message, String addressee) {
    messageService.sendMessage(message, addressee);
  }
}
