package com.spring.core.learnspringframework;

import com.spring.core.learnspringframework.controller.DemoController;
import com.spring.core.learnspringframework.repository.DemoRepository;
import com.spring.core.learnspringframework.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoClient {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		DemoController demoController = applicationContext.getBean(DemoController.class);
		System.out.println(demoController.hello());

		DemoService demoService = applicationContext.getBean(DemoService.class);
		System.out.println(demoService.hello());

		DemoRepository demoRepository = applicationContext.getBean(DemoRepository.class);
		System.out.println(demoRepository.hello());
	}
}
