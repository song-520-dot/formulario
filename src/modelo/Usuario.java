package modelo;

/** Datos de una cuenta de usuario. */
public class Usuario {
    private final String nombre;
    private final String apellidos;
    private final String usuario;
    private final String contrasena;

    public Usuario(String nombre, String apellidos, String usuario, String contrasena) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public String getUsuario() { return usuario; }
    public String getContrasena() { return contrasena; }
}
