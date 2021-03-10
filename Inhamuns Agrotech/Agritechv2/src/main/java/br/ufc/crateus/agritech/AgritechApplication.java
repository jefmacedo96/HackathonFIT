package br.ufc.crateus.agritech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class AgritechApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgritechApplication.class, args);
	}

}
