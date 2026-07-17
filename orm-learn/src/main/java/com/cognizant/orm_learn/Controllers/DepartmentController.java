package com.cognizant.orm_learn.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.orm_learn.Models.Department;
import com.cognizant.orm_learn.Service.DepartmentService;

@RestController
@RequestMapping("/Department")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping
	public ResponseEntity<?> addNewDepartment(@RequestBody Department department){
		return ResponseEntity.status(201).body("New Department created \n"+departmentService.addNewDepartment(department));
	}
	
	@GetMapping
	public ResponseEntity<?> getAllDepartments(){
		return ResponseEntity.status(200).body(departmentService.getAllDepartments());
	}
}
