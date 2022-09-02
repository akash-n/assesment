package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.example.DemoquizApplication;

@SpringBootApplication
public class DemoquizApplication {


	protected SpringApplicationBuilder configure (SpringApplicationBuilder builder) {
        return builder.sources(DemoquizApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(DemoquizApplication.class, args);
	}
}
