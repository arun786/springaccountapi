package com.arun.springaccountapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Container {
    private String id;
    private String name;
    private String type;
    private String status;
    private Date startDate;
    private Date endDate;
}
