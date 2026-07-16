package com.cognizant.orm_learn.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.orm_learn.Service.CountryService;
import com.cognizant.orm_learn.Models.Country;

import java.util.*;


@RestController
@RequestMapping("/Country")
public class CountryController{
	@Autowired
	private CountryService countryService;
	
	@PostMapping()
	public ResponseEntity<?> saveCountry(@RequestBody Country country){
		return ResponseEntity.status(200).body(countryService.saveCountry(country));
	}
	
	@GetMapping()
	public ResponseEntity<?> getAll(){
		return ResponseEntity.status(200).body(countryService.getAll());
	}
	
	@GetMapping("/By")
	public ResponseEntity<?> getByCode(@RequestParam String code){
		Country country=countryService.getByCode(code);
		if(country != null) return ResponseEntity.status(200).body(country);
		else return ResponseEntity.status(404).body("Country with code { "+code+" } Not Found");
	}
	
}