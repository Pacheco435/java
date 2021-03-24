package mx.com.gm.sga.datos;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;


@Stateless
public class PersonaDaoImpl implements PersonaDao{
    
    @PersistenceContext(unitName="PersonaPU")
    EntityManager em;//INTERACTUAMOS CON LA BASE DE DATOS 

    @Override
    public List<Persona> findAllPersonas() {
        return em.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Persona findPersonaById(Persona persona) {
        return em.find(Persona.class, persona.getIdPersona());
    }

    @Override
    public Persona findPersonaByEmail(Persona persona) {
       Query query = em.createQuery("from Persona p where p.email =: email ");
       query.setParameter("email", persona.getEmail());
       return (Persona) query.getSingleResult();
    }

    @Override
    public void insertPersona(Persona persona) {
        em.persist(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        em.merge(persona);//sincroniza y actualiza nuestro objeto en la base de datos 
        
    }

    @Override
    public void deletePersona(Persona persona) {
        em.remove(em.merge(persona));//primero se actualiza y sincronizar el estado del objeto con la base de datos 
    }
}
