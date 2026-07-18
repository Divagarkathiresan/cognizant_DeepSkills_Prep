package com.cognizant.orm_learn.Models;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
@Table(name="skill")
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="skill_id")
	private Integer sk_id;
	
	@Column(name="skill_name")
	private String sk_name;

	@OneToMany(mappedBy = "skill")
	@JsonManagedReference("skill-employeeSkill")
	private List<EmployeeSkill> employeeSkills;
	
	public Skill() {
		
	}

	public Skill(Integer sk_id, String sk_name, List<EmployeeSkill> employeeSkills) {
		this.sk_id = sk_id;
		this.sk_name = sk_name;
		this.employeeSkills = employeeSkills;
	}

	public Integer getSk_id() {
		return sk_id;
	}

	public void setSk_id(Integer sk_id) {
		this.sk_id = sk_id;
	}

	public String getSk_name() {
		return sk_name;
	}

	public void setSk_name(String sk_name) {
		this.sk_name = sk_name;
	}

	public List<EmployeeSkill> getEmployeeSkills() {
		return employeeSkills;
	}

	public void setEmployeeSkills(List<EmployeeSkill> employeeSkills) {
		this.employeeSkills = employeeSkills;
	}
	
	
	
}
