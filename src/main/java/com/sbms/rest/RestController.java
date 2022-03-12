package com.sbms.rest;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/welcome")
	public String getMsg() {
		System.out.println("RestController.getMsg()");
		LocalDateTime ldt = LocalDateTime.now();
		int hour = ldt.getHour();
		if (hour < 12)
			return "Good Morning";
		else if (hour < 16)
			return "Good Afternoon";
		else if (hour < 20)
			return "Good Evening";
		else
			return "Good Night";
	}

	@GetMapping("/wish")
	public ResponseEntity<String> wishmsg() {
		String msg = "Welcome to Spring Boot Security with Dockers";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

}
