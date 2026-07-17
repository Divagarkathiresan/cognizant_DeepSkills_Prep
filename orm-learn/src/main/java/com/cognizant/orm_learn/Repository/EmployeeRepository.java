package com.cognizant.orm_learn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.orm_learn.Models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
