
package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        //System.out.println("persona1 = " + persona1);
        
        Persona persona2= new Persona("Karla");
        //System.out.println("persona2:" + persona2);
        
        imprimir(persona1);
        imprimir(persona2);
      
    }
    public static void imprimir(Persona persona){
        System.out.println("persona= "  + persona);
    }
    
    public int getContador(){
        imprimir(new Persona("Carlos"));
        return this.contador;
    }
}
