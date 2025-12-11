package co.edu.uniquindio.proyectoSpringBoot.service;

import co.edu.uniquindio.proyectoSpringBoot.model.ProductoDTO;
import co.edu.uniquindio.proyectoSpringBoot.model.ProductoEntity;
import co.edu.uniquindio.proyectoSpringBoot.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private IProductoRepository productoRepository;

    public List<ProductoEntity> findAll() {
        return productoRepository.findAll();
    }

    public ProductoEntity create(ProductoDTO producto) {
        ProductoEntity productoEntity = new ProductoEntity(producto.getName(), producto.getStock(), producto.getPrice(), producto.getDescription(), producto.getAvailability());
        return productoRepository.save(productoEntity);
    }

    public ProductoEntity update(Integer idEntity, ProductoDTO producto ) {
        ProductoEntity entity = productoRepository.findById(idEntity).orElseThrow();
        entity.setName(producto.getName());
        entity.setStock(producto.getStock());
        entity.setPrice(producto.getPrice());
        entity.setDescription(producto.getDescription());
        entity.setAvailability(producto.getAvailability());
        return productoRepository.save(entity);
    }

    public void delete(Integer idEntity) {
        productoRepository.deleteById(idEntity);
    }
}
