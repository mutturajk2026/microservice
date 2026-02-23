package com.codedecode.KafkaDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessageToTopic(String message) {
        kafkaTemplate.send("CodeDecodeTopic", message);
    }
}

List<String> names= arrays.asList("India", "Usa", "UK");
names.Stream().map(name -> names.toUpperCase()).forEach(n-> system.out.println(n));