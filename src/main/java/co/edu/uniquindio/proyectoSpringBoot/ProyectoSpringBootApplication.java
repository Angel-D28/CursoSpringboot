package co.edu.uniquindio.proyectoSpringBoot;

import co.edu.uniquindio.proyectoSpringBoot.model.ProductoEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ProyectoSpringBootApplication {

	public static void main(String[] args) {

		List<ProductoEntity> entities = new ArrayList<>();

		SpringApplication.run(ProyectoSpringBootApplication.class, args);
	}

}
