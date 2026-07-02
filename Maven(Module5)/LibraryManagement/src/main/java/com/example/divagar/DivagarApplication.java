package com.example.divagar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DivagarApplication {
	private static final Logger logger=LoggerFactory.getLogger(DivagarApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DivagarApplication.class, args);
		logger.info("Main method executed");
		System.out.println("Main method executed");

	}

}
