package com.divagar.junit.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.divagar.junit.Models.Employee;
import com.divagar.junit.Repositories.EmployeeRepository;

@Service
public class EmployeeService{
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(Integer id){
        return employeeRepository.findById(id).orElse(null);
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public void deleteEmployeeById(Integer id){
        employeeRepository.deleteById(id);
    }
}
