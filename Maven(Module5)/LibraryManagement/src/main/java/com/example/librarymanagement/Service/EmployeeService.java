package com.example.librarymanagement.Service;

import com.example.librarymanagement.Repository.EmployeeRepository;

public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService() {
    }

    public void setterMethodForEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void show() {
        System.out.println("Employee Service created");
        employeeRepository.show();
    }
}