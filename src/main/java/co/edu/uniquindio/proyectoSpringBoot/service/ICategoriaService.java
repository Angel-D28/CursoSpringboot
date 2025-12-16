package co.edu.uniquindio.proyectoSpringBoot.service;

import co.edu.uniquindio.proyectoSpringBoot.model.CategoriaDTO;
import co.edu.uniquindio.proyectoSpringBoot.model.CategoriaEntity;

public interface ICategoriaService {
    CategoriaEntity create(CategoriaDTO categoria);
    CategoriaEntity update(Integer id,CategoriaDTO categoria);
}
