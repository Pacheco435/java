package test;

import java.util.List;
import javax.persistence.*;
import mx.com.gm.domain.Persona;

public class HolaMundoHibernate {
    public static void main(String[] args) {
        //hql (hibernate query language)
        String hql = "SELECT p FROM Persona p";
        //ahora nos conectamos a la base de datos 
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("HibernateEjemplo1");
        EntityManager entityManager = fabrica.createEntityManager();
        
        Query query = entityManager.createQuery(hql);//nos regresa objetos  de tipo persona 
        List<Persona> personas = query.getResultList();
        for(Persona p: personas){
                System.out.println("Persona: " + p);
        }
    }
    
}
