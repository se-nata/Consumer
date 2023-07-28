package ru.se_nata.consumer.kafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafKaConsumer {
	
	@KafkaListener(topics="newati",groupId = "group_id")
   public void handle(String massage) {
	   System.out.println(massage);
	
   }
}
