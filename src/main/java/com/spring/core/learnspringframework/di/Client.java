package com.spring.core.learnspringframework.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		String message = "Hi, Good Morning!";
//		EmailService emailService = new EmailService();
//		SMSService smsService = new SMSService();
//		MessageSender messageSender = new MessageSender(emailService);
//		messageSender.sendMessage(message);

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		MessageSender messageSender = applicationContext.getBean(MessageSender.class);
		messageSender.sendMessage(message);
	}
}
