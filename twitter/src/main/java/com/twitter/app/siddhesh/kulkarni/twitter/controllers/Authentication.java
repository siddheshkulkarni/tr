package com.twitter.app.siddhesh.kulkarni.twitter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twitter.app.siddhesh.kulkarni.twitter.pojo.IsValid;
import com.twitter.app.siddhesh.kulkarni.twitter.pojo.User;

@RestController
public class Authentication {
  
  @Autowired	
  IsValid isValid;

  
  @PostMapping("/authentication")
  public IsValid authenticate(@RequestBody User user) {
    if (user.getUserName()!= null && user.getPassword() != null) {
      isValid.setValid(true);	
    } else {
      isValid.setValid(false);	
    }
    return isValid;
  }
  
  
  @GetMapping("/")
  public String login() {
    
    return "index";
  }
}
