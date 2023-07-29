package com.merakool.tv_variations;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "goCash App",
				description = "Backend Rest APIs",
				version = "v1.8",
				contact = @Contact(
						name = "Merakool",
						email = "merakool@gmail.com",
						url = "https://github.com/uracles/Bellonee_Bank_App"
				),
				license = @License(
						name = "uracles signed",
						url = "https://github.com/uracles/Bellonee_Bank_App"
				)

		),
		externalDocs = @ExternalDocumentation(
				description = "Backend Rest APIs",
				url = "https://github.com/uracles/Bellonee_Bank_App"
		)

)
public class TvVariationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TvVariationsApplication.class, args);
	}

}
