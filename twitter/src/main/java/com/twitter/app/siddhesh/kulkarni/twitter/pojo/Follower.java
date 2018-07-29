package com.twitter.app.siddhesh.kulkarni.twitter.pojo;

import java.util.List;

public class Follower {
  String userId;	
  List<String> followers;

  public String getUserId() {
	return userId;
  }

  public void setUserId(String userId) {
	this.userId = userId;
  }

  public List<String> getFollowers() {
    return followers;
  }

  public void setFollowers(List<String> followers) {
    this.followers = followers;
  }
  
}
