package com.cognizant.orm_learn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.orm_learn.Models.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{
}
