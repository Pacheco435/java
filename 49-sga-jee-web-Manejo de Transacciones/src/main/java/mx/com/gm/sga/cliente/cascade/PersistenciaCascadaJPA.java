package mx.com.gm.sga.cliente.cascade;

import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.domain.Usuario;
import org.apache.logging.log4j.*;

public class PersistenciaCascadaJPA {
  static Logger  log = LogManager.getRootLogger();
  
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();//inicia la transaccion
        
        //Paso 1 creamos un nuevo objeto
        //objeto en estado transitivo
        Persona persona1= new Persona("Hugo", "Hernandez", "h.hernandez@mail.com", "958766632");
        
        //creamos objeto usuario ( tiene dependencia con el objeto persona)
        Usuario usuario1 = new Usuario("hhernandez","123",persona1);
        
        //Paso3: persistimos el objeto usuario
        em.persist(usuario1);
        
        //paso 4 : hacemos coomit de la transaccion para que se guarde os cambios en la base de datos 
        tx.commit();
        
        //objeto en estado de detached 
        log.debug("objeto persistido persona1: " + persona1);
        log.debug("objeto persistido  usuario1: " + usuario1);
        
        em.close();
        
    }
  
}
