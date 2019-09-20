package com.henry.springbootcommon.controller;

import com.henry.springbootcommon.model.Person;
import com.henry.springbootcommon.service.PersonService;
import com.henry.springbootcommon.util.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    private final static Logger logger = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    PersonService personService;

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Person> getAll() {
        List<Person> allPerson = personService.getAll();
        redisUtil.set("allPerson", allPerson);
        redisUtil.setString("loadFlag", "1");
        List<Person> personList = (List<Person>)redisUtil.get("allPerson");
        logger.info("Load " + personList.size() + " persons form the redis. And the the first name is " + personList.get(0).getName());
        logger.info("Load Flag is " + redisUtil.getString("loadFlag"));
        return allPerson;
    }

}
