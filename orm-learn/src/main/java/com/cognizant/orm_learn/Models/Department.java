package com.cognizant.orm_learn.Models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;


@Entity
@Table(name="department")

public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="department_id")
	private Integer dp_id;
	@Column(name="department_name")
	private String dp_name;
	@OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
	@JsonManagedReference("employee-department")
	private List<Employee> employees;

	public Department(){}

	public Department(Integer dp_id, String dp_name, List<Employee> employees) {
		this.dp_id = dp_id;
		this.dp_name = dp_name;
		this.employees = employees;
	}

	public Integer getDp_id() {
		return dp_id;
	}

	public void setDp_id(Integer dp_id) {
		this.dp_id = dp_id;
	}

	public String getDp_name() {
		return dp_name;
	}

	public void setDp_name(String dp_name) {
		this.dp_name = dp_name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
}
