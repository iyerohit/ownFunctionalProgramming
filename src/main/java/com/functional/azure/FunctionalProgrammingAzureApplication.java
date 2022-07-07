package com.functional.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FunctionalProgrammingAzureApplication {

	public static void main(String[] args) {
		SpringApplication.run(FunctionalProgrammingAzureApplication.class, args);
	}


	@RequestMapping("/")
    public String getNormal() {

        return "YOu are calling default function in java deployed in azure";
    }
}
