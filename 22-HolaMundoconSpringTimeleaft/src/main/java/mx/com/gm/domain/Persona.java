package mx.com.gm.domain;

import lombok.Data;

@Data //te agrega todo el codigo para que sea un java bean  
public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
