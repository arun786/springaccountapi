package com.arun.springaccountapi.controller;

import com.arun.springaccountapi.model.Account;
import com.arun.springaccountapi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/accounts/v1/account")
    public List<Account> getAllAccount() {
        return accountService.getAllAccount();
    }
}
