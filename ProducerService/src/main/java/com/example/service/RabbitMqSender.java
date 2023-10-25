package com.example.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.model.UserModel;

@Service
public class RabbitMqSender {
	
	private RabbitTemplate rabbitTemplate;
	
    @Value("${spring.rabbitmq.exchange}")
    private String exchange;
    
    @Value("${spring.rabbitmq.routingkey}")
    private String routingkey;
	

	public RabbitMqSender(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	public void send(UserModel user) {
		rabbitTemplate.convertAndSend(exchange, routingkey, user);
	}	
	

}
