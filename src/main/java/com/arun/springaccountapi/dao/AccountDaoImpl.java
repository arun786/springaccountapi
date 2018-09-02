package com.arun.springaccountapi.dao;

import com.arun.springaccountapi.dao.mapper.AccountResultSetExtractor;
import com.arun.springaccountapi.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public List<Account> getAllAccount() {
        String sql = "select * from Account";
        return namedParameterJdbcTemplate.query(sql, new AccountResultSetExtractor());
    }
}
