package com.techchaggi.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    
	// expose "/" that return app name
	
	@GetMapping("/")
	public String TCMyCoolApp() {
		return "Tech Chaggi My Cool App";
	}
	
	// expose a new endpoint for "workout"
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run, Swim and lift some weight!";
	}
	
	// expose new endpoint for login page
	
	@GetMapping("/loginpage")
	public String login() {
		return "Login Page!";
	}
}
