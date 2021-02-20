package accesodatos;
public class ImplementacionMySQL implements IAccesoDatos {//cuando queremos que jale el comportamiento de la interface colocamos implements

    @Override//implementa el metodo por primera vez 
    public void insertar() {
           System.out.println("Insertar desde MySQL");
    }

    @Override
    public void listar() {
            System.out.println("listar  desde MySQL");
    }

    @Override
    public void actualizar() {
            System.out.println("Actualizar desde MySQL");

    }

    @Override
    public void eliminar() {
             System.out.println("Eliminar desde MySQL");

    }
    
    
}
