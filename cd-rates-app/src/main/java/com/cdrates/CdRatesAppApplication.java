package com.cdrates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Certificate of Deposit Rates REST API Documentation",
				description = "CD Rates REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "test",
						email = "test@example.com",
						url = "http://localhost:8080/swagger-ui/index.html"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "Certificate of Deposits REST API Documentation",
				url = "http://localhost:8080/swagger-ui/index.html"
		)
)
public class CdRatesAppApplication {

	public static void main(String[] args) {
		
	SpringApplication.run(CdRatesAppApplication.class, args);	
	}

}
