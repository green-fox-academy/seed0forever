package com.greenfoxacademy.hellobeanworld;

import com.greenfoxacademy.hellobeanworld.model.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HellobeanworldApplication {

  @Autowired
  HelloWorld helloWorld;

  public static void main(String[] args) {
    SpringApplication.run(HellobeanworldApplication.class, args);

    AnnotationConfigApplicationContext


  }
}
