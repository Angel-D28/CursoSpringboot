package co.edu.uniquindio.proyectoSpringBoot.controller;

import co.edu.uniquindio.proyectoSpringBoot.model.ProductoDTO;
import co.edu.uniquindio.proyectoSpringBoot.model.ProductoEntity;
import co.edu.uniquindio.proyectoSpringBoot.service.ProductoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    @Operation(summary = "obtener todos los productos" , description = "retorna una lista con todos los productos disponibles")
    public List<ProductoEntity> findAll() {
        return productoService.findAll();
    }

    @PostMapping
    @Operation(summary = "crear un producto " , description = "Metodo para crar un producto")
    public ProductoEntity save(@RequestBody ProductoDTO producto)  {
        return productoService.create(producto);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar un producto " , description = "Metodo para actualizar un producto")
    public ProductoEntity update(@PathVariable Integer id,@RequestBody ProductoDTO producto)  {
        return productoService.update(id ,producto);
    }

    @DeleteMapping("/{idEntity}")
    @Operation(summary = "Eliminar un producto " , description = "Metodo para eliminar un producto")
    public void delete(@PathVariable Integer idEntity)  {
        productoService.delete(idEntity);
    }
}
