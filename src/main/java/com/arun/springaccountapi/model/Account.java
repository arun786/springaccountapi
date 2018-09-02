package com.arun.springaccountapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String id;
    private String accountName;
    private String accountStatus;
    private Date accountStartDate;
    private Date accountEndDate;
    private List<Site> sites;
}
