package com.twitter.app.siddhesh.kulkarni.twitter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.twitter.app.siddhesh.kulkarni.twitter.pojo.Follower;
import com.twitter.app.siddhesh.kulkarni.twitter.pojo.IsValid;

@RestController
public class Follow {
	
  @Autowired
  IsValid isValid;
  
  @PostMapping("/follow")
  public IsValid followUser(@RequestBody Follower follower) {
    isValid.setValid(true);	
    
    return isValid;
  }	
}
