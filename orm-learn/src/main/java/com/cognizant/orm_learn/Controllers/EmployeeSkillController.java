package com.cognizant.orm_learn.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.orm_learn.DTO.EmployeeSkillRequest;
import com.cognizant.orm_learn.Models.Employee;
import com.cognizant.orm_learn.Models.EmployeeSkill;
import com.cognizant.orm_learn.Models.Skill;
import com.cognizant.orm_learn.Repository.EmployeeRepository;
import com.cognizant.orm_learn.Repository.SkillRepository;
import com.cognizant.orm_learn.Service.EmployeeSkillService;

@RestController
@RequestMapping("/EmployeeSkill")
public class EmployeeSkillController {
    @Autowired
    private EmployeeSkillService employeeSkillService;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private SkillRepository skillRepository;

    @PostMapping
    public ResponseEntity<?> addNewEmployeeSkill(@RequestBody EmployeeSkillRequest employeeSkillRequest){
        Employee emp=employeeRepository.findById(employeeSkillRequest.getEm_id()).orElseThrow();
        Skill skill=skillRepository.findById(employeeSkillRequest.getSk_id()).orElseThrow();

        EmployeeSkill es=new EmployeeSkill();
        es.setEmployee(emp);
        es.setSkill(skill);

        return ResponseEntity.status(201).body(employeeSkillService.addNewEmployeeSkill(es));
    }
}
