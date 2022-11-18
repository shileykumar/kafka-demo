package com.sunglowsys.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    @KafkaListener(topics = "test", groupId = "testid")
    public void consume(String message) {
        System.out.println("message consumed : "+message);
    }
}
