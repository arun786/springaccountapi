package com.arun.springaccountapi.dao;

import com.arun.springaccountapi.dao.mapper.AccountResultSetExtractor;
import com.arun.springaccountapi.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
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
        return namedParameterJdbcTemplate.query(sql, new AccountResultSetExtractor(false, false));
    }

    @Override
    public List<Account> getAccount(String accountId) {
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("accountId", accountId);

        String sql = "select * from Account where accountid = :accountId";
        return namedParameterJdbcTemplate.query(sql, mapSqlParameterSource, new AccountResultSetExtractor(false, false));
    }

    @Override
    public List<Account> getAccount(String accountId, boolean isAccountOnly, boolean isSiteOnly) {
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("accountId", accountId);

        String sql = "select * from Account where accountid = :accountId";

        return namedParameterJdbcTemplate.query(sql, mapSqlParameterSource, new AccountResultSetExtractor(isAccountOnly, isSiteOnly));
    }
}
