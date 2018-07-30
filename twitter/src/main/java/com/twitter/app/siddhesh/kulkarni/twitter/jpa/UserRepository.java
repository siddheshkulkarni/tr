package com.twitter.app.siddhesh.kulkarni.twitter.jpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.twitter.app.siddhesh.kulkarni.twitter.pojo.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	//Optional<User> findByUsername(String username);
	//@Query("SELECT userId FROM user u where u.username = :username AND u.password = :password")
    //public Optional<User> findByUsernameAndPassword(@Param("username") String username, 
                                                   // @Param("password") String password);
}
