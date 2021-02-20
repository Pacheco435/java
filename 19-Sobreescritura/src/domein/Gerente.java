package domein;

public class Gerente extends Empleado {
    
    private String departamento;
    
    public Gerente(String nombre, double sueldo,String departamento){
    super(nombre, sueldo);
    this.departamento = departamento;
    }
    @Override //se esta sobreescribiendo un metodo de la clase padre empleado
    public  String obtenerDetalles(){
    return super.obtenerDetalles() + ", departamento" + this.departamento;
    }
}
