
package Operaciones;


public class Aritmetica {
//definicion de atributos 
int a;
int b;

// constructor vacio viene por defecto

public Aritmetica (){
    System.out.println("ejecutando contructor");
}

public Aritmetica(int a,int b){
this.a = a;
this.b= b;
    System.out.println("constructor con argumentos ");
}
// metodos 8los metodos inician con minuscula 
public void sumar(){
int resultado = a + b;
    System.out.println("resultado = " + resultado);
}
public int sumarconRetorno(){
 //int resultado = a + b;
 //return resultado;
 return a+b;
}

public int sumarConArgumentos(int a, int b){
this.a= a;//el argumento a se asigna al atributo this.a
this.b= b;
//return a+b;
return this.sumarconRetorno();
}
}
