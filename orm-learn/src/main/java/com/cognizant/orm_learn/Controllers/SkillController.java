package com.cognizant.orm_learn.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.orm_learn.Models.Skill;
import com.cognizant.orm_learn.Service.SkillService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/Skill")
public class SkillController {
    @Autowired
    private SkillService skillService;

    @PostMapping
    public ResponseEntity<?> addNewSkill(@RequestBody Skill skill){
        return ResponseEntity.status(201).body(skillService.addNewSkill(skill));
    }
}
