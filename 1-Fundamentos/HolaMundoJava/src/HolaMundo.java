
import java.util.Scanner;

//Mi clase en Java

public class HolaMundo {
    

    public static void main(String args[]) {
        tarea();       
    }
    public static void ejemploConcatena1(){
        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner (System.in);
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe el titulo");
        var titulo = consola.nextLine() ;
        System.out.println("Resultados: " + titulo + " " + usuario);
        System.out.println("titulo");
        
        
    }
    
    public static void ejemploConcatena2(){
        Scanner consola = new Scanner (System.in);
        var titulo = consola.nextLine();
        System.out.println("titulo =" + titulo);
        System.out.println("Escribe el usuario");
        var usuario = consola.nextLine();
        System.out.println(titulo + " " + "fue escrito por" + " " + usuario );
        
    }
    
    public static void byteAndShortIntLong(){
        // TIPOS PRIMITIVOS ENTEROS:byte, short,int,long
        byte numerobyte = (byte)129;
        System.out.println("valor bytes" + numerobyte);
        System.out.println("valor minimo del byte:" + Byte.MIN_VALUE);
        System.out.println("valor maximo del byte:" + Byte.MAX_VALUE);
        
        short numeroShort = 10;
        System.out.println("numeroShort = "+ numeroShort);
        System.out.println("valor minimo del byte" + Short.MIN_VALUE);
        System.out.println("valor maximo del byte" + Short.MAX_VALUE);
        
        int numeroInt = (int)2147483648L;
        System.out.println("numeroInt =" + numeroInt);
        System.out.println("valor minimo :" + Integer.MIN_VALUE);
        System.out.println("valor maxima short :" + Integer.MAX_VALUE);
        
        long numeroLong =9223372036854775807L;
        System.out.println("numeroLong =" + numeroInt);
        System.out.println("valor minimo long :" + Long.MIN_VALUE);
        System.out.println("valor maxima long :" + Long.MAX_VALUE);
        
        
    }
    
    public static void primitivosFlotantes(){
        /* 
        tipos primitivos de tipo flotante: Float(32bits) y double (64bits)
        */
        float numeroFloat = (float)3.4028235E38D;
        System.out.println("numeroFloat =" + numeroFloat);
        System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float: " + Float.MAX_VALUE);
        
        double numeroDouble = 10;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo tipo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo double " + Double.MAX_VALUE);
        
    
    }
    
    public static void tiposconVaryPrimitivos (){
      var numeroEntero = 10;
        System.out.println("nuemroEntero = " + numeroEntero);
        
        var numeroDouble = 10.0;
        System.out.println("numerDouble = " + numeroDouble);
        
        var numeroFloat = 10.0F;
        System.out.println("numeroFloat =" + numeroFloat);
    }
    
    public static void tipoCharp (){
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        //utilizando var 
        
        var varChar1 = '\u0021';
        System.out.println("varChar1 = " + varChar1);
        
        var varCharDecimal2 = 33;
        System.out.println("varCharDecimal2 = " + varCharDecimal2);
        
        var  varCharSimbolo3 = '!';
        System.out.println("varCharSimbolo3 = " + varCharSimbolo3);
        
        int variableEnteraSimbolo = '!';
        System.out.println("variableEnetraSimbolo = " + variableEnteraSimbolo);
        
        int letra = 'a';
        System.out.println("letra = " + letra);
    }
    
    public static void tipoBoolean (){
        // tipo bandera 
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        
        if(varBoolean == true){
            System.out.println("La bandera es verdadera");
        }
        else {
            System.out.println("La bandera es falsa");
        }
        
        var edad = 10;
        //var esAdulto = edad >= 18;
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("no eres mayor de edad");
        }
        }
        
    public static void conversionTiposPrimitivos (){
        // convertir tipo string a un tipo int 
        var edad = Integer.parseInt("20");
        //var edad = "20"
        System.out.println("edad = " + (edad + 1 ));
        
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //PEDIR VALOR 
        var consola = new Scanner(System.in);
//        System.out.println("Proporciona tu edad");
//        edad = Integer.parseInt(consola.nextLine() );
//        System.out.println("edad = " + edad);
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);
        
        System.out.println("proporciona un caracter");
        caracter= consola.nextLine().charAt(0);
        System.out.println("caracter = "+ caracter);
        
        
        
        
    } 
    
    public static void tarea (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
 
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
        
    }
    }
    

    

