package com.springboot.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomController {
	
	@Autowired
private	WelcomService service;
	
	
	@RequestMapping("/welcom")
	public String welcome() {
		return "service.WelcomController()"; 
		
		

	}

	}

