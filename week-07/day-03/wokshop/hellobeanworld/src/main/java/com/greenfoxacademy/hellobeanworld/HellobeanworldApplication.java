package com.greenfoxacademy.hellobeanworld;

import com.greenfoxacademy.hellobeanworld.config.HelloWorldConfig;
import com.greenfoxacademy.hellobeanworld.config.MyColorConfig;
import com.greenfoxacademy.hellobeanworld.model.HelloWorld;
import com.greenfoxacademy.hellobeanworld.model.colors.BlueColor;
import com.greenfoxacademy.hellobeanworld.model.colors.RedColor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HellobeanworldApplication {

  public static void main(String[] args) {
    SpringApplication.run(HellobeanworldApplication.class, args);

    ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
    ApplicationContext colorContext = new AnnotationConfigApplicationContext(MyColorConfig.class);

    HelloWorld helloWorld = context.getBean(HelloWorld.class);

    helloWorld.setMessage("Hello World!");
    helloWorld.getMessage();

    RedColor myRedColor = colorContext.getBean(RedColor.class);
    BlueColor myBlueColor = colorContext.getBean(BlueColor.class);
    myRedColor.printColor();
    myBlueColor.printColor();
  }
}
