package com.henry.springbootcommon.service.impl;

import com.henry.springbootcommon.mapper.PersonMapper;
import com.henry.springbootcommon.model.Person;
import com.henry.springbootcommon.service.PersonService;
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
