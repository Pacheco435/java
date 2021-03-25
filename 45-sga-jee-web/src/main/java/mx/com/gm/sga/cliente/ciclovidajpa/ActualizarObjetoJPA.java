package mx.com.gm.sga.cliente.ciclovidajpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ActualizarObjetoJPA {
  static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        //INICIA LA TRANSACCION 
        //PASO 1. INICIA TRANSACCION
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //PASO 2. EJECUTAMOS SQL DE TIPO SELECT
        //EL ID PROPORCIONADO DEBE EXISTIR EN LA BASE DE DATOS 
        Persona persona1 = em.find(Persona.class, 1);
        
        //PASO 3.TERMINA LA TRANSACCION 1 
        tx.commit();
        
        //OBJETO EN ESTADO DE DETACHED
        log.debug("Objeto recuperado" + persona1);
        
        //PASO 4. setValue (nuevo valor)
        persona1.setApellido("Juarez");
        
        //PASO 5: INICIA LA TRANSACCION 2 
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();
        
        //PASO 6. MODIFICAMOS EL OBJETO
        em.merge(persona1);
        
        
        //PASO 7. TERMINA TRANSACCION 2 
        tx2.commit();
        
        //OBJETO  EN ESTADO DETACHED YA MODIFICADO
        log.debug("Objeto recuperado: " + persona1);
        
        //CERRAMOS EL ENTITY MANAGER 
        em.close();
       
    }    
}
