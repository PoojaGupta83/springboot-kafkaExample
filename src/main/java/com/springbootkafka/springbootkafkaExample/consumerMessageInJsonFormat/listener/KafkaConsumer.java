package com.springbootkafka.springbootkafkaExample.consumerMessageInJsonFormat.listener;

import com.springbootkafka.springbootkafkaExample.consumerMessageInJsonFormat.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "KafkaExample", groupId= "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }



}