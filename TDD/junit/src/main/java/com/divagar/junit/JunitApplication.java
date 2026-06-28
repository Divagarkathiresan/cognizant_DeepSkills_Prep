package com.divagar.junit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JunitApplication {
	public static void main(String[] args) {
		SpringApplication.run(JunitApplication.class, args);
		System.out.println("Main method executed");
	}

}
