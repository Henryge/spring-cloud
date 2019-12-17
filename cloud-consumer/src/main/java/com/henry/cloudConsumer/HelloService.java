package com.henry.cloudConsumer;

import com.alibaba.fastjson.JSONObject;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Configuration
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @Resource
    private ApolloConfig apolloConfig;

    @HystrixCommand(fallbackMethod = "helloFallback", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    public String helloWorld() {
        JSONObject postData = new JSONObject();
        postData.put("transId", "404848");

        String result = "";
        try {
            result = restTemplate.postForEntity(apolloConfig.getProviderUrl() + apolloConfig.getHelloPath(), postData, String.class).getBody();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public String helloFallback() {
        return "error";
    }

}
