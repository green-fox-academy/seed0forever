package com.greenfoxacademy.messageservice.configuration;

import com.greenfoxacademy.messageservice.service.EmailService;
import com.greenfoxacademy.messageservice.service.MessageService;
import com.greenfoxacademy.messageservice.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

  @Bean
  public MessageService emailService(){
    return new EmailService();
  }

  public MessageService twitterService(){
    return new TwitterService();
  }

}
