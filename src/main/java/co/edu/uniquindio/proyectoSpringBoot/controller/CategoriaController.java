package co.edu.uniquindio.proyectoSpringBoot.controller;

import co.edu.uniquindio.proyectoSpringBoot.model.CategoriaDTO;
import co.edu.uniquindio.proyectoSpringBoot.model.CategoriaEntity;
import co.edu.uniquindio.proyectoSpringBoot.service.ICategoriaService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private ICategoriaService icategoriaService;

    @PostMapping
    @Operation(summary = "Crear una categoria", description = "Metodo para crear una categoria")
    public CategoriaEntity create (@Valid @RequestBody CategoriaDTO categoria) {
        return icategoriaService.create(categoria);
    }

    @PutMapping("/{idCat}")
    @Operation(summary = "Actualizar una categoria" , description = "Metodo para actualizar una categoria")
    public CategoriaEntity update (@PathVariable Integer idCat, @Valid @RequestBody CategoriaDTO categoria) {
        return icategoriaService.update(idCat, categoria);
    }
}
