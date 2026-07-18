package com.cognizant.orm_learn.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.orm_learn.Models.EmployeeSkill;
import com.cognizant.orm_learn.Repository.EmployeeSkillRepository;

@Service
public class EmployeeSkillService {
    @Autowired
    private EmployeeSkillRepository employeeSkillRepository;

    public EmployeeSkill addNewEmployeeSkill(EmployeeSkill employeeSkill){
        return employeeSkillRepository.save(employeeSkill);
    }
}
