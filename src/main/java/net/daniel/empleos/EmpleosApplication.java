package net.daniel.empleos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"net.daniel"})
public class EmpleosApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpleosApplication.class, args);
	}

}
