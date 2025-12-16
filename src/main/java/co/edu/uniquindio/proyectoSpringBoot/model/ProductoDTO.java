package co.edu.uniquindio.proyectoSpringBoot.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductoDTO {

    @NotNull (message = "Debe ingresar un nombre del producto")
    @Size(min = 3 , message = "Debe habeer mas de 2 caracteres")
    private String name;
    @Max(value = 15  , message = "Debe ser menor a 15 ")
    private Integer stock;
    private Double price;
    private String description;
    private Boolean availability;
}
