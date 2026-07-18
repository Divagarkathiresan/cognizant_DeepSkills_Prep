package com.cognizant.orm_learn.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.orm_learn.Models.Skill;
import com.cognizant.orm_learn.Repository.SkillRepository;

@Service
public class SkillService {
    @Autowired
    private SkillRepository skillRepository;

    public Skill addNewSkill(Skill skill){
        return skillRepository.save(skill);
    }
}
