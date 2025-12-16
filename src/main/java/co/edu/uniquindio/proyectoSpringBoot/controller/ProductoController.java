package co.edu.uniquindio.proyectoSpringBoot.controller;

import co.edu.uniquindio.proyectoSpringBoot.model.ProductoDTO;
import co.edu.uniquindio.proyectoSpringBoot.model.ProductoEntity;
import co.edu.uniquindio.proyectoSpringBoot.service.ProductoService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    @Operation(summary = "obtener todos los productos" , description = "retorna una lista con todos los productos disponibles")
    public List<ProductoDTO> findAll() {
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductoEntity> obtenerPorId(@PathVariable int id) {
        Optional<ProductoEntity> producto = productoService.obtenerPorId(id);
        return producto.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "crear un producto " , description = "Metodo para crar un producto")
    public ProductoEntity save(@RequestBody @Valid ProductoDTO producto)  {
        return productoService.create(producto);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar un producto " , description = "Metodo para actualizar un producto")
    public ProductoEntity update(@PathVariable Integer id,@Valid @RequestBody ProductoDTO producto)  {
        return productoService.update(id ,producto);
    }

    @DeleteMapping("/{idEntity}")
    @Operation(summary = "Eliminar un producto " , description = "Metodo para eliminar un producto")
    public void delete(@PathVariable Integer idEntity)  {
        productoService.delete(idEntity);
    }
}
