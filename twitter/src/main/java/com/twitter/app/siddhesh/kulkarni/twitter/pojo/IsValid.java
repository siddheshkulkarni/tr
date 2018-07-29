package com.twitter.app.siddhesh.kulkarni.twitter.pojo;

import org.springframework.stereotype.Component;

@Component
public class IsValid {
  boolean isValid;

  public boolean isValid() {
    return isValid;
  }

  public void setValid(boolean isValid) {
    this.isValid = isValid;
  }
   
}
