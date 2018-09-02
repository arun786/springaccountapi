package com.arun.springaccountapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Site {
    private String id;
    private String name;
    private String location;
    private Date startDate;
    private Date endDate;
    private String status;
    private List<Container> containers;
}
