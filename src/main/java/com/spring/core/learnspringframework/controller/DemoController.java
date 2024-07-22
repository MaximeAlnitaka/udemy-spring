package com.spring.core.learnspringframework.controller;

import org.springframework.stereotype.Controller;

@Controller
public class DemoController {

	public String  hello () {
		return "hello Controller";
	}
}
