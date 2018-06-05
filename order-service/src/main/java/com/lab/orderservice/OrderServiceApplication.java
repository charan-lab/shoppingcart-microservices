package com.lab.orderservice;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableCircuitBreaker
@EnableAutoConfiguration
@ComponentScan("com")
@EnableDiscoveryClient
@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	@Bean
	public Docket catalogApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.lab.orderservice.web.controllers"))
				.paths(PathSelectors.any()).build().apiInfo(getApiInfo());

	}

	private ApiInfo getApiInfo() {
		Contact c = new Contact("Charan Vallala", "test.com", "charan.cse@gmail.com");
		return new ApiInfo("Order Service", "Rest API documentation for order related service", "1.0.0-snapshot",
				"Free to use.", c, "Apache 2.0 Licence", "licence url goes here", Collections.emptyList());
	}

}
