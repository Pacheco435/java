//Mi clase en Java

public class HolaMundo {

    public static void main(String args[]) {
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        var i = 3;
        var j = 4;
        System.out.println (i + j);// se realiza la suma de numeros 
        System.out.println(i + j + usuario);// Evaluacion de izquierdaa a derecha relaiza suma 
        System.out.println(usuario + i + j );// contexto cadena todo lo toma como cadena 
        System.out.println(usuario + (i + j) );// modifica la prioridad en la evaluacion primero se hace  la suma 
    }

}
