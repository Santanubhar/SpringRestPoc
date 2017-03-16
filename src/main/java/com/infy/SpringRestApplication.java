package com.infy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestApplication {
	final static Logger logger = LoggerFactory.getLogger(SpringRestApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringRestApplication.class, args);
		logger.warn("This is warn : ");
		logger.error("This is error : " );
	}
}
