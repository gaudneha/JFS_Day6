package com.annotations;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.annotations.mypack"})
public class MyConfig {

	
	@Bean
	public Student getStudent() {
		return new Student();
	}
	/*
	@Bean
	public Date getDate () {
		return new Date();
	}
	*/
}
