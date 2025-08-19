package com.kingsman.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
	
	@KafkaListener(topics="helloTopic", groupId="consumer-group")
	public void consume(String message) {
		System.out.println("Message Consumed: "+ message);
	}

}
