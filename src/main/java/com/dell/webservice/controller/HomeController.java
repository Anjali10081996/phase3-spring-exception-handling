package com.dell.webservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String indexMapper()
	{
		return "Welcome to spring boot first";
	}
	
	@GetMapping("/hello")
	public String helloMapper()
	{
		return "Hello, to spring boot";
	}
}
