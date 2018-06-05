package com.lab.inventoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableDiscoveryClient
@ComponentScan({ "com" })
@EntityScan("com.example.demo")
@EnableJpaRepositories("com.example.demo")
@SpringBootApplication
public class InventoryService2Application {

	public static void main(String[] args) {
		SpringApplication.run(InventoryService2Application.class, args);
	}
}
