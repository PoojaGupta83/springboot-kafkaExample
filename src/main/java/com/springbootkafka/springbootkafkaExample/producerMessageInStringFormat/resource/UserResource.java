package com.springbootkafka.springbootkafkaExample.producerMessageInStringFormat.resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kafka")
public class UserResource {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "KafkaExample";

    @PostMapping("/publish/{message}")
    public String post(@PathVariable("message") final String message) {
        kafkaTemplate.send(TOPIC, message);
        return "Published successfully";
    }


}