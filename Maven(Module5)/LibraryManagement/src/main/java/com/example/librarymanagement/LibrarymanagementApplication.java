package com.example.librarymanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibrarymanagementApplication {
	private static final Logger logger=LoggerFactory.getLogger(LibrarymanagementApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LibrarymanagementApplication.class, args);
		logger.info("Main method executed");
	}

}
