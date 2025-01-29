package com.IC.Gerador_Poesias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.ic.Gerador_Poesias")
public class GeradorPoesiasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeradorPoesiasApplication.class, args);
	}

}
