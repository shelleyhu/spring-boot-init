package com.example.demo;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	@RequestMapping("/")
	public String index() {
	    return "Greetings from Spring Boot!";
	}
	
	@RequestMapping("/now")
	public String getTime() {
		Date date = new Date();		
	    return date.toString();
	}
}
