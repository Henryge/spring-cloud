package com.example.rocketmq.configuration;

import com.example.configuration.ApolloConfig;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.MessageExt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.List;

@Configuration
public class RocketMQConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(RocketMQConfiguration.class);

    @Resource
    ApolloConfig apolloConfig;

    @Bean
    public DefaultMQProducer defaultMQProducer() throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("SPRING_CLOUD_DEMO");
        producer.setNamesrvAddr(apolloConfig.getRocketmqNamesrvAddr());
        producer.setInstanceName(String.valueOf(System.currentTimeMillis()));
        producer.setVipChannelEnabled(false);
        producer.setRetryTimesWhenSendAsyncFailed(10);
        producer.start();
        logger.info("RocketMQ Producer inited ...");
        return producer;
    }

    @Bean
    public DefaultMQPushConsumer defaultMQPushConsumer() throws Exception {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("SPRING_CLOUD_DEMO");
        consumer.setNamesrvAddr(apolloConfig.getRocketmqNamesrvAddr());
        consumer.setInstanceName(String.valueOf(System.currentTimeMillis()));

        consumer.subscribe(apolloConfig.getRocketmqTopicName(), "*");
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
                try {
                    MessageExt message = list.get(0);
                    logger.info("Start consumer " + message.getTopic());
                    String clientMessage = new String(message.getBody(), "UTF-8");
                    logger.info("Consumer get message: " + clientMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });

        logger.info("RocketMQ Consumer inited ...");
        consumer.start();
        return consumer;
    }
}
