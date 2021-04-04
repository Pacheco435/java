package mx.com.gm.test.ciclovida;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mx.com.gm.domain.Contacto;

public class Estado4EliminarObjeto {
     public static void main(String[] args) {
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU") ; 
      EntityManager em = emf.createEntityManager();
      
      //1.Definimos la variable 
      Contacto contacto = null;
      
       //2.Recuperamos un objeto de la base de datos 
       //estado transitivo
      contacto = em.find(Contacto.class, 3);
      
      em.getTransaction().begin();
      
      //3.Ejecutamos remove
      em.remove(em.merge(contacto));//tambien funciona con merge 
      
      em.getTransaction().commit();
      
      //3.Pasamos a estado transitivo no tiene representacion en la base de datos 
          System.out.println("contacto = " + contacto);
    }
}
