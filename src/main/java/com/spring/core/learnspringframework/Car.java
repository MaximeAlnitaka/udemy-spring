package com.spring.core.learnspringframework;

import org.springframework.stereotype.Component;

@Component
public class Car extends Vehicle {

	@Override
	public void move() {
		System.out.println("Car is moving ...");
	}
}
