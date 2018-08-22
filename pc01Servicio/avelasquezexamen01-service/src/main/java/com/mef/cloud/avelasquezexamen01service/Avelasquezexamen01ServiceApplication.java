package com.mef.cloud.avelasquezexamen01service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Avelasquezexamen01ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Avelasquezexamen01ServiceApplication.class, args);
	}
}
