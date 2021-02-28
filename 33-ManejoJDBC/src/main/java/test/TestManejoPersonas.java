package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        
    //Insertando un nuevo objeto de tipo persona 
     // Persona personaNueva = new Persona("Carlos","Esparza","cesparza.mail.com","23145689300");
      //personaDao.insertar(personaNueva);
      
     //Modificar un objeto de persona existente 
     //Persona personaModificar = new Persona(4,"Juan Carlos", "Esparza", "jcesparzamail.mail.com","23145689300");
     //personaDao.actualizar(personaModificar);
     
     //Eliminar un registro 
     Persona personaEliminar = new Persona(4);
     personaDao.eliminar(personaEliminar);
     
     //Listado de personas 
     List<Persona>personas = personaDao.seleccionar();
     
     personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
    }
    
}
