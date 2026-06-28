package com.divagar.junit.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divagar.junit.Services.EmployeeService;
import com.divagar.junit.Models.Employee;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/employees")
public class EmployeeController{
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    @PostMapping("/post")
    public ResponseEntity<Employee> addEmployeeToDatabase(@RequestBody Employee employee){
        Employee savedEmployee=employeeService.saveEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEmployee);
    }
    
    @GetMapping("/get/{id}")
    public ResponseEntity<?> retrieveEmployeeById(@PathVariable Integer id){
        Employee retrievedEmployee=employeeService.getEmployeeById(id);
        if (retrievedEmployee != null){
            return ResponseEntity.status(HttpStatus.OK).body(retrievedEmployee);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id "+id+" not Found");
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> retrieveAllEmployees(){
        List<Employee> list=employeeService.getAllEmployees();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployeeById(@PathVariable Integer id){
        Employee wannaDeleteEmployee=employeeService.getEmployeeById(id);
        if(wannaDeleteEmployee!=null) {
            employeeService.deleteEmployeeById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Employee deleted");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found");
        }
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<?> updateEmployeeById(@PathVariable Integer id,@RequestBody Employee newEmployee){
        Employee wannaUpdateEmployee=employeeService.getEmployeeById(id);
        if(wannaUpdateEmployee!=null) {
            employeeService.updateEmployeeById(id, newEmployee);
            return ResponseEntity.status(HttpStatus.OK).body(wannaUpdateEmployee);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found");
        }
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity<?> deleteAllEmployees(){
        employeeService.deleteAllEmployee();
        return ResponseEntity.status(HttpStatus.OK).body("All employees deleted");
    }

}