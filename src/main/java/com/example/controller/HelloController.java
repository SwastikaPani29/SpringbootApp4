package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	 @GetMapping("/")
	public String hello() {
        return "Hello  i m swastika ";
    }
	 
	 @GetMapping("/health")
	 public String health() {
	     return "Hello Sonar PR Test";
	 }
}
