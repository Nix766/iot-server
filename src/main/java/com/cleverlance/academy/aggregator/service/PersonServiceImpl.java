package com.cleverlance.academy.aggregator.service;

import com.cleverlance.academy.aggregator.model.Person;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class PersonServiceImpl implements  PersonService{

    @Override
    public void savePerson(@Valid Person person) {
        System.out.println("ukladame osobu");
    }
}