package com.cognizant.orm_learn.DTO;

public class EmployeeSkillRequest {
    private Integer em_id;
    private Integer sk_id;
    
    public EmployeeSkillRequest(Integer em_id, Integer sk_id) {
        this.em_id = em_id;
        this.sk_id = sk_id;
    }
    public Integer getEm_id() {
        return em_id;
    }
    public void setEm_id(Integer em_id) {
        this.em_id = em_id;
    }
    public Integer getSk_id() {
        return sk_id;
    }
    public void setSk_id(Integer sk_id) {
        this.sk_id = sk_id;
    }
    
}
