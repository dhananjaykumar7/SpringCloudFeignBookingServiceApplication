package com.example.SpringCloudFeignBookServiceApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudFeignBookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignBookServiceApplication.class, args);
	}

}
