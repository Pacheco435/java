
package primerproyecto;
public class PrimerProyecto {
int ancho;
int alto;
int profundo;
 
public PrimerProyecto (){

}
public PrimerProyecto(int ancho, int alto, int profundo){
this.ancho= ancho;
this.alto= alto;
this.profundo= profundo;
}
public int  CalcularVolumen(){
 return ancho*alto*profundo;
}
    
}
