# springaccountapi


## Use of ResultSetExtractor

    package com.arun.springaccountapi.dao.mapper;
    import java.util.Date;
    
    import com.arun.springaccountapi.model.Account;
    import com.arun.springaccountapi.model.Container;
    import com.arun.springaccountapi.model.Site;
    import org.springframework.dao.DataAccessException;
    import org.springframework.jdbc.core.ResultSetExtractor;
    
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;
    
    public class AccountResultSetExtractor implements ResultSetExtractor<List<Account>> {
    
        @Override
        public List<Account> extractData(ResultSet rs) throws SQLException, DataAccessException {
            Map<String, Account> accountMap = new HashMap<>();
            Map<String, List<Site>> siteMap = new HashMap<>();
            List<Site> sites = new ArrayList<>();
            List<Container> containers = new ArrayList<>();
            List<Account> accounts = new ArrayList<>();
            Account account = new Account();
            Site site = new Site();
    
            while (rs.next()) {
                final String accountId = rs.getString("accountid");
                final String siteId = rs.getString("siteId");
    
                boolean isAccountIdPresent = accountMap.containsKey(accountId);
                final boolean isSitePresent = siteMap.containsKey(siteId);
    
                if (!isAccountIdPresent) {
                    /**
                     * if its a new account
                     */
                    account = new Account();
                    account = getAccountDetails(rs, account);
                    accountMap.put(accountId, account);
                    sites = new ArrayList<>();
                    site = new Site();
                    getSiteDetails(rs, site);
    
                    Container container = getContainerDetails(rs);
                    containers = new ArrayList<>();
                    containers.add(container);
    
                    site.setContainers(containers);
                } else if (isSitePresent) {
    
                    /**
                     * Site already present
                     */
    
                    Container container = getContainerDetails(rs);
                    containers.add(container);
    
                    site.setContainers(containers);
                    boolean isSitePresentInList = sites.contains(site);
    
                    if (isSitePresentInList) {
                        sites.remove(site);
                    }
                } else {
    
                    /**
                     * Its a new Site
                     */
                    site = new Site();
                    site = getSiteDetails(rs, site);
                    containers = new ArrayList<>();
                    Container container = getContainerDetails(rs);
                    containers.add(container);
                    site.setContainers(containers);
    
                }
    
                sites.add(site);
                siteMap.put(siteId, sites);
                account.setSites(sites);
                final boolean isAccountPresent = accounts.contains(account);
                if (isAccountPresent) {
                    accounts.remove(account);
                }
                accounts.add(account);
            }
            return accounts;
        }
    
        private Account getAccountDetails(ResultSet rs, Account account) throws SQLException {
    
            account.setId(rs.getString("accountid"));
            account.setAccountName(rs.getString("accountname"));
            account.setAccountStatus(rs.getString("accountStatus"));
            account.setAccountStartDate(rs.getDate("accountStartDate"));
            account.setAccountEndDate(rs.getDate("accountEndDate"));
            return account;
        }
    
        private Site getSiteDetails(ResultSet rs, Site site) throws SQLException {
            site.setId(rs.getString("siteid"));
            site.setName(rs.getString("sitename"));
            site.setLocation(rs.getString("location"));
            site.setStartDate(rs.getDate("sitestartDate"));
            site.setEndDate(rs.getDate("siteendDate"));
            site.setStatus(rs.getString("sitestatus"));
            return site;
        }
    
        private Container getContainerDetails(ResultSet rs) throws SQLException {
            Container container = new Container();
            container.setId(rs.getString("containerid"));
            container.setName(rs.getString("containername"));
            container.setType(rs.getString("containertype"));
            container.setStatus(rs.getString("containerstatus"));
            container.setStartDate(rs.getDate("startDate"));
            container.setEndDate(rs.getDate("endDate"));
    
            return container;
        }
    }
 
