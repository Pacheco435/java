
package PasoporReferencia;

import Clases.Persona;

public class PasoporReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona ();
        persona1.nombre ="Juan";
        System.out.println("persona1 nomre: " + persona1.nombre);
        persona1=cambiarValor(persona1);
        System.out.println("persona1 cambio nombre= " + persona1.nombre);
    }
    public static Persona cambiarValor(Persona persona){
    if(persona == null){
    return null;
    }
        persona.nombre="Karla";
    return persona;
    
    }
}
