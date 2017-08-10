package com.dipen.radius;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
//@EnableScheduling //uncomment the line to run scheduler on you application
public class RadiusApplication {

	public static void main(String[] args) {
		SpringApplication.run(RadiusApplication.class, args);
	}
}
