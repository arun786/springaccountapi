package com.arun.springaccountapi.controller;

import com.arun.springaccountapi.model.Account;
import com.arun.springaccountapi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/accounts/v1/account")
    public List<Account> getAllAccount() {
        return accountService.getAllAccount();
    }


    @GetMapping("/accounts/v1/account/{accountId}")
    List<Account> getAccount(@PathVariable(name = "accountId") String accountId) {
        return accountService.getAccount(accountId);
    }

    @GetMapping("/accounts/v2/account/{accountId}")
    List<Account> getOnlyAccount(@PathVariable(name = "accountId") String accountId,
                                 @RequestParam(name = "account") String account) {
        boolean isAccountOnly = false;
        boolean isSiteOnly = false;
        List<String> types = Arrays.asList(account.split(","));

        if (types.contains("account")) {
            isAccountOnly = true;
        }

        if (types.contains("site")) {
            isSiteOnly = true;
        }

        return accountService.getAccount(accountId, isAccountOnly, isSiteOnly);
    }
}
