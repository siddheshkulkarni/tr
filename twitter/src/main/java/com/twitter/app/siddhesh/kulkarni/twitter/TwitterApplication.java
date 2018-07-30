package com.twitter.app.siddhesh.kulkarni.twitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.twitter.app.siddhesh.kulkarni.twitter.jpa")
public class TwitterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterApplication.class, args);
	}
}
