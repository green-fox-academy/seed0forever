package com.greenfoxacademy.hellobeanworld.config;

import com.greenfoxacademy.hellobeanworld.model.colors.BlueColor;
import com.greenfoxacademy.hellobeanworld.model.colors.MyColor;
import com.greenfoxacademy.hellobeanworld.model.colors.RedColor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyColorConfig {

  @Bean(name = "red")
  public MyColor redColor() {
    return new RedColor();
  }

  @Bean(name = "blue")
  public MyColor blueColor() {
    return new BlueColor();
  }

}
