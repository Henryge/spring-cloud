package com.shie.idveri.configuration;

import com.shie.idveri.service.PersonService;
import com.shie.idveri.service.impl.PersonServiceImpl;

//@Configuration
public class MyConfigurate {

//    @Bean
    public PersonService invokePersonService() {
        return new PersonServiceImpl();
    }

}
