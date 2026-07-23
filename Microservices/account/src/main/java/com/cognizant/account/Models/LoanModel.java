package com.cognizant.account.Models;

public class LoanModel {

    private String number;
    private String type;
    private Long loan;
    private Long emi;
    private Long tenure;

    public LoanModel() {
    }

    public LoanModel(String number, String type, Long loan, Long emi, Long tenure) {
        this.number = number;
        this.type = type;
        this.loan = loan;
        this.emi = emi;
        this.tenure = tenure;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getLoan() {
        return loan;
    }

    public void setLoan(Long loan) {
        this.loan = loan;
    }

    public Long getEmi() {
        return emi;
    }

    public void setEmi(Long emi) {
        this.emi = emi;
    }

    public Long getTenure() {
        return tenure;
    }

    public void setTenure(Long tenure) {
        this.tenure = tenure;
    }

    

    
}
