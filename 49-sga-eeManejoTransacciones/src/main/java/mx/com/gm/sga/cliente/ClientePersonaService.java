package mx.com.gm.sga.cliente;

import java.util.List;
import javax.naming.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaServiceRemote;

public class ClientePersonaService {
    public static void main(String[] args) {
        System.out.println("Iniciando llamda al DJB desde el cliente ");
        try {
            Context jndi = new InitialContext();//java name and directory interface
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/41-sga-ee/PersonaServiceImpl!mx.com.gm.sga.servicio.PersonaServiceRemote");
            
            List<Persona> personas = personaService.ListarPersonas();
            
            for(Persona persona: personas){
                 System.out.println(persona);
            }
            
            System.out.println("Fin de la llamada del EJB desde el cliente ");
            
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}
