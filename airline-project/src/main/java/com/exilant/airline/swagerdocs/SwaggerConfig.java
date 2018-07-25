package com.exilant.airline.swagerdocs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;

import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	
	public static ApiInfo API_INFO = new ApiInfo("Indian Airline ", "Indian Airline useful Api Docs", "1.0", "Airline 0.0.0.1.0", "Allahrakha", "all right reserved \u00a9 2018 ", "https://google.com");
	
	private static final Set<String> DEFAULT_PROCESS_AND_COMES= new HashSet<>(Arrays.asList("application/json","application/xml"));


	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(API_INFO).produces(DEFAULT_PROCESS_AND_COMES).consumes(DEFAULT_PROCESS_AND_COMES);
		
	}
}
