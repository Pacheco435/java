package test;

import domein.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[]= {5,6,8,9};
        for(int edad: edades){
        System.out.println("edad: "+ edad);
    }
        Persona personas[] = {new Persona("Juan"), new Persona("Karla"), new Persona("Mariela")};
        for(Persona persona: personas){
            System.out.println("Persona:" + persona);
        }
    }
}
