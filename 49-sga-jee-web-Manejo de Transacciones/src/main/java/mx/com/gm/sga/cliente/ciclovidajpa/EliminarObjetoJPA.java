package mx.com.gm.sga.cliente.ciclovidajpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EliminarObjetoJPA {
    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        //INICIA LA TRANSACCION 
        //PASO 1. INICIA TRANSACCION
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //PASO 2. EJECUTAMOS EL SQL SELECT
        Persona persona1 = em.find(Persona.class,9);
        
        //PASO 3 TERMINA LA TRANSACCION 1
        tx.commit();
        
        //OBJETO EN ESTADO DE DETACHED 
        log.debug("Objeto encontrado: " + persona1);
        
        //PASO 4. INICIA TRANSACCION 2
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();
        
        //PASO 5. EJECUTA SQL QUE ES DELETE 
        em.remove(em.merge(persona1));//el merge sincroniza la informacion de la base de datos antes que se ejecute remove 
        
        //PASO 6. TERMINA TRANSACCION 2
        tx2.commit();
        
        //OBJETO EN ESTADO DETACHED YA ELIMINADO
        log.debug("objeto eliminado:" + persona1);
        
        //CERRAMOS EL ENTITY MANAGER 
        em.close();

    }
}
