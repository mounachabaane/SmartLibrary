package com.libray.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//This annotation enables the auto-configuration feature of the spring boot module (i.e. java-based configuration and component scanning)
@SpringBootApplication
public class SmartLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartLibraryApplication.class, args);
	}

}
