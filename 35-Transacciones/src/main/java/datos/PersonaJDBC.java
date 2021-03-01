package datos;

import domain.Persona;
import java.sql.*;
import java.util.*;

public class PersonaJDBC {

private Connection conexionTransaccional;
    
private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono  FROM persona"; 
private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";
private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?,email = ?, telefono =? WHERE id_persona = ?";
private static final String SQL_DELETE  = "DELETE FROM persona WHERE id_persona = ?";

public PersonaJDBC(Connection conexionTransaccional){
this.conexionTransaccional = conexionTransaccional;
}

    public PersonaJDBC() {
    }


public List<Persona> select() throws SQLException{
Connection conn = null;
PreparedStatement stmt = null;
ResultSet rs = null;
Persona persona = null;
List<Persona> personas = new ArrayList<>();

    try {
        conn = this.conexionTransaccional != null  ? this.conexionTransaccional: Conexion.getConnection();
        stmt = conn.prepareCall(SQL_SELECT);
        rs = stmt.executeQuery();
        while(rs.next()){
        int idPersona= rs.getInt("id_persona");
        String nombre = rs.getNString("nombre");
        String apellido = rs.getString("apellido");
        String email = rs.getString("email");
        String telefono = rs.getString("telefono");
        
        persona =  new Persona(idPersona,nombre , apellido , email, telefono);
        
        personas.add(persona);
        }
        
    } 
    finally{
    try {
        Conexion.close(rs);
        Conexion.close(stmt);
        
        if (this.conexionTransaccional == null){
        Conexion.close(conn);
        }
    
    }   catch (SQLException ex) {
        ex.printStackTrace(System.out);
    }
    }
    return personas;
}
public int insert(Persona persona) throws SQLException{
Connection conn = null;
PreparedStatement stmt = null;
int registros = 0;
    try {
        conn = this.conexionTransaccional != null  ? this.conexionTransaccional: Conexion.getConnection();
        stmt = conn.prepareStatement(SQL_INSERT);
        stmt.setString(1, persona.getNombre());
        stmt.setString(2, persona.getApellido());
        stmt.setString(3, persona.getEmail());
        stmt.setString(4,persona.getTelefono());
        registros = stmt.executeUpdate();
    } 
    finally{
    try {
        Conexion.close(stmt);
        if (this.conexionTransaccional == null){
        Conexion.close(conn);
        }
    } catch (SQLException ex) {
    ex.printStackTrace(System.out);
     }
    }
    return registros;
}
public int update(Persona persona) throws SQLException{
Connection conn = null;
PreparedStatement stmt = null;
int registros = 0;
    try {
        conn = this.conexionTransaccional != null  ? this.conexionTransaccional: Conexion.getConnection();
        stmt = conn.prepareStatement(SQL_UPDATE);
        stmt.setString(1, persona.getNombre());
        stmt.setString(2, persona.getApellido());
        stmt.setString(3, persona.getEmail());
        stmt.setString(4,persona.getTelefono());
        stmt.setInt(5, persona.getIdPersona());
        registros = stmt.executeUpdate();
    } 
    finally{
    try {
        Conexion.close(stmt);
        if (this.conexionTransaccional == null){
        Conexion.close(conn);
        }
    } catch (SQLException ex) {
    ex.printStackTrace(System.out);
     }
    }
    return registros;
}
public int delete(Persona persona) throws SQLException{
Connection conn = null;
PreparedStatement stmt = null;
int registros = 0;
    try {
        conn = this.conexionTransaccional != null  ? this.conexionTransaccional: Conexion.getConnection();
        stmt = conn.prepareStatement(SQL_DELETE);
        stmt.setInt(1, persona.getIdPersona());
        registros = stmt.executeUpdate();
    } 
    finally{
    try {
        Conexion.close(stmt);
        if (this.conexionTransaccional == null){
        Conexion.close(conn);
        }
    } catch (SQLException ex) {
    ex.printStackTrace(System.out);
     }
    }
    return registros;
}

}
