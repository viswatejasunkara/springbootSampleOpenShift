package com.example.springbootSampleOpenShift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootSampleOpenShiftApplication {

    @GetMapping("/")
	public String getMessage() {
		return "Open Shift deployment Successful";
	}
	
	@PostMapping("/{input}")
	public String getMessage(@PathVariable String input) {
		return "returning input from the path" + input;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootSampleOpenShiftApplication.class, args);
	}

}
