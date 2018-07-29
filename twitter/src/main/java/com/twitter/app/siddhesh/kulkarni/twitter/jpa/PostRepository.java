package com.twitter.app.siddhesh.kulkarni.twitter.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twitter.app.siddhesh.kulkarni.twitter.pojo.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{

}
