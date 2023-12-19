package com.ccc.wvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ccc.wvc.entity.EventClinet;
import com.ccc.wvc.service.EventServiceImpl;

@RestController
public class EventController {
	
	
	@Autowired
	public EventServiceImpl eventServiceimpl;
	
	
	@PostMapping("/createEvent")
	public String createRecord(@RequestBody EventClinet eventclient ) {
	
		
		String createEvent = eventServiceimpl.createEvent(eventclient);
		return createEvent;
	}

}
