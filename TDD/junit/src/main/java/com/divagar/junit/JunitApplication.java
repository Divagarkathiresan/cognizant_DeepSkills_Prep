package com.divagar.junit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JunitApplication {
	private static final Logger logger=LoggerFactory.getLogger(JunitApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(JunitApplication.class, args);
		logger.info("Main Method executed");
		System.out.println("Main method executed");
	}

}
