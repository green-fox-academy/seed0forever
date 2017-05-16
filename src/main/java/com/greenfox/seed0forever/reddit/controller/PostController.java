package com.greenfox.seed0forever.reddit.controller;

import com.greenfox.seed0forever.reddit.model.Post;
import com.greenfox.seed0forever.reddit.model.PostList;
import com.greenfox.seed0forever.reddit.repository.PostRepository;
import java.sql.Timestamp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class PostController {

  @Autowired
  PostRepository postRepository;

  @GetMapping("/posts")
  public PostList getPosts() {
    return new PostList(postRepository.findAll());
  }

  @PostMapping("/posts")
  public Post addPost(@RequestBody Post receivedPost) {
    postRepository.save(receivedPost);
    return receivedPost;
  }

  @PutMapping("/posts/{id}")
  public Post updatePost(@RequestBody Post receivedPost, @PathVariable long id) {
    Post currentPost = postRepository.findOne(id);

    if (receivedPost.getTitle() != null && receivedPost.getTitle() != "") {
      currentPost.setTitle(receivedPost.getTitle());
    }

    if (receivedPost.getHref() != null && receivedPost.getHref() != "") {
      currentPost.setHref(receivedPost.getHref());
    }

    postRepository.save(currentPost);
    return currentPost;
  }

  @PutMapping("/posts/{id}/upvote")
  public Post upVote(@PathVariable long id) {
    Post currentPost = postRepository.findOne(id);
    currentPost.upVote();
    postRepository.save(currentPost);
    return currentPost;
  }

  @PutMapping("/posts/{id}/downvote")
  public Post downVote(@PathVariable long id) {
    Post currentPost = postRepository.findOne(id);
    currentPost.downVote();
    postRepository.save(currentPost);
    return currentPost;
  }

  @DeleteMapping("/posts/{id}")
  public Post deletePost(@PathVariable long id) {
    Post currentPost = postRepository.findOne(id);
    postRepository.delete(currentPost);
    return currentPost;
  }
}
