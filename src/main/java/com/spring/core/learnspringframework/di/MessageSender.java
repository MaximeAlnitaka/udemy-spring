package com.spring.core.learnspringframework.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

	private MessageService messageService;

	private MessageService smsService;


//	public MessageSender(@Qualifier("emailService") MessageService messageService) {
//		this.messageService = messageService;
//		System.out.println("Constructor based dependency injection1 ");
//	}
//
//	@Autowired
//	public MessageSender(@Qualifier("emailService") MessageService messageService, @Qualifier("SMSService")MessageService smsService) {
//		this.messageService = messageService;
//		this.smsService = smsService;
//		System.out.println("Constructor based dependency injection 2");
//	}

	@Autowired
	public void setMessageService(@Qualifier("emailService") MessageService messageService) {
		this.messageService = messageService;
		System.out.println("setter based dependency injection 1");
	}

	@Autowired
	public void setSmsService(@Qualifier("SMSService") MessageService smsService) {
		this.smsService = smsService;
		System.out.println("setter based dependency injection 2");
	}

	public void sendMessage(String message) {
		this.messageService.sendMessage(message);
		this.smsService.sendMessage(message);
	}
}