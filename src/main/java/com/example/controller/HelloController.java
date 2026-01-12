package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	 @GetMapping("/check")
	public String hello() {
        return "Hello SonarCloud PR check ";
    }
}
