package com.cognizant.orm_learn.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.orm_learn.Models.Department;
import com.cognizant.orm_learn.Repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department addNewDepartment(Department dept) {
		return departmentRepository.save(dept);
	}
	
	public List<Department> getAllDepartments(){
		return departmentRepository.findAll();
	}
}
