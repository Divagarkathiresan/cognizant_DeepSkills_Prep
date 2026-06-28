package com.divagar.junit.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divagar.junit.Models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
    
}