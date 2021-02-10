
package test;

import dominio.Persona;
        
public class PersonaPrueba {
    public static void main(String[] args) {
      Persona persona1 = new Persona("Juan", 5000  , false);
        //System.out.println("nombre inicial:" + persona1.getNombre());
         System.out.println("persona1:" + persona1 ); 
      persona1.setNombre("Juan Carlos");
      //persona1.nombre = "Juan Carlos"
      //System.out.println("nombre:" + persona1.nombre);
        //System.out.println("persona1 nombre:" + persona1.getNombre());
        //System.out.println("persona1 sueldo:" + persona1.getSueldo());
        //System.out.println("persona1 eliminado:" + persona1.isEliminado());
        System.out.println("persona1:" + persona1 ); 
         Persona persona2 = new Persona ( "Erick Pacheco" ,4500 , false );
         System.out.println("persona2:" + persona2);
    }
}

