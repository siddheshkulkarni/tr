package com.twitter.app.siddhesh.kulkarni.twitter.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twitter.app.siddhesh.kulkarni.twitter.pojo.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}