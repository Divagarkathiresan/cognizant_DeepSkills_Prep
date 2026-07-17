package com.cognizant.orm_learn.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.orm_learn.Models.Employee;
import com.cognizant.orm_learn.Service.EmployeeService;

@RestController
@RequestMapping("/Employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public ResponseEntity<?> addNewEmployee(@RequestBody Employee employee){
		return ResponseEntity.status(201).body("Employee Created" + employeeService.addNewEmployee(employee));
	}
	
	@GetMapping
	public ResponseEntity<?> getAllEmployees(){
		return ResponseEntity.status(200).body(employeeService.getAllEmployees());
	}
}
