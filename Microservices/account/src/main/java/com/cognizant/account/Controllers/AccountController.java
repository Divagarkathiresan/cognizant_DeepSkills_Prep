package com.cognizant.account.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.account.Models.AccountModel;
import com.cognizant.account.Services.AccountService;


@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/{number}")
    public AccountModel getAccount(@PathVariable String number) {

        return accountService.getAccount(number);

    }

    @GetMapping
    public List<AccountModel> getAllAccounts() {
        return accountService.getAllAccounts();
    }

}