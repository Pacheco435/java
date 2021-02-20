package test;

import domein.*;

public class TestSobreescritura {
    public static void main(String[] args) {
        //Gerente gerente1 = new Gerente("Juan,",5000, "Sistemas");aplica para sobreescritura
        //System.out.println("gerente1: " + gerente1.obtenerDetalles());aplica para sobreescritura
    Empleado empleado = new Empleado("Juan", 5000);
    empleado.obtenerDetalles();
        //System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);
        Gerente gerente = new Gerente("Karla", 1000, " contabilidad");
        //System.out.println("gerente = " + gerente.obtenerDetalles());
        imprimir(gerente);
    }
    public static void imprimir(Empleado empleado){
        String detalles = empleado.obtenerDetalles();
        System.out.println("empleado = " + detalles);
    }
}
