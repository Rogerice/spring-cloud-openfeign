package com.openfeign.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class SpringOpenfeign2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringOpenfeign2Application.class, args);
	}

}
