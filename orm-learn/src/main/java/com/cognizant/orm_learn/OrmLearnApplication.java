package com.cognizant.orm_learn;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.*;


@SpringBootApplication
public class OrmLearnApplication {

	public static final Logger logger = LoggerFactory.getLogger(OrmLearnApplication.class);
	
	public static void main(String[] args) {
		
		SpringApplication.run(OrmLearnApplication.class, args);
		System.out.println("Main method executed");
		logger.info("Main method executed");
	}

}
