package com.twitter.app.siddhesh.kulkarni.twitter.jpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.twitter.app.siddhesh.kulkarni.twitter.pojo.Post;
import com.twitter.app.siddhesh.kulkarni.twitter.pojo.User;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{

}
