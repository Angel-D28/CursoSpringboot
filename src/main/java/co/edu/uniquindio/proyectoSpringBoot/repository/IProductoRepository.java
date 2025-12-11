package co.edu.uniquindio.proyectoSpringBoot.repository;

import co.edu.uniquindio.proyectoSpringBoot.model.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface IProductoRepository extends JpaRepository<ProductoEntity, Integer> {

}
