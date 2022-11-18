package com.sunglowsys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {
    public static final String topic = "test";

    @Autowired
    private KafkaTemplate<String, String> template;

    public void publish(String message) {
        System.out.println("Message publish to topic :"+ topic);
        this.template.send(topic,message);
    }
}
