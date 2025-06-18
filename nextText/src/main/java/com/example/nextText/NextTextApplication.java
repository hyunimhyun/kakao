package com.example.nextText;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class NextTextApplication {

	public static void main(String[] args) {
		SpringApplication.run(NextTextApplication.class, args);
	}

}
