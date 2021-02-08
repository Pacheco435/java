
package Operaciones;
public class pruebaritmetica {
    public static void main(String[] args) {
 
//      aritmetica1.a=3;
//      aritmetica1.b=2;
//      aritmetica1.sumar();
//      
//      var resultado = aritmetica1.sumarconRetorno();
//        System.out.println("resultado  desde la clase de prueba = " + resultado );
//    
//    resultado = aritmetica1.sumarConArgumentos(5,8);

// variables locales 
        var a= 10;
        var b=2;
        miMetodo();
 
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1 a:= " + aritmetica1.a );
        System.out.println("aritmetica1 b:= " + aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2 a:= " + aritmetica2.a );
        System.out.println("aritmetica2 b:= " + aritmetica2.b);
        
        
    }
    public static void  miMetodo (){
    //a=10; variable fuera del ancance donde fue definida 
        System.out.println("otro metodo");
    }
}
