package co.edu.uniquindio.proyectoSpringBoot.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

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
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idProduct;
    private String name;
    private int stock;
    private double price;
    private String description;
    private boolean availability;

    public Product(String name, String idProduct, int stock, double price, String description, boolean availability) {
        this.name = name;
        this.idProduct = idProduct;
        this.stock = stock;
        this.price = price;
        this.description = description;
        this.availability = availability;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", idProduct='" + idProduct + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", availability=" + availability +
                '}';
    }
}
