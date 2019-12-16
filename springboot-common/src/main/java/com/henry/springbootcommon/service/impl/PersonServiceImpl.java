package com.shie.idveri.service.impl;

import com.shie.idveri.mapper.PersonMapper;
import com.shie.idveri.model.Person;
import com.shie.idveri.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonMapper personMapper;

    @Override
    public List<Person> getAll() {
        return personMapper.getAll();
    }
}
