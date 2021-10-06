package com.dp.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private static final String TOPIC = "NewTopic";

    @Autowired
    KafkaTemplate<String, Book> kafkaTemplate;

    @GetMapping("/publish")
    public String publishMessage(@RequestBody Book book) {
       kafkaTemplate.send(TOPIC, book);
       return "Published Successfully";
    }
}
