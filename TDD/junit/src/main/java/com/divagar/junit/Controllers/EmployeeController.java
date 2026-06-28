package com.divagar.junit.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divagar.junit.Services.EmployeeService;
import com.divagar.junit.Models.Employee;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/employees")
public class EmployeeController{
    private EmployeeService employeeService;

    EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    @PostMapping("/post")
    public ResponseEntity<Employee> addEmployeeToDatabase(@RequestBody Employee employee){
        Employee savedEmployee=employeeService.saveEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEmployee);
    }
    
    @GetMapping("/get/{id}")
    public ResponseEntity<Employee> retrieveEmployeeById(@PathVariable Integer id){
        Employee retrievedEmployee=employeeService.getEmployeeById(id);
        return ResponseEntity.status(HttpStatus.OK).body(retrievedEmployee);
    }


}