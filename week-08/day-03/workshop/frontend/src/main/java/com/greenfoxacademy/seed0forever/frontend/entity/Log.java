package com.greenfoxacademy.seed0forever.frontend.entity;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Log {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Temporal(TemporalType.TIMESTAMP)
  private Date createdAt;

  public Log(String endpoint, String data) {
    this.endpoint = endpoint;
    this.data = data;
    this.createdAt = new Date();
  }

  private String endpoint;
  private String data;
}
