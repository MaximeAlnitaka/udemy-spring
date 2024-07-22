package com.spring.core.learnspringframework.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {

	public String hello() {
		return "hello Repository";
	}
}
