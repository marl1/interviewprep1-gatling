package com.marl1.gatling4interview;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info =
@Info(title = "My api", version = "1.0", description = "My api v1.0")
)
public class Gatling4interviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(Gatling4interviewApplication.class, args);
	}
}
