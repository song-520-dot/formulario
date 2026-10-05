package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Usuario;


public class Conexion {
    public record ResumenResultados(int total, int alta, int moderada, int dudosa, int baja) { }

    private static final String URL = "jdbc:mysql://195.35.53.72:3306/u812167471_richmond?useUnicode=true&characterEncoding=UTF-8";
    private static final String USUARIO = "u812167471_richmond";
    private static final String CLAVE = "2026-Dam";
    protected static Connection conn;

    private Conexion() { }

    public static synchronized Connection conectar() {
        try {
            if (conn == null || conn.isClosed()) {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
            }
            return conn;
        } catch (ClassNotFoundException | SQLException ex) {
            System.getLogger(Conexion.class.getName()).log(System.Logger.Level.ERROR, "No se pudo conectar a Richmond", ex);
            return null;
        }
    }

    public static synchronized void cerrarConexion() {
        try {
            if (conn != null && !conn.isClosed()) conn.close();
        } catch (SQLException ex) {
            System.getLogger(Conexion.class.getName()).log(System.Logger.Level.ERROR, "No se pudo cerrar la conexión", ex);
        } finally {
            conn = null;
        }
    }

    /** Comprueba las credenciales y devuelve el nombre asociado, o null si no coinciden. */
    public static String autenticarUsuario(String usuario, String contrasena) throws SQLException {
        Connection conexion = obtenerConexion();
        String sql = "SELECT nombre FROM usuarios WHERE usuario = ? AND contrasena = ?";
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, usuario);
            ps.setString(2, contrasena);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next() ? rs.getString("nombre") : null;
            }
        } finally {
            cerrarConexion();
        }
    }

    /** Registra una cuenta nueva. */
    public static void registrarUsuario(Usuario usuario) throws SQLException {
        Connection conexion = obtenerConexion();
        String sql = "INSERT INTO usuarios (nombre, apellidos, usuario, contrasena) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellidos());
            ps.setString(3, usuario.getUsuario());
            ps.setString(4, usuario.getContrasena());
            ps.executeUpdate();
        } finally {
            cerrarConexion();
        }
    }

    /** Guarda las respuestas y el encuestador de un formulario Richmond. */
    public static void guardarFormulario(int q1, int q2, int q3, int q4, String encuestador) throws SQLException {
        Connection conexion = obtenerConexion();
        String sql = "INSERT INTO formulario (q1, q2, q3, q4, encuestador) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setInt(1, q1);
            ps.setInt(2, q2);
            ps.setInt(3, q3);
            ps.setInt(4, q4);
            ps.setString(5, encuestador);
            ps.executeUpdate();
        } finally {
            cerrarConexion();
        }
    }

    /** Obtiene el total de encuestas y el recuento de cada nivel de motivación. */
    public static ResumenResultados obtenerResumenFormularios() throws SQLException {
        Connection conexion = obtenerConexion();
        String puntuacion = "(q1 + q2 + q3 + q4)";
        String sql = "SELECT COUNT(*) AS total, "
                + "COALESCE(SUM(CASE WHEN " + puntuacion + " BETWEEN 8 AND 10 THEN 1 ELSE 0 END), 0) AS alta, "
                + "COALESCE(SUM(CASE WHEN " + puntuacion + " BETWEEN 6 AND 7 THEN 1 ELSE 0 END), 0) AS moderada, "
                + "COALESCE(SUM(CASE WHEN " + puntuacion + " BETWEEN 4 AND 5 THEN 1 ELSE 0 END), 0) AS dudosa, "
                + "COALESCE(SUM(CASE WHEN " + puntuacion + " BETWEEN 0 AND 3 THEN 1 ELSE 0 END), 0) AS baja "
                + "FROM formulario";
        try (PreparedStatement ps = conexion.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) throw new SQLException("La consulta no devolvió el resumen de resultados.");
            return new ResumenResultados(rs.getInt("total"), rs.getInt("alta"),
                    rs.getInt("moderada"), rs.getInt("dudosa"), rs.getInt("baja"));
        } finally {
            cerrarConexion();
        }
    }

    private static Connection obtenerConexion() throws SQLException {
        Connection conexion = conectar();
        if (conexion == null) throw new SQLException("No se pudo conectar con la base de datos.");
        return conexion;
    }
}
