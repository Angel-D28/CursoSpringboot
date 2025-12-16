package co.edu.uniquindio.proyectoSpringBoot.service;

import co.edu.uniquindio.proyectoSpringBoot.model.CategoriaDTO;
import co.edu.uniquindio.proyectoSpringBoot.model.CategoriaEntity;
import co.edu.uniquindio.proyectoSpringBoot.repository.ICategoriaRepository;
import co.edu.uniquindio.proyectoSpringBoot.shared.exceptions.CustomeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CategoriaService implements ICategoriaService {

    @Autowired
    private ICategoriaRepository categoriaRepository;

    @Override
    public CategoriaEntity create(CategoriaDTO categoria) {
        CategoriaEntity categoriaEntity = createEntity(categoria);
        return categoriaRepository.save(categoriaEntity);
    }

    @Override
    public CategoriaEntity update(Integer id, CategoriaDTO categoria) {
        CategoriaEntity entity = categoriaRepository.findById(id).orElseThrow(()->
                new CustomeException("La categoria con id: " + id + " no existe",new Date()));
        entity.setNombre(categoria.getNombre());
        entity.setDescripcion(categoria.getDescripcion());
        return categoriaRepository.save(entity);
    }

    public CategoriaEntity createEntity(CategoriaDTO categoria) {
        CategoriaEntity categoriaEntity = new CategoriaEntity();
        categoriaEntity.setNombre(categoria.getNombre());
        categoriaEntity.setDescripcion(categoria.getDescripcion());
        return categoriaEntity;
    }
}
