package com.springboot.project;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class WelcomService {
 
	public String retriveWelcomMesssage() {
		return "Good Moring!";
		
		
	}

}
