package test;

import domein.*;

public class TestInstanceOff {
    public static void main(String[] args) {
    Empleado empleado = new Empleado("Juan", 5000);
    //determinarTipo(empleado);
    empleado = new Gerente("Karla", 1000, " contabilidad");
     determinarTipo(empleado);
    }
    public static void determinarTipo(Empleado empleado){
       if(empleado instanceof Gerente){
           System.out.println("Es de tipo gerente");
           Gerente gerente = (Gerente)empleado;
           System.out.println("gerente = " + gerente.getDepartamento());
           ((Gerente) empleado).getDepartamento();
       }
       else if (empleado instanceof Empleado){
           System.out.println("Es de tipo Empleado");
           Gerente gerente = (Gerente)empleado;
           System.out.println("gerente = " + gerente.getDepartamento());
           
       }
       else if (empleado instanceof Object){
           System.out.println("Es de tipo Object");
           empleado.toString();
    }
    }
}
