package domain;

public class PersonaDTO {
private int id_Persona;
private String nombre;
private String apellido;
private String email;
private String telefono;

public PersonaDTO(){
}

    public PersonaDTO(int id_Persona) {
        this.id_Persona = id_Persona;
    }

    public PersonaDTO(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public PersonaDTO(int idPersona, String nombre, String apellido, String email, String telefono) {
        this.id_Persona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public int getIdPersona() {
        return id_Persona;
    }

    public void setIdPersona(int idPersona) {
        this.id_Persona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + id_Persona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }
    

}