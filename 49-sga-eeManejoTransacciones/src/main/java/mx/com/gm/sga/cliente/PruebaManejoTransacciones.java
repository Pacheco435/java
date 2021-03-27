package mx.com.gm.sga.cliente;

import javax.naming.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaServiceRemote;
import org.apache.logging.log4j.*;

public class PruebaManejoTransacciones {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/49-sga-jee-web-ManejodeTransacciones/PersonaServiceImpl!mx.com.gm.sga.servicio.PersonaServiceRemote");
            
            log.debug("Iniciando prueba manejo transaccional PersonaService ");
            
            //Buscar un objeto persona 
            Persona persona1 = personaService.encontrarPersonaPorId(new Persona(1));
            
            log.debug("Persona recuperada:" + persona1);
            
            //cambiar el apellido de la persona 
            //persona1.setApellido("cambio con error .................................................................");
            persona1.setApellido("Perez");
            
            personaService.modificarPersona(persona1);
            log.debug("objeto modificado:" + persona1);
            log.debug("fin de prueba EJB transaccional");
            
            
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
