package mx.com.gm.test.ciclovida;

import javax.persistence.*;
import mx.com.gm.domain.Contacto;

public class Estado3ModificarObjetoPersistente {
      public static void main(String[] args) {
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU") ; 
      EntityManager em = emf.createEntityManager();
      
      //1.Definimos la variable 
      Contacto contacto = null;
      
       //2.Recuperamos un objeto de la base de datos 
       //estado transitivo
      contacto = em.find(Contacto.class, 3);
      
      //3.Modificamos el objeto
      contacto.setEmail("clara@mail.com");
      
      em.getTransaction().begin();
      
      //pasa a estado persistente 
      em.persist(contacto);//tambien funciona con merge 
      
      em.getTransaction().commit();
      
      //3.Pasamos a detached
          System.out.println("contacto = " + contacto);
    }
}
