package test;

import domein.Empleado;

public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("juan",5000);
        Empleado empleado2 = new Empleado("Juan",5000);
        //es para ver la referencia 
        if(empleado1 == empleado2){
            System.out.println("Tienen la mism referencia en memoria");
        }
        else{
            System.out.println("Tienen diferente referencia en memoria");
        }
        if (empleado1.equals(empleado2)){
        System.out.println("los objetos son iguales en contenido");
                }
        else{
            System.out.println("loa objetos son distintos en contenido");
        }
        
        if (empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("el valor hashcode es igual");
        }
        else {
            System.out.println("el valor de hashcode es distinto");
        }
    }
    
 
}
