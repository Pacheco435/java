package test;

import Domein.FiguraGeometrica;
import Domein.Rectangulo;

public class TestdeClasesAbstractas {
    public static void main(String[] args) {
        //FiguraGeometrica figura = new FiguraGeometrica();
        
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
    }
    
}
