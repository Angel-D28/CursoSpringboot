package co.edu.uniquindio.proyectoSpringBoot.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoriaDTO {
    @NotBlank(message = "Se necesita ingresar un nombre!!!!")
    @Size(min = 2 , message = "Ingrese un nombre con mas de 2 letras")
    private String nombre;
    @NotBlank(message = "Se debe ingresar una descripcion!!!!")
    @Size(min = 2 , message = "Ingrese un Ingrese una descripcion de al menos 10 caracteres")
    private String descripcion;
}
