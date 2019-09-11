package com.henry.springbootcommon.configuration;

import com.henry.springbootcommon.service.PersonService;
import com.henry.springbootcommon.service.impl.PersonServiceImpl;

//@Configuration
public class MyConfigurate {

//    @Bean
    public PersonService invokePersonService() {
        return new PersonServiceImpl();
    }

}
