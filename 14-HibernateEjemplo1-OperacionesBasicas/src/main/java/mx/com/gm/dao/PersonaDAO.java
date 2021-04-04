package mx.com.gm.dao;

import java.util.List;
import javax.persistence.*;
import mx.com.gm.domain.Persona;

public class PersonaDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonaDAO() {
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();//ya podemos ejecutar las consultas ylas operaciones

    }

    public void listar() {
        String hql = "SELECT p FROM Persona p";
        Query query = em.createQuery(hql);
        List<Persona> personas = query.getResultList();
        for (Persona p : personas) {
            System.out.println("p = " + p);
        }
    }

    public void insertar(Persona persona) {
        try {
            em.getTransaction().begin();//iniciamos la transaccion es decir una operacion sobre la base de datos 
            em.persist(persona);//persist se usa con entidades nuevas que no existen en la base de datos 
            em.getTransaction().commit();//confirmacion de un conjunto de cambios con el metodo commit 
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();//el rollback deshace los cambios realizados 
        }
//           finally{
//               if(em != null)
//                   em.close();
//           }
    }

    public void modificar(Persona persona) {
        try {
            em.getTransaction().begin();//iniciamos la transaccion es decir una operacion sobre la base de datos 
            em.merge(persona);//merge sincroniza el estado del objeto con la base de datos 
            em.getTransaction().commit();//confirmacion de un conjunto de cambios con el metodo commit 
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();//el rollback deshace los cambios realizados 
        }
        // finally{
        //  if(em != null)
        //   em.close();
        //}
    }

    public Persona buscarPersonaPorId(Persona p) {
        return em.find(Persona.class, p.getIdPersona());//estamos recuperandoinformacion 

    }

    public void eliminar(Persona persona) {
        try {
            em.getTransaction().begin();//iniciamos la transaccion es decir una operacion sobre la base de datos 
            em.remove (em.merge(persona));//merge sincroniza el estado del objeto con la base de datos 
            em.getTransaction().commit();//confirmacion de un conjunto de cambios con el metodo commit 
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();//el rollback deshace los cambios realizados 
        }
        // finally{
        //  if(em != null)
        //   em.close();
        //}
    }
}
