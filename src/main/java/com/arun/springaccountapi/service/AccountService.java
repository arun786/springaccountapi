package com.arun.springaccountapi.service;

import com.arun.springaccountapi.model.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAllAccount();

    List<Account> getAccount(String accountId);

    List<Account> getAccount(String accountId, boolean isAccountOnly, boolean isSiteOnly);
}
