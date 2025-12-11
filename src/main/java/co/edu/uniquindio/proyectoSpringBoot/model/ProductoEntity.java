package co.edu.uniquindio.proyectoSpringBoot.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
Sirve para reempllazar los getters, setters y
todo el codigo necesario para el buen funcionamiento e implementacion de un objeto
 @Data
 @AllArgsConstructor
 @NoArgsConstructor
 @Setter
 @Getter
 @ToString
*/
@Data
@NoArgsConstructor
@Entity(name = "producto")
public class ProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduct;
    private String name;
    private Integer stock;
    private Double price;
    private String description;
    private Boolean availability;

    @ManyToOne(fetch = FetchType.LAZY)
    CategoriaEntity categoria;

    public ProductoEntity(String name, int stock, double price, String description, boolean availability) {
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.description = description;
        this.availability = availability;
    }
}
