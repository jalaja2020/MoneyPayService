package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.example.config.RibbonConfiguration;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@RibbonClient(name="MoneyPayClient", configuration = RibbonConfiguration.class)
public class MoneyPayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneyPayServiceApplication.class, args);
	}

}
