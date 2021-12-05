package com.sbms.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/welcome")
	public String getMsg() {
		String msg = "Welcome to Spring Boot Security with Docker";
		return msg;
	}

}
