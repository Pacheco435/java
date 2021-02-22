package Test;

import java.util.*;

public class TestColecciones {
    public static void main(String[] args) {
        List  miLista = new ArrayList();//guarda el oreden de como se esta agregando
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        miLista.add("Domingo");
        //imprimir(miLista);
        
//        for(Object elemento: miLista){
//            System.out.println(elemento);
//        }
//        
//        miLista.forEach(elemento -> {
//            System.out.println("elemento = "  + elemento);
//        });
//        
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
        miSet.add("Domingo");
        
       // imprimir(miSet);
       
       Map miMapa = new HashMap();
       miMapa.put("valor1", "Juan");
       miMapa.put("valor2", "Karla");
       miMapa.put("valor3", "Rosario");
       
       String elemento =(String) miMapa.get("valor1");
        //System.out.println("elemento = " + elemento);
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    public static void imprimir(Collection colection){
    
    colection.forEach(elemento -> {
        System.out.println("elemento = " + elemento);
    });
    
    }
}
