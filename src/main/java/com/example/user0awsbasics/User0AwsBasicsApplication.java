package com.example.user0awsbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class User0AwsBasicsApplication {
	private static final Logger LOG = LoggerFactory.getLogger(User0AwsBasicsApplication.class);
	public static void main(String[] args) {
        LOG.info("*******Application Starting*******");
		SpringApplication.run(User0AwsBasicsApplication.class, args);
		LOG.info("*******Application Started*******");
	}
}
