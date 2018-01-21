package com.example.Spring_Boot_Application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public List<Topic> listOfTopcs()
	{
		return springbootservice.getAllTopics();
	}
	
	@RequestMapping(value="/topics/{id}")
	public Topic getRequiredTopic(@PathVariable String id)
	{
		return springbootservice.getTopic(id);
	}
	
	@RequestMapping(value="/topics/add",method=RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic)
	{
		springbootservice.addTopic(topic);
	}
	
	@RequestMapping(value="/topics/update/{id}",method=RequestMethod.PUT)
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id)
	{
		springbootservice.updatetopic(topic,id);
	}
	@RequestMapping(value="/topics/delete/{id}",method=RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id)
	{
		springbootservice.deletetopic(id);
	}
}
