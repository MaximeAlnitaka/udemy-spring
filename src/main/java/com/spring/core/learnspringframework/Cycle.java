package com.spring.core.learnspringframework;

import org.springframework.stereotype.Component;

@Component
public class Cycle extends Vehicle {

	@Override
	public void move() {
		System.out.println("Cycle is moving");
	}
}
