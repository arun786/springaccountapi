package com.arun.springaccountapi.service;

import com.arun.springaccountapi.dao.AccountDao;
import com.arun.springaccountapi.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> getAllAccount() {
        return accountDao.getAllAccount();
    }

    @Override
    public List<Account> getAccount(String accountId) {
        return accountDao.getAccount(accountId);
    }

    @Override
    public List<Account> getAccount(String accountId, boolean isAccountOnly, boolean isSiteOnly) {
        return accountDao.getAccount(accountId, isAccountOnly, isSiteOnly);
    }
}
