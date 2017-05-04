package com.greenfoxacademy.hellobeanworld.config;

import com.greenfoxacademy.hellobeanworld.model.colors.BlueColor;
import com.greenfoxacademy.hellobeanworld.model.colors.RedColor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyColorConfig {

  @Bean
  public RedColor redColor(){
    return new RedColor();
  }

  @Bean
  public BlueColor blueColor(){
    return new BlueColor();
  }

}
