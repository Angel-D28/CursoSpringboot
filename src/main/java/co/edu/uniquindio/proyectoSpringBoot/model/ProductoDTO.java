package co.edu.uniquindio.proyectoSpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDTO {
    private String name;
    private Integer stock;
    private Double price;
    private String description;
    private Boolean availability;
}
