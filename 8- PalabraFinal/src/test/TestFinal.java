
package test;

import dominio.Persona;


public class TestFinal {
    public static void main(String[] args) {
      final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        //miVariable = 5 ;
        
        //Persona.MI_CONSTANTE = 1;
        System.out.println("Mi constante" + Persona.MI_CONSTANTE);
        
        final Persona persona1 = new Persona();
        //persona1= new Persona();
         persona1.setNombre("juan");
         System.out.println("persona1" + persona1.getNombre());
         persona1.setNombre("Marcelo");
         System.out.println("persona1" + persona1.getNombre());
    }
   
}
