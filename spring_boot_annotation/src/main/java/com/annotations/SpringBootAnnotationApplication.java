package com.annotations;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.annotations.mypack.Manager;

@SpringBootApplication
public class SpringBootAnnotationApplication implements CommandLineRunner{
@Autowired
	private Student student;
//@Autowired 
  //private Date date;
 @Autowired 
    private Emp emp;
@Autowired 
private Manager manager;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAnnotationApplication.class, args);
	}
@Override
	public void run(String...args) throws Exception{
		this.student.studying();
		this.emp.whatsyourname();
		this.manager.speaking();
	}
/*@Bean
public Date getDate() {
	System.out.println("Create new date");
	return new Date();
	}*/
}
