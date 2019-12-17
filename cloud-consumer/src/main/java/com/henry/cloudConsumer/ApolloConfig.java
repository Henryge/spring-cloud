package com.henry.cloudConsumer;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableApolloConfig
public class ApolloConfig {

    @Value("${provider.url}")
    private String providerUrl;

    @Value("${hello.path}")
    private String helloPath;

    public String getProviderUrl() {
        return providerUrl;
    }

    public void setProviderUrl(String providerUrl) {
        this.providerUrl = providerUrl;
    }

    public String getHelloPath() {
        return helloPath;
    }

    public void setHelloPath(String helloPath) {
        this.helloPath = helloPath;
    }
}
