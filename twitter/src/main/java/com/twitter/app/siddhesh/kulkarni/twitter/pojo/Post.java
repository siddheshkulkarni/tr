package com.twitter.app.siddhesh.kulkarni.twitter.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="post")
public class Post {
  String message;
  @Id
  @GeneratedValue
  Integer postId;
  String userId;
  String date;
  
  public String getMessage() {
    return message;
  }
  
  public void setMessage(String message) {
    this.message = message;
  }
  
  public Integer getPostId() {
    return postId;
  }
  
  public void setPostId(Integer postId) {
    this.postId = postId;
  }
  
  public String getUserId() {
    return userId;
  }
  
  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }
}
