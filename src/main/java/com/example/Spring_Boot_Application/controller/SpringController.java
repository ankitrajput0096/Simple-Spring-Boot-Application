package com.example.Spring_Boot_Application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
	
	@RequestMapping("/hello")
	public String helloMethod()
	{
		return "hello friends";
	}
}
