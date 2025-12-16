package co.edu.uniquindio.proyectoSpringBoot.shared.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper=false)
@Data
public class CustomeException extends RuntimeException {
    private final  Date date;


    public CustomeException(String message, Date date) {
        super(message);
        this.date = date;
    }
}
