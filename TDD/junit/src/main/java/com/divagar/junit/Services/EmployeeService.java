package com.divagar.junit.Services;

import org.springframework.stereotype.Service;

import com.divagar.junit.Models.Employee;
import com.divagar.junit.Repositories.EmployeeRepository;

@Service
public class EmployeeService{
    private EmployeeRepository employeeRepository;

    EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(Integer id){
        return employeeRepository.findById(id).orElseThrow(()-> new RuntimeException("Employee not found"));
    }
}
