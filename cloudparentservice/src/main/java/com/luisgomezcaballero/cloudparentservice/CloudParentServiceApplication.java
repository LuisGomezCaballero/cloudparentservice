package com.luisgomezcaballero.cloudparentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.luisgomezcaballero.cloudparentservice")
public class CloudParentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudParentServiceApplication.class, args);
	}
}
