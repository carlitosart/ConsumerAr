package com.example.consumer;

import com.example.consumer.config.RabbitMqConfig;
import com.example.consumer.dto.StudentDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class StudentListener {
    @RabbitListener(queues = RabbitMqConfig.QUEUE2)
    public void listener(StudentDto studentDto){
        System.out.println(studentDto);
    }
    @RabbitListener(queues = RabbitMqConfig.QUEUE3)
    public void listenerfanaout(StudentDto studentDto){
        System.out.println(studentDto);
    }
    @RabbitListener(queues = RabbitMqConfig.QUEUE4)
    public void listenertopic(StudentDto studentDto){
        System.out.println(studentDto);
    }
}
