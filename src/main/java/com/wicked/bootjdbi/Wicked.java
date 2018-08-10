package com.wicked.bootjdbi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = JpaRepositoriesAutoConfiguration.class)
public class Wicked {
	public static void main(String[] args) {
		SpringApplication.run(Wicked.class, args);
	}
}