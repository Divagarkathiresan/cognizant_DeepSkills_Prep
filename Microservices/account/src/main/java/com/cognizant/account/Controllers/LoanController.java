package com.cognizant.account.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.Models.LoanModel;
import com.cognizant.account.Services.LoanService;

@RestController
@RequestMapping("/loans")
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @GetMapping("/{number}")
    public LoanModel getLoan(@PathVariable String number) {
        return loanService.getLoan(number);
    }

    @GetMapping
    public List<LoanModel> getAllLoans() {
        return loanService.getAllLoans();
    }

    @PostMapping
    public LoanModel addLoan(@RequestBody LoanModel loan) {
        return loanService.addLoan(loan);
    }
}
