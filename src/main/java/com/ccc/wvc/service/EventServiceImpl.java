package com.ccc.wvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccc.wvc.entity.EventClinet;
import com.ccc.wvc.repo.EventRepo;

@Service
public class EventServiceImpl {
	
	@Autowired
	private EventRepo eventRepo;
	
	
	public String createEvent(EventClinet event ) {
		
		String test = null;
		
		EventClinet eventSaved = eventRepo.save(event);
		
		if(eventSaved != null) {
			
			test = "Success";
		} else {
			test = "Failed";
		}
		return test;
		
	}

}
