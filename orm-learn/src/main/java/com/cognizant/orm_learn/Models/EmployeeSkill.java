package com.cognizant.orm_learn.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
@Table(name="employee_skill")
public class EmployeeSkill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="employe_skill_id")
	private Integer es_id;
	
	@ManyToOne
	@JoinColumn(name="employee_id")
	@JsonBackReference
	private Employee employee;
	
	@ManyToOne
	@JoinColumn(name="skill_id")
	@JsonBackReference
	private Skill skill;
	
	
	public EmployeeSkill(Integer es_id, Employee employee, Skill skill) {
		this.es_id = es_id;
		this.employee = employee;
		this.skill = skill;
	}

	public Integer getEs_id() {
		return es_id;
	}

	public void setEs_id(Integer es_id) {
		this.es_id = es_id;
	}
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Skill getSkill() {
		return skill;
	}


	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public EmployeeSkill() {
		
	}
}
