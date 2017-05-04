package com.greenfoxacademy.hellobeanworld;

import com.greenfoxacademy.hellobeanworld.config.MyColorConfig;
import com.greenfoxacademy.hellobeanworld.model.HelloWorld;
import com.greenfoxacademy.hellobeanworld.model.colors.BlueColor;
import com.greenfoxacademy.hellobeanworld.model.colors.MyColor;
import com.greenfoxacademy.hellobeanworld.model.colors.RedColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {

  @Autowired
  HelloWorld helloWorld;

  public static void main(String[] args) {
    SpringApplication.run(HellobeanworldApplication.class, args);

  }

  @Override
  public void run(String... args) throws Exception {
    ApplicationContext colorContext = new AnnotationConfigApplicationContext(MyColorConfig.class);

    helloWorld.setMessage("Hello World!");
    helloWorld.getMessage();

    MyColor myRedColor = (MyColor) colorContext.getBean("red");
    MyColor myBlueColor = colorContext.getBean(BlueColor.class);
    myRedColor.printColor();
    myBlueColor.printColor();

  }
}
