package com.cognizant.orm_learn;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.orm_learn.Models.Country;
import com.cognizant.orm_learn.Service.CountryService;

import java.util.*;

import org.slf4j.*;

@SpringBootApplication
public class OrmLearnApplication {
	private static CountryService countryService;

	public static final Logger logger = LoggerFactory.getLogger(OrmLearnApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(OrmLearnApplication.class, args);
		System.out.println("Main method executed");
		logger.info("Main method executed sucessfully !! ");
	}
	
	public static void testGetAllCountries() {
		logger.info("Start");
		List<Country> list=countryService.getAll();
		logger.debug("Countries = {}",list);
		logger.info("End");
		
	}
}