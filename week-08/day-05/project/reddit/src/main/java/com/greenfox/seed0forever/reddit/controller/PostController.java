package com.greenfox.seed0forever.reddit.controller;

import com.greenfox.seed0forever.reddit.model.Post;
import com.greenfox.seed0forever.reddit.repository.PostRepository;
import java.sql.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

  @Autowired
  PostRepository postRepository;

  @GetMapping("/posts")
  public Iterable<Post> getPosts() {
    return postRepository.findAll();
  }

  @PostMapping("/posts")
  public Post addPost(@RequestBody Post receivedPost) {
    receivedPost.setTimestamp(new Timestamp(System.currentTimeMillis() / 1000));
    postRepository.save(receivedPost);
    return receivedPost;
  }
}
