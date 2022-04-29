package com.example.consumer;


import com.example.consumer.config.RabbitMqConfig;
import com.example.consumer.dto.MessageDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {

    @RabbitListener(queues = RabbitMqConfig.QUEUE)
    public void listener(MessageDto messageDto){
        System.out.println(messageDto);
    }
}
