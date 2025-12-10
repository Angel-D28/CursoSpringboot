package co.edu.uniquindio.proyectoSpringBoot;

import co.edu.uniquindio.proyectoSpringBoot.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoSpringBootApplication {

	public static void main(String[] args) {

		Product product1 = new Product("Nevera", "P1", 4 , 40000, "NEVERA LG NUEVA", true );

		System.out.println(product1.toString());

		SpringApplication.run(ProyectoSpringBootApplication.class, args);
	}

}
