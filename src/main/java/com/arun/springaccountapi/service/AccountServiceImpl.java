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
}