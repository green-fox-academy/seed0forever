package com.greenfoxacademy.programmerfoxclub.configuration;

import com.greenfoxacademy.programmerfoxclub.model.Fox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoxConfiguration {

  @Bean
  public Fox createFox(){
    return new Fox();
  }

}
