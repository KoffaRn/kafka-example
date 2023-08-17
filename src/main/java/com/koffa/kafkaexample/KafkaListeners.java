package com.koffa.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "example",groupId = "group_id")
    void listener(String data) {
        System.out.println("Listener received data: " + data);
    }
}
