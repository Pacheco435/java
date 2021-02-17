package enumeracion;

public enum Continentes {
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);//se  lecoloca punto y coma si se desea agragar mas atributos
    
    private final int paises;
    
    Continentes(int paises){
    this.paises = paises;
    }
    
    public int getPaises(){
    return this.paises;
    }
}
