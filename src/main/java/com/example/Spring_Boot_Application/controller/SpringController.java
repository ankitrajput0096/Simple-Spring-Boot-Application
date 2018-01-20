package com.example.Spring_Boot_Application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring_Boot_Application.model.Topic;
import com.example.Spring_Boot_Application.service.springBootService;

@RestController
public class SpringController {
	
	@Autowired
	private springBootService springbootservice;
	
	@RequestMapping(value="/hello")
	public String helloMethod()
	{
		return "hello friends";
	}
	
	@RequestMapping(value="/topics")
	public List<Topic> listOfTopics()
	{
		return springbootservice.getAllTopics();
	}
}
