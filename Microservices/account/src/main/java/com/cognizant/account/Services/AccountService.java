package com.cognizant.account.Services;
import java.util.*;
import org.springframework.stereotype.Service;

import com.cognizant.account.Models.AccountModel;

@Service
public class AccountService {
    private List<AccountModel> accounts;

    public AccountService() {
        accounts = new ArrayList<>();
        accounts.add(new AccountModel("ACC1001", "Savings", 50000L));
        accounts.add(new AccountModel("ACC1002", "Current", 125000L));
        accounts.add(new AccountModel("ACC1003", "Savings", 80000L));
    }

    public AccountModel getAccount(String number) {

        for (AccountModel account : accounts) {

            if (account.getNumber().equalsIgnoreCase(number)) {
                return account;
            }

        }

        return null;
    }

    public List<AccountModel> getAllAccounts() {
        return accounts;
    }
}
