package com.spring.core.learnspringframework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bike")
@Primary
public class Bike extends Vehicle {

	@Override
	public void move() {
		System.out.println("Bike is moving ...");
	}
}
