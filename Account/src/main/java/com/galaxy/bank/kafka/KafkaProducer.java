package com.galaxy.bank.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KafkaProducer {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendMessage(String topic, String message) {
		log.info("Mensaje enviado: {}", message.toString());
		System.out.println("Mensaje enviado:" + message.toString());
		this.kafkaTemplate.send(topic, message);
	}
}
