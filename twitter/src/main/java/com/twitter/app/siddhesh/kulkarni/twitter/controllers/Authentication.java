package com.twitter.app.siddhesh.kulkarni.twitter.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twitter.app.siddhesh.kulkarni.twitter.jpa.UserRepository;
import com.twitter.app.siddhesh.kulkarni.twitter.pojo.IsValid;
import com.twitter.app.siddhesh.kulkarni.twitter.pojo.User;

@RestController
public class Authentication {
  
  @Autowired	
  IsValid isValid;
  
  @Autowired
  private UserRepository repo;

  
  @PostMapping("/authentication")
  public IsValid authenticate(@RequestBody User user) {
	List<User> u = repo.findAll();
	 isValid.setValid(false);
	
	for (int i=0; i<u.size(); i++) {
	   if (u.get(i).getUserName().equals(user.getUserName()) && 
	       u.get(i).getPassword().equals(user.getPassword())		  
		  ) {
		   isValid.setValid(true);		  
	  }
	}
	
    return isValid;
  }
  
  
  @GetMapping("/")
  public String login() {
    
    return "index";
  }
}
