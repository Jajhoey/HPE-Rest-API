package com.example.restservicehpe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.restservicehpe.repository")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class RestservicehpeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestservicehpeApplication.class, args);
	}

}
