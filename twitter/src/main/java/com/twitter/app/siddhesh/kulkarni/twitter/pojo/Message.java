package com.twitter.app.siddhesh.kulkarni.twitter.pojo;

import javax.persistence.Entity;


public class Message {
  Long messageId;
  String message;
  Long userId;
  
  public Long getMessageId() {
    return messageId;
  }

  public void setMessageId(Long messageId) {
    this.messageId = messageId;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
	this.message = message;
  }

  public Long getUserId() {
	return userId;
  }

  public void setUserId(Long userId) {
	this.userId = userId;
  }

}
