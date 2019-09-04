package com.henry.ribbonconsumer;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Configuration
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloWorld() {
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
    }

    public String helloFallback() {
        return "error";
    }

}
