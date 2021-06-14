package com.avaliacaosprint.Sprint4.Sprint4;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan({"com.*"})
@EnableSpringDataWebSupport
@EnableSwagger2
@SpringBootApplication
public class Sprint4Application {

	public static void main(String[] args) {
		SpringApplication.run(Sprint4Application.class, args);
	}

}
