package com.greenfoxacademy.messageservice;

import com.greenfoxacademy.messageservice.configuration.MessageConfiguration;
import com.greenfoxacademy.messageservice.service.MessageProceeder;
import com.greenfoxacademy.messageservice.service.MessageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MessageserviceApplication implements CommandLineRunner {

  MessageProceeder messageProceeder;

  public static void main(String[] args) {
    SpringApplication.run(MessageserviceApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    ApplicationContext messageContext = new AnnotationConfigApplicationContext(
            MessageConfiguration.class);
    messageProceeder = new MessageProceeder(messageContext.getBean(MessageService.class));

    messageProceeder.processMessage("Hi Barba, How are you?", "office@greenfox.com");
  }
}