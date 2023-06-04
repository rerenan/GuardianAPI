package com.rerenan.guardianapi;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableAutoConfiguration
@EnableEncryptableProperties
@PropertySource(name = "EncryptedProperties", value = "classpath:encrypted.properties")

public class GuardianApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuardianApiApplication.class, args);
	}

}
