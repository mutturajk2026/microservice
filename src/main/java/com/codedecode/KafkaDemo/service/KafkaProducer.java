package com.codedecode.KafkaDemo.service;

import org.apache.kafka.common.protocol.Message;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KafkaProducer {

    @Autowired
  //
//
//    public void sendMessageToTopic(String message) {
//        kafkaTemplate.send("CodeDecodeTopic", message);



    private KafkaTemplate<String, Message > kafkaTemplate;
    private static final String TOPIC ="real time project";
    public String sendMessage(Message message){
        kafkaTemplate.send(TOPIC, message);
        return  "sent sent to kafka topic ";



            }
//KafkaProducer

}


