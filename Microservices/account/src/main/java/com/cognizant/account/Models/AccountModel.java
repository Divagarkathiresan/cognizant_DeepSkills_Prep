package com.cognizant.account.Models;

public class AccountModel {
     private String number;
    private String type;
    private Long  balance;

    public AccountModel() {
    }

    public AccountModel(String number, String type, Long balance) {
        this.number = number;
        this.type = type;
        this.balance = balance;
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
    public Long getBalance() {
        return balance;
    }
    public void setBalance(Long balance) {
        this.balance = balance;
    }
}
