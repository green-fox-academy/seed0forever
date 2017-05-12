package com.greenfox.seed0forever.reddit.model;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Setter
  private String title;

  @Setter
  private String href;

  @Setter
  Timestamp timestamp;

  @Setter
  private long score;

  @Setter
  private String owner;

  @Setter
  private long vote;

}
