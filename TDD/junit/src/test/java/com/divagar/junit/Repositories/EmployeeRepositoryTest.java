package com.divagar.junit.Repositories;

import com.divagar.junit.Models.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class EmployeeRepositoryTest{

    @Autowired
    EmployeeRepository employeeRepository;

    @BeforeEach
    public void setDataBaseEmpty(){
        employeeRepository.deleteAll();
    }

    @Test
    public void shouldSaveAnEmployee(){
        //arrange
        Employee employee=new Employee(null,"Alex","IT");
        //act
        Employee savedEmployee=employeeRepository.save(employee);
        //assert
        assertNotNull(savedEmployee);
        assertEquals(employee.getEmployeeName(), savedEmployee.getEmployeeName());
    }

    @Test
    public void shouldReturnAllEmployeeByDepartment(){

        employeeRepository.deleteAll();

        Employee employee1=new Employee(null,"Alex","IT");
        employeeRepository.save(employee1);
        Employee employee2=new Employee(null,"Diva","CSE");
        employeeRepository.save(employee2);

        List<Employee> retrievedListFromRepo=employeeRepository.getAllEmployeesbyDepartment("IT");

        assertEquals(1, retrievedListFromRepo.size());
        assertEquals("Alex", retrievedListFromRepo.get(0).getEmployeeName());
    }
}