package com.greenfoxacademy.seed0forever.frontend;

import com.greenfoxacademy.seed0forever.frontend.entity.Log;
import com.greenfoxacademy.seed0forever.frontend.entity.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FrontendApplication implements CommandLineRunner {

  @Autowired
  LogRepository mainLogRepository;

  public static void main(String[] args) {
    SpringApplication.run(FrontendApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    mainLogRepository.save(new Log("/no_endpoint", "created entry from main application"));
  }
}
