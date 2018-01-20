package com.example.Spring_Boot_Application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring_Boot_Application.model.Topic;

@RestController
public class SpringController {
	
	@RequestMapping(value="/hello")
	public String helloMethod()
	{
		return "hello friends";
	}
	
	@RequestMapping(value="/topics")
	public List<Topic> listOfTopics()
	{
		List<Topic> topics=new ArrayList<>();
		topics.add(new Topic("spring","springFramework","spring framework is awesome"));

		topics.add(new Topic("java","core java","java is very best in it's field"));

		topics.add(new Topic("javascript","basic javascript","javascript is not so good"));
		
		return topics;
	}
}
