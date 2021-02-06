import java.util.Scanner;
public class Ciclos {
    public static void main(String args[]) {
      IIIcontinue();
    } 
    public static void Owhile() {
    var contador = 0;
    while ( contador < 3){
        System.out.println("contador="+ contador);
        contador++;
    }
    }
    public static void IdoWhile(){
    var contador = 0;
    do{
        System.out.println("contador=" + contador);
        contador++;
    }while(contador < 3);
}
    public static void IIfor(){
    for(var contador = 0; contador <3;contador++){
        if ( contador % 2 == 0){
        System.out.println("contador="+ contador);
        break;
    }   
    }
    }
    public static void IIIcontinue (){
    for(var contador = 0; contador < 3; contador++){
    if ( contador %2 != 0){
    continue;// ir a la siguiente iteracion
    }
        System.out.println("contador=" + contador );
    }
    }
    public static void UsodeEtiquetas(){
        inicio:
        for(var contador = 0; contador < 3; contador++){
    if ( contador %2 != 0){
    continue inicio;// ir a la linea de codigo de la etiqueta creada
    }
        System.out.println("contador=" + contador );
        }
    }
}