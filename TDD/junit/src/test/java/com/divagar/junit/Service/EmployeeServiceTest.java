package com.divagar.junit.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import com.divagar.junit.Repositories.EmployeeRepository;
import com.divagar.junit.Services.EmployeeService;
import com.divagar.junit.Models.Employee;

public class EmployeeServiceTest {
    EmployeeRepository employeeRepository;
    EmployeeService service;

    @BeforeEach
    void createObjectForEmployeeRepository(){
        employeeRepository=mock(EmployeeRepository.class);
        service=new EmployeeService(employeeRepository);
    }

    @Test
    public void shouldSaveEmployee(){
        //arrange
        Employee employee=new Employee(1,"Divagar");
        when(employeeRepository.save(employee)).thenReturn(employee);
        //act
        Employee checkEmployee=service.saveEmployee(employee);
        //assert
        assertEquals(employee.getEmployeeId(), checkEmployee.getEmployeeId());
    }

    @Test
    public void shouldReturnNameCorrectly(){
        Employee emp=new Employee(1,"Alex");
        when(employeeRepository.findById(emp.getEmployeeId())).thenReturn(Optional.of(emp));

        Employee savedEmployee=service.getEmployeeById(1);
        
        assertEquals(emp.getEmployeeName(), savedEmployee.getEmployeeName());

    }

    @Test
    public void shouldReturnAllEmployees(){
        Employee emp1=new Employee(1,"Alex");
        Employee emp2=new Employee(2,"Arjun");
        List<Employee> list=Arrays.asList(emp1,emp2);
        when(employeeRepository.findAll()).thenReturn(list);

        List<Employee> savedList=service.getAllEmployee();

        assertEquals(list, savedList);
        
    }
}
