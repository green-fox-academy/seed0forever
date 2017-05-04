package com.greenfoxacademy.messageservice.configuration;

import com.greenfoxacademy.messageservice.service.EmailService;
import com.greenfoxacademy.messageservice.service.MessageProceeder;
import com.greenfoxacademy.messageservice.service.MessageService;
import com.greenfoxacademy.messageservice.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MessageConfiguration {

  @Bean
  @Primary
  public MessageService emailService() {
    return new EmailService();
  }

  @Bean
  public MessageService twitterService() {
    return new TwitterService();
  }

  @Bean
  public MessageProceeder messageProceeder() {
    return new MessageProceeder();
  }

}
