package mx.com.gm.test.ciclovida;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import mx.com.gm.domain.Contacto;

public class Estado1Persistido {
    public static void main(String[] args) {
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU") ; 
      EntityManager em = emf.createEntityManager();
      
      //1.Estado transitivo
      Contacto contacto = new Contacto();
      contacto.setEmail("clara");
      contacto.setTelefono("11223344");
      
      //2.Estado persistente 
      em.getTransaction().begin();
      
      em.persist(contacto);
      //em.flush();//es un commit pero solo estamossincronizando y se puede continuar con la misma transaccion
      em.getTransaction().commit();
      
      //3.Detached (separado)  ya se tiene representacion del objeto en la bae de datos 
        System.out.println("contacto =" + contacto);
        
    }
    
   
}
