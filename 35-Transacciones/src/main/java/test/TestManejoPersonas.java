package test;

import datos.Conexion;
import datos.PersonaJDBC;
import domain.Persona;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;

public class TestManejoPersonas {
    
    public static void main(String[] args) {
           Connection  conexion =  null;
        try {
            
            conexion =  Conexion.getConnection();
            if(conexion.getAutoCommit()){
            conexion.setAutoCommit(false);
            
            }
        PersonaJDBC personaJdbc = new PersonaJDBC(conexion);
        Persona cambioPersona = new Persona();
        cambioPersona.setIdPersona(2);
        cambioPersona.setNombre("Karla Ivonne");
        cambioPersona.setApellido("Gomez");
        cambioPersona.setEmail("Kgomez.mail.com");
        cambioPersona.setTelefono("29175333390");
        personaJdbc.update(cambioPersona);
        
         Persona nuevaPersona = new Persona();
        nuevaPersona.setNombre("Erick");
        nuevaPersona.setApellido("Pacheco");
        nuevaPersona.setEmail("erick_ctr@mail.com");
        nuevaPersona.setTelefono("941212421");
        personaJdbc.insert(nuevaPersona);

        
        Persona nuevaPersona1 = new Persona();
        nuevaPersona1.setNombre("Arturo");
        nuevaPersona1.setApellido("Pachecozzzzzzzzzzzzzzzzzzzzzzzzssssssssssssssszzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        personaJdbc.insert(nuevaPersona1);
        
//        Persona personaEliminar = new Persona(9);
//        personaJdbc.delete(personaEliminar);
        conexion.commit();
            System.out.println("se ha hecho commit de la transaccion");
        
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
           
            System.out.println("Entramos al rollback");
               try {
                   conexion.rollback();
               } catch (SQLException ex1) {
                 ex1.printStackTrace(System.out);
               }
        }
        
    }
}
