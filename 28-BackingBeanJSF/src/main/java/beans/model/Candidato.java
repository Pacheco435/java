package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named//se debe poner estas anotaciones para que sea reconocido como un JSF 
@RequestScoped//se debe poner estas anotaciones para que sea reconocido como un JSF

public class Candidato {
    private String nombre = "Introduce tu nombre";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
