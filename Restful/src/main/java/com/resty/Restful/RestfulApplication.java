package com.resty.Restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


@SpringBootApplication(scanBasePackages = {"com.resty"})
public class RestfulApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(RestfulApplication.class, args);

	}
}
