package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Configuration
@EnableAutoConfiguration
@ComponentScan
@Controller
@ContextConfiguration

public class DemoApplication {

	@ResponseBody
	 @RequestMapping("/")
	 
	    String entry() {
	        return "Hello Ponraj!";
	    }
	 
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
