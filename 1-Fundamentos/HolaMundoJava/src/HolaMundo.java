
import java.util.Scanner;

//Mi clase en Java

public class HolaMundo {
   
    public static void main(String args[]) {
        precedenciaDeOperadores();       
    }
    public static void operadoresAritmeticos(){
        int  a=3, b=2;
        var resultados = a + b;
        System.out.println("resultado = " + resultados);
        
        resultados = a-b;
        System.out.println("resultado =" + resultados);
        
        resultados = a*b;
        System.out.println("resultados = " + resultados);
        
        var resultados2 = 3.0/b;
        System.out.println("resultado de division = " + resultados2);
        
        resultados = a%b;
        System.out.println("resultados = " + resultados);
        
        if( a % 2 == 0)
        System.out.println("es numero par");
         else 
        System.out.println("es numero impar");         
    }
    public static void tareaRectangulo (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el alto");
        int alto = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el ancho");
        int ancho = Integer.parseInt(scanner.nextLine());
        int area = alto * ancho;
        int perimetro = (alto + ancho)*2;
        System.out.println("Area: " + area);
        System.out.println("perimetro: " + perimetro);
    }
    public static void operadoresdeAsignacion (){
    int a=3 , b=2;
    int c= a + 5 - b;
        System.out.println("c=" + c);
        
        a += 1;// a =a+1 se incrementa en uno 
        System.out.println("a=" + a);
        
        a +=3;
        System.out.println("a=" + a);
        
        a -=2;
        System.out.println("a=" + a );
    }
    public static void operadoresUnarios (){
    var a = 3;
    var b = -a;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        var c = true;
        var d = !c;
        System.out.println("c=" + c);
        System.out.println("d=" + d);
        
        // incremento
        //1.preincremento( simbolo antes de la variable)
        var e =4;
        var f = ++e; // primero se incrementa la variable y despues se usa su valor ;
        System.out.println("e=" + e);
        System.out.println("f=" + f);
        //2. post incremento (simbolo despues de la variable
        var g = 5;
        var h = g++;//primero se utiliza el valor de la varible y luego se incrementa 
        System.out.println("g=" + g);//teniamos pendiente un incremento
        System.out.println("h=" + h);
        
        //decremento
        var i=2;
        var j= --i;
        System.out.println("i=" + i);
        System.out.println("j=" + j);
        
        //pst decremento
        var k=4;
        var l= k--;
        System.out.println("k=" + k);
        System.out.println("l"+ l);
  
    }
    public static void operadoresdeIgualdadyRelacionales(){
    var a = 3;
    var b = 2;
    var c = (a == b);
        System.out.println("c=" + c);
        
    var d = a != b;
        System.out.println("d=" + d);
        
        var cadena ="hola";
        var cadena2 ="hola";
        var e = cadena == cadena2;
        System.out.println("e=" + e);
        
        var f= cadena.equals(cadena2);//comparamos contenidos de cadenas
        System.out.println("f=" + f);
        
        //operadores relacionales 
         var g = a>=b;//mayor que> o el mayor o igual >=
         System.out.println("g=" + g);
         
         if (a % 2 == 0) { //aqui no lleva punto y coma
         System.out.println("es numero par");
          } else {
         System.out.println("es numero impar");
            }
    }
    public static void operadoresCondicionale(){
        // USO DE LAS CONDICIONALES "Y" "O"
    var a = 10;
    var valorMinimo = 0;
    var valorMaximo = 10;
    
    var resultado = a >= 0 && a <= 10; //es la condicional "y"
    if(resultado)
    {
        System.out.println("Dentro de rango");
    }
    else
    {
        System.out.println("fuera de rango");
    }
    
    var vacaciones = false ;
    var diaDescanso = true;
    
    if(vacaciones || diaDescanso) //es la condicional "o"
    {
        System.out.println("Padre puede asistir al juego del hijo");
    }
    else
    {
        System.out.println("El padre esta ocupado");
    }
    
    }
    public static void operadorTernario (){
    var resultado = (1>2) ? "verdad" : "falso" ;
        System.out.println("resultado= " + resultado);
    
        var numero = 8;
        resultado = (numero % 2 == 0) ? "numero par" : "numero impar";
        System.out.println("resultado= " + resultado);
    }
    public static void tareaconRangos (){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el numero1");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el numero2");
        int numero2 = Integer.parseInt(scanner.nextLine());
        System.out.println("El numero mayor es:");
        System.out.println(numero1>numero2 ? numero1 : numero2);
    }
    public static void precedenciaDeOperadores(){
    var x = 5;
    var y = 10;
    var z = ++x + y--;
        System.out.println("x =" + x);
        System.out.println("y =" + y);
        System.out.println("z =" + z);
        
        var resultado = 4 + 5 *6 / 3;//4 + ((5*6)/3)
        System.out.println("resultado:" + resultado);//14
        resultado = (5+4)*6/3;
        System.out.println("resultado:" + resultado);
    
    }
    }
    
    

    

