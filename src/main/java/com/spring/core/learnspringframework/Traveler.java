package com.spring.core.learnspringframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Traveler {

	private final Vehicle vehicle;

	@Autowired
	public Traveler(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void statJourney() {
		this.vehicle.move();
	}
}
