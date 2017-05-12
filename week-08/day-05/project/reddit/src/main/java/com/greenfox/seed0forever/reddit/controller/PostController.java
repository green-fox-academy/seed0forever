package com.greenfox.seed0forever.reddit.controller;

import com.greenfox.seed0forever.reddit.model.Post;
import com.greenfox.seed0forever.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

  @Autowired
  PostRepository postRepository;

  @RequestMapping("/posts")
  public Iterable<Post> getPosts() {
    return postRepository.findAll();
  }
}
