package com.fermax.spuche.java.pruebas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.fermax.spuche.java.pruebas.topic")
public class CursoAcademicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoAcademicoApplication.class, args);
	}
}
