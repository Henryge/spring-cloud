package com.example.configuration;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableApolloConfig
public class ApolloConfig {

    @Value("${cloud.provider.env}")
    private String env;

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }
}
