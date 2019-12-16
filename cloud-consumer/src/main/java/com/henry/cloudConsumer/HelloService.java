package com.henry.cloudConsumer;

import com.alibaba.fastjson.JSONObject;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Configuration
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${provider.url}")
    String providerUrl;

    @Value("${hello.path}")
    String helloPath;

    @HystrixCommand(fallbackMethod = "helloFallback", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    public String helloWorld() {
        JSONObject postData = new JSONObject();
        postData.put("transId", "404848");

        String result = "";
        try {
            result = restTemplate.postForEntity(providerUrl + helloPath, postData, String.class).getBody();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public String helloFallback() {
        return "error";
    }

}
