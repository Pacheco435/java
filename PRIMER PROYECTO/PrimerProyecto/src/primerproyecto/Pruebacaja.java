
package primerproyecto;

public class Pruebacaja {
    public static void main(String[] args) {
        int medidaAncho = 3;
        int medidaAlto = 2;
        int medidaProfundo = 6;
        
        PrimerProyecto caja1 = new PrimerProyecto();
        caja1.ancho = medidaAncho;
        caja1.alto = medidaAlto;
        caja1.profundo = medidaProfundo;
        int resultado =caja1.CalcularVolumen();
        
        System.out.println("resultado de volumen de la caja 1= " + resultado);
        
        PrimerProyecto caja2 = new PrimerProyecto (2,4,6);
        System.out.println("caja2 volumen de la caja 2 = " + caja2.CalcularVolumen());
    }
    
}
