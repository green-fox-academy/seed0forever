package com.greenfox.seed0forever.reddit.repository;

import com.greenfox.seed0forever.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface PostRepository extends CrudRepository<Post, Long> {

}
