package com.example.clooudconfigdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ClooudConfigDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClooudConfigDemoApplication.class, args);
	}

}
