/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.sga.cliente.ciclovidajpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author ASUS
 */
public class EncontrarObjetoJPA {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        
        //Inicia la transaccion
        
        //Paso 1. INICIA TRANSACCION
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //Paso 2. EJECUTA  SQL DE TIPO SELECT
        Persona persona1 = em.find(Persona.class, 5);
        
        //Paso 3. TERMINA LA TRANSACCION
        tx.commit();
        
        //OBJETO EN ESTADO DETACHED
        log.debug("Objeto recuperado: " + persona1);
       
        //CERRAMOS EL ENTITY MANAGER 
        em.close();
       
    }
}
