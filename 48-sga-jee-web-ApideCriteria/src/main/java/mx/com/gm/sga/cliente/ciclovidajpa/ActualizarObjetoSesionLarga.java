package mx.com.gm.sga.cliente.ciclovidajpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ActualizarObjetoSesionLarga {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        //INICIA LA TRANSACCION 
        //PASO 1. INICIA TRANSACCION
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        //PASO 2. EJECUTAMOS SQL DE TIPO SELECT
        Persona persona1 = em.find(Persona.class, 1);
        
        log.debug("Objeto encontrado:" + persona1) ;
        
        //PASO 3. setValue (NUEVO VALOR)
        persona1.setEmail("jjuarez@mail.com");
        persona1.setEmail("j.juarez@mail.com");
        
        //PASO 4. TERMINA LA TRANSACCION
        tx.commit();
        
        //OBJETO EN ESTADO DE DETACHED
        log.debug("objeto modificado:" + persona1);

        //CERRAMOS EL ENTITY MANAGER 
        em.close();

    }
}
