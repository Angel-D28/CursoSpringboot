package co.edu.uniquindio.proyectoSpringBoot.repository;

import co.edu.uniquindio.proyectoSpringBoot.model.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoriaRepository extends JpaRepository<CategoriaEntity , Integer> {
}
