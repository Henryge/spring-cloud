package com.henry.springbootcommon.controller;

import com.henry.springbootcommon.model.Person;
import com.henry.springbootcommon.service.PersonService;
import com.henry.springbootcommon.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Person> getAll() {
        redisUtil.set((Object)"name", "henry");
        return personService.getAll();
    }

}
