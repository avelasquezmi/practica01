package com.mef.cloud.avelasquezexamen01server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Avelasquezexamen01ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Avelasquezexamen01ServerApplication.class, args);
	}
}
