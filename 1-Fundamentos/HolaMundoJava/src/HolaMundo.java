
import java.util.Scanner;

//Mi clase en Java
public class HolaMundo {

    public static void main(String args[]) {
        tarea1();
    }

    public static void OperadorIf() {
        var condicion = false;
        if (condicion) {
            System.out.println("condicion verdadera");
        } else {
            System.out.println("condicion falsa");
        }

        var numero = 5;
        var numerotexto = "Numero desconocido";

        if (numero == 1) {
            numerotexto = "numero uno";
        } else if (numero == 2) {
            numerotexto = "numero dos";
        } else if (numero == 3) {
            numerotexto = "numero tres";
        } else if (numero == 4) {
            numerotexto = "numero 4";
        } else {
            numerotexto = "no encontrado";
        }
        System.out.println("numerotexto = " + numerotexto);
    }
    public static void Estaciones() {
        var  consola = new Scanner(System.in);
        System.out.println("Escribe el mes en numero");
        var mes = Integer.parseInt(consola.nextLine());
        System.out.println("mes="+mes); 
        
        var estacion = "Estacion desconocida";
        
        if (mes == 1 || mes == 2 || mes == 12){
            estacion = "invierno";
        } 
        else if (mes == 3 || mes == 4 || mes == 5){
            estacion = "primavera";
        }
        else if (mes == 6 || mes == 7 || mes == 8){
            estacion = "verano";
        }
        else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "otonio";
        }
        System.out.println("estacion=" + estacion);
    }
    public static void MetodoSwitch (){
    var numero = 2;
    var numerotexto= "valor desconocido";
    
    switch(numero){
        case 1:
            numerotexto = "numero uno";
            break;
        case 2:
            numerotexto = "numero dos";
            break;
        case 3:
            numerotexto ="nemero tres";
            break;
        case 4:
            numerotexto = "numero cuatro";
            break;
        default:
            numerotexto = "caso no encotrado";
    }
        System.out.println("numeroTexto=" + numerotexto);
    }
    public static void SwitchII (){
    //var mes = 6;
     var  consola = new Scanner(System.in);
        System.out.println("Escribe el mes en numero");
        var mes = Integer.parseInt(consola.nextLine());
        System.out.println("mes="+mes); 
    var estacion = "Estacio descocnocida";
    switch (mes){
        case 1: case 2: case 12:
            estacion = "Invierno";
                    break;
        case 3: case 4: case 5 :
            estacion = "Primavera";
            break;
        case 6: case 7 :case 8:
            estacion ="Verano";
            break;
        case 9: case 10: case 11:
            estacion= "Otonio";
            break;
    }
        System.out.println("Estacion=" + estacion);
    }
    public static void tarea1 (){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10");
        int calificacion = Integer.parseInt(scanner.nextLine());
        if (calificacion >=9 &&calificacion <=10)
            System.out.println("A");
        else if(calificacion >= 8 && calificacion <9)
            System.out.println("B");
        else if (calificacion >=7 && calificacion < 8)
            System.out.println("C");
        else if (calificacion >=6 && calificacion <7)
            System.out.println("D");
        else if (calificacion >=0 && calificacion <6)
            System.out.println("F");
        else
        System.out.println("valor desconocido");
    }
}
