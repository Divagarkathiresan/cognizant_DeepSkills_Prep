package com.cognizant.orm_learn.Models;

import java.sql.Date;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="employee_id")
	private Integer em_id;
	@Column(name="employee_name")
	private String em_name;
	@Column(name="employee_salary")
	private Float em_salary;
	@Column(name="employee_permanent")
	private boolean em_permanent;
	@Column(name="employee_dateOfBirth")
	private Date em_date_of_birth;
	@ManyToOne
	@JoinColumn(name="employee_department_id")
	@JsonBackReference
	private Department department;
	
	public Employee() {
		
	}
	
	public Employee(Integer em_id, String em_name, Float em_salary, boolean em_permanent, Date em_date_of_birth,
			Department department) {
		this.em_id = em_id;
		this.em_name = em_name;
		this.em_salary = em_salary;
		this.em_permanent = em_permanent;
		this.em_date_of_birth = em_date_of_birth;
		this.department = department;
	}

	public Integer getEm_id() {
		return em_id;
	}
	public void setEm_id(Integer em_id) {
		this.em_id = em_id;
	}
	public String getEm_name() {
		return em_name;
	}
	public void setEm_name(String em_name) {
		this.em_name = em_name;
	}
	public Float getEm_salary() {
		return em_salary;
	}
	public void setEm_salary(Float em_salary) {
		this.em_salary = em_salary;
	}
	public boolean isEm_permanent() {
		return em_permanent;
	}
	public void setEm_permanent(boolean em_permanent) {
		this.em_permanent = em_permanent;
	}
	public Date getEm_date_of_birth() {
		return em_date_of_birth;
	}
	public void setEm_date_of_birth(Date em_date_of_birth) {
		this.em_date_of_birth = em_date_of_birth;
	}
//	public Integer getEm_dp_id() {
//		return em_dp_id;
//	}
//	public void setEm_dp_id(Integer em_dp_id) {
//		this.em_dp_id = em_dp_id;
//	}
}
