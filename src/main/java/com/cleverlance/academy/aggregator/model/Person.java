package com.cleverlance.academy.aggregator.model;


import lombok.Value;

import javax.validation.constraints.Email;

@Value
public class Person {

    private String firstName;
    private String lastName;
    @Email
    private String mail;
    private String gender;

}
