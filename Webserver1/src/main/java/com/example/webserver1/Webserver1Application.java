package com.example.webserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Webserver1Application {
	public static void main(String[] args) {
		SpringApplication.run(Webserver1Application.class, args);
	}

}
//Paus till 1100