package com.greenfox.seed0forever.reddit;

import com.greenfox.seed0forever.reddit.model.Post;
import com.greenfox.seed0forever.reddit.repository.PostRepository;
import java.sql.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

  @Autowired
  PostRepository mainAppPostRepository;

  public static void main(String[] args) {
    SpringApplication.run(RedditApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Post testPost = new Post();
    testPost.setTitle("Test post added at application startup");
    testPost.setHref("localhost");
    testPost.setScore(666);
    testPost.setVote(1);
    testPost.setOwner("seed0forever");
    testPost.setTimestamp(new Timestamp(System.currentTimeMillis()));
    mainAppPostRepository.save(testPost);
  }
}
