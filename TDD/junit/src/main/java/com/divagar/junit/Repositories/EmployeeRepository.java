package com.divagar.junit.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.divagar.junit.Models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

    @Query("Select e from Employee e where e.dept=:dept")
    List<Employee> getAllEmployeesbyDepartment(String dept);
}
