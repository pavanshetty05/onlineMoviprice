package com.example.online.movipricing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class MoveConfig {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.example.online.movipricing")).build();
	}
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("JavaInUse API").description("JavaInUse API reference for developers")
				.termsOfServiceUrl("http://localhost:8080").contact("pavanshetty@gmail.com")
				.license("JavaInUse License").licenseUrl("pavanshetty@gmail.com").version("1.0").build();
	}

}
