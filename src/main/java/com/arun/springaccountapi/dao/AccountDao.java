package com.arun.springaccountapi.dao;

import com.arun.springaccountapi.model.Account;

import java.util.List;

public interface AccountDao {

    List<Account> getAllAccount();

    List<Account> getAccount(String accountId);
}
