package com.codingdojo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringApplication {
public static void main(String[] args) {
	SpringApplication.run(StringApplication.class, args);
	}
	@RequestMapping("/")
	public String Hi() {
		return "Hello client! How are you doing?";
	}
	@RequestMapping("/random")
	public String spring() {
		return "Spring Boot is great! So easy to just respond with strings";
	}
}
