package com.divagar.junit.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.divagar.junit.Repositories.EmployeeRepository;
import com.divagar.junit.Services.EmployeeService;
import com.divagar.junit.Models.Employee;

public class EmployeeServiceTest {
    @Mock
    EmployeeRepository employeeRepository;

    @InjectMocks
    EmployeeService service;

    @BeforeEach
    void createObjectForEmployeeRepository(){
       MockitoAnnotations.openMocks(this);
    }

    @Test
    public void shouldSaveEmployee1(){
        //arrange
        Employee employee=new Employee(1,"Divagar","IT");
        //act
        when(employeeRepository.save(any(Employee.class))).thenReturn(employee);
        Employee checkEmployee=service.saveEmployee(employee);
        //assert
        assertEquals(employee.getEmployeeId(), checkEmployee.getEmployeeId());
        verify(employeeRepository).save(checkEmployee);
    }

    @Test
    public void shouldSaveEmployee() {
        Employee emp=new Employee(1,"alex","IT");
        when(employeeRepository.save(any(Employee.class))).thenReturn(emp);

        Employee employee=service.saveEmployee(emp);

        assertEquals(emp.getEmployeeId(), employee.getEmployeeId());
        verify(employeeRepository).save(any(Employee.class));
    }

    @Test
    public void shouldReturnNameCorrectly(){
        Employee emp=new Employee(1,"Alex","IT");
        when(employeeRepository.findById(anyInt())).thenReturn(Optional.of(emp));

        Employee savedEmployee=service.getEmployeeById(1);
        
        assertEquals(emp.getEmployeeName(), savedEmployee.getEmployeeName());
        verify(employeeRepository).findById(1);

    }

    @Test
    public void shouldReturnAllEmployees(){
        Employee emp1=new Employee(1,"Alex","IT");
        Employee emp2=new Employee(2,"Arjun","IT");
        List<Employee> list=Arrays.asList(emp1,emp2);
        when(employeeRepository.findAll()).thenReturn(list);

        List<Employee> savedList=service.getAllEmployees();

        assertEquals(list, savedList);
        verify(employeeRepository,times(1)).findAll();
    }

    @Test
    public void shouldDeleteAnEmployeeById(){
        doNothing().when(employeeRepository).deleteById(anyInt());

        service.deleteEmployeeById(anyInt());

        verify(employeeRepository).deleteById(anyInt());
    }


    // @Test
    // public void shouldReturnAllEmployees(){
    //     Employee employee=new Employee(1,"alex","IT");
    //     when(employeeRepository.findById(anyInt())).thenReturn(Optional.of(employee));

    //     Employee emp=service.getEmployeeById(anyInt());

    //     assertEquals(employee.getEmployeeName(), emp.getEmployeeName());
    //     verify(employeeRepository).findById(anyInt());
    // }
}
