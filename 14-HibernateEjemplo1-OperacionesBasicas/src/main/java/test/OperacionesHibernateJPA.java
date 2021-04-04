package test;

import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;

public class OperacionesHibernateJPA {
    public static void main(String[] args) {
            PersonaDAO personaDao = new PersonaDAO();
            personaDao.listar();
            
//            Persona persona = new Persona();
//            persona.setNombre("Carlos");
//            persona.setApellido("Lara");
//            persona.setEmail("clara@mail.com");
//            persona.setTelefono("917533362");
            
           // personaDao.insertar(persona);
           
           //MODIFICAMOS A UNAPERSONA
           Persona persona = new Persona();
           persona.setIdPersona(13);
           
           persona =  personaDao.buscarPersonaPorId(persona);
           System.out.println("PersonaEncontrada = " + persona);
           
          // persona.setNombre("Carlos");
           //persona.setApellido("Pacheco");
           //persona.setEmail("cpacheco@mail.com");
          // persona.setTelefono("917533362");
          //personaDao.modificar(persona);
          personaDao.eliminar(persona);
          personaDao.listar();
    }
    
}
