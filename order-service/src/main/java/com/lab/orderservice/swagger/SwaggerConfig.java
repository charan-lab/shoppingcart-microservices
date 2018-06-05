//package com.lab.orderservice.swagger;
//
//import java.util.Collections;
//
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//@EnableAutoConfiguration
//public class SwaggerConfig extends WebMvcConfigurationSupport {
//
//	@Bean
//	public Docket catalogApi() {
//		return new Docket(DocumentationType.SWAGGER_2).select()
//				.apis(RequestHandlerSelectors.basePackage("com.lab.orderservice.web.controllers"))
//				.paths(PathSelectors.any()).build().apiInfo(getApiInfo());
//
//	}
//
//	private ApiInfo getApiInfo() {
//		Contact c = new Contact("Charan Vallala", "test.com", "charan.cse@gmail.com");
//		return new ApiInfo("Order Service", "Rest API documentation for order related service", "1.0.0-snapshot",
//				"Free to use.", c, "Apache 2.0 Licence", "licence url goes here", Collections.emptyList());
//	}
//
//}
