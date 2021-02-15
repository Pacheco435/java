
package test;

public class TestArreglos {
    public static void main(String[] args) {
    int edades[]  = new int[3];
        System.out.println("edades = " + edades);
        
        edades[0] = 10;
        System.out.println("edades 0 = " + edades[0]);
        
        edades[1]= 15;
        System.out.println("edades 1 = " + edades[1]);
        
        edades[2]=20;
        System.out.println("edades 2 = " + edades[2]);
        
        //edades[3]=5; es un error por que no estan dentro de los arreglos 
        //System.out.println("edades5 = " + edades[3]);
        for(int i=0;i< edades.length; i++){//el length cuenta la cantidad de caracteres
        System.out.println("edades elemnetos" + i + ":" + edades[i] );
        }
        String frutas[] = {"Naranja" , "Platano" , "Uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas" + frutas[i]);
        }
    }
    
}
