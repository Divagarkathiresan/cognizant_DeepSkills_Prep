package com.cognizant.orm_learn.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.orm_learn.Models.Country;
import com.cognizant.orm_learn.Repository.CountryRepository;

@Service
public class CountryService {
	@Autowired
	private CountryRepository countryRepo;
	
	public Country saveCountry(Country country) {
		return countryRepo.save(country);
	}
	
	public List<Country> getAll(){
		return countryRepo.findAll();
	}
	
	public Country getByCode(String code) {
		return countryRepo.findByCode(code);
	}
}
