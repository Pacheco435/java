package test;

public class TestAutoBoxingUnBoxing {
    public static void main(String[] args) {
        //Clases Envolventes de tipos primitivos
        /*
        int = Integer
        long = Long
        float = Float
        double = Double
        boolean = Boolean
        byte = Byte
        char = Character 
        short = Short
        */
        //autoboxing convierte la literal de tipo entero a tipo object
        Integer  entero =10;
        System.out.println("entero = " + entero);
        System.out.println("entero double = " + entero.doubleValue());
        //el unboxing recupera del metodo autoboxing 
        int entero2 = entero;
        System.out.println("entero2 = " + entero2);
        
    }
    
}
