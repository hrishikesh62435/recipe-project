package com.project.recipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class RecipeFullProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeFullProjectApplication.class, args);
	}

}
