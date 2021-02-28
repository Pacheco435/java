package test;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.sql.SQLException;

import java.util.List;

public class ManejoUsuarios {
    public static void main(String[] args) throws SQLException {
        UsuarioJDBC  usuarioJdbc = new UsuarioJDBC();
        
        //Ejecutando el listado de usuarios 
        List<Usuario> usuarios =  usuarioJdbc.select();
        for (Usuario usuario: usuarios){
            System.out.println("usuario = " + usuario);
        }
    }
    
}
