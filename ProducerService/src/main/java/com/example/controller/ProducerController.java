package com.example.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.UserModel;
import com.example.service.RabbitMqSender;

@RestController
@RequestMapping("/api/v2/")
public class ProducerController {
	
	private RabbitMqSender rabbiitMqSender;
	
	@Value("${app.message}")
	private String message;

	public ProducerController(RabbitMqSender rabbiitMqSender) {
		this.rabbiitMqSender = rabbiitMqSender;
	}
	
	@PostMapping(value = "user")
	public String publishUser(@RequestBody UserModel user) {
		rabbiitMqSender.send(user);
		return message;
	}
	

}
