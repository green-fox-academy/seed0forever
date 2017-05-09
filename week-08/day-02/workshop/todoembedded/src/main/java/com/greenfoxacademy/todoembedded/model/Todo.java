package com.greenfoxacademy.todoembedded.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Todo {

  @Id
  private int id;
  private String title;
  private boolean isUrgent = false;
  private boolean isDone = false;

}
