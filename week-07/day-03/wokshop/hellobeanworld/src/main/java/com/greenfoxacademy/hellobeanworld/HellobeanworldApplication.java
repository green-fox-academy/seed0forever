package com.greenfoxacademy.hellobeanworld;

import com.greenfoxacademy.hellobeanworld.config.HelloWorldConfig;
import com.greenfoxacademy.hellobeanworld.model.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class HellobeanworldApplication {

  public static void main(String[] args) {
    SpringApplication.run(HellobeanworldApplication.class, args);

    ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
    HelloWorld helloWorld = context.getBean(HelloWorld.class);

    helloWorld.setMessage("Hello World!");
    helloWorld.getMessage();
  }
}
