package com.spring.core.learnspringframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {

//		Vehicle vehicle = new Car();
//
//		Traveler traveler = new Traveler(vehicle);f
//
//		traveler.statJourney();

		// Creating Spring IoC Container
		// Read Configuration Class
		// Create & Manage the Spring Beans
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		// Retrieve Spring Beans from Spring IoC Container
//		Car car = applicationContext.getBean(Car.class);
//		car.move();
//
//		Bike bike = applicationContext.getBean(Bike.class);
//		bike.move();

		Traveler traveler1 = applicationContext.getBean(Traveler.class);
		traveler1.statJourney();
	}
}
