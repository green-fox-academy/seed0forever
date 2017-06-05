package com.greenfox.seed0forever.reddit.model;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private String href;
  private Timestamp timestamp;
  private long score;
  private String owner;
  private long vote;

  public Post() {
    this.title = "empty";
    this.href = "empty";
    this.timestamp = new Timestamp(System.currentTimeMillis() / 1000);
    this.score = 0;
  }

  public Post(String title, String href) {
    this.title = title;
    this.href = href;
    this.timestamp = new Timestamp(System.currentTimeMillis() / 1000);
    this.score = 0;
  }

  public void upVote() {
    score++;
  }

  public void downVote() {
    score--;
  }
}
