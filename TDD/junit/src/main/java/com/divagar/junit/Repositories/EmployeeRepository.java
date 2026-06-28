package com.divagar.junit.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.divagar.junit.Models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
    
}
