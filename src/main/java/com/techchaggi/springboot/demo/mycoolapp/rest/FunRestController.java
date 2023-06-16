package com.techchaggi.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	// injecting properties for: company.name and team.name

	@Value("${team.name}")
	private String teamName;

	@Value("${developer.name}")
	private String developerName;

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

	// exposing new point for the custom properties used via @Value()

	@GetMapping("/teaminfo")
	public String getCompanyInfo() {
		return "Team: " + teamName+ ", Developer name: "+ developerName;
	}
}
