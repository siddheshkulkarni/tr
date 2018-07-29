package com.twitter.app.siddhesh.kulkarni.twitter.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
  String userName;
  String password;
  @Id
  @GeneratedValue
  Integer userId;
  
  public String getUserName() {
	return userName;
  }
  
  public void setUserName(String userName) {
	this.userName = userName;
  }
  
  public String getPassword() {
    return password;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }

  public Integer getUserId() {
	return userId;
  }

  public void setUserId(Integer userId) {
	this.userId = userId;
  } 
}
