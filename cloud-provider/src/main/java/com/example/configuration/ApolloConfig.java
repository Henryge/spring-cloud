package com.example.configuration;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableApolloConfig
public class ApolloConfig {

    @Value("${cloud.provider.env}")
    private String env;

    @Value("${rocketmq.producer.namesrvAddr}")
    private String rocketmqNamesrvAddr;

    @Value("${rocketmq.producer.topicName}")
    private String rocketmqTopicName;

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getRocketmqNamesrvAddr() {
        return rocketmqNamesrvAddr;
    }

    public void setRocketmqNamesrvAddr(String rocketmqNamesrvAddr) {
        this.rocketmqNamesrvAddr = rocketmqNamesrvAddr;
    }

    public String getRocketmqTopicName() {
        return rocketmqTopicName;
    }

    public void setRocketmqTopicName(String rocketmqTopicName) {
        this.rocketmqTopicName = rocketmqTopicName;
    }
}
