package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
//        System.out.println("Dia1:" + Dias.LUNES);
//        indicarDiaSemana(Dias.MARTES);
//        indicarDiaSemana(Dias.LUNES);

        System.out.println("Continente no. 4:" + Continentes.AMERICA);
        System.out.println("Nro Pises en el 4to continente = " + Continentes.AMERICA.getPaises());
        System.out.println("Continente no. 1:" + Continentes.AFRICA);
        System.out.println("Nro Pises en el 1er continente = " + Continentes.AFRICA.getPaises());
    }
    
    private static void indicarDiaSemana(Dias dias){
    switch(dias){
        case LUNES:
            System.out.println("Primer dias de la semana");
            break;
        case MARTES:
            System.out.println("Segundo dia dela semana");
    }
    }
    
}
