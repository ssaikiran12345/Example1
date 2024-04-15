package com.sathya.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Firstrestapi {
	@GetMapping("/test")
	public String greet() {
		return "this is first rest api project";
	}


	@GetMapping("/wish/{name}")
	public String greet2(@PathVariable String name) {
		return "this is first rest api project"+name;
	
	}
}