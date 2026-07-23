package com.cognizant.account.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.account.Models.LoanModel;

@Service
public class LoanService {
    private List<LoanModel> loans;

    public LoanService() {
        loans = new ArrayList<>();
        loans.add(new LoanModel("LN1001", "Home", 1000000L, 20000L, 60L));
        loans.add(new LoanModel("LN1002", "Car", 600000L, 15000L, 36L));
        loans.add(new LoanModel("LN1003", "Education", 400000L, 12000L, 48L));
    }

    public LoanModel getLoan(String number) {
        for (LoanModel loan : loans) {
            if (loan.getNumber().equalsIgnoreCase(number)) {
                return loan;
            }
        }
        return null;
    }

    public List<LoanModel> getAllLoans() {
        return loans;
    }

    public LoanModel addLoan(LoanModel loan) {
        loans.add(loan);
        return loan;
    }
}
