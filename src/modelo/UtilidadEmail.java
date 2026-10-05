package modelo;

import java.io.File;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

/**
 * Envío del resultado de Richmond por SMTP.
 */
public class UtilidadEmail {

    private static final String REGEX_DNI = "^[0-9]{8}[A-Za-z]$";
    private static final String REGEX_TELEFONO = "^[0-9]{9}$";
    private static final String REGEX_EMAIL = "^[\\w._%+\\-]+@[\\w.\\-]+\\.[a-zA-Z]{2,}$";
    private static final String REGEX_CP = "^[0-9]{5}$";
    private static final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";

    private static final String SERVIDOR = "smtp.hostinger.com";
    private static final int PUERTO = 465;
    private static final String CUENTA = "noreply@reynaldomd.com";
    private static final String CLAVE = "2023-Online";

    private String asunto;
    private String mensaje;
    private String destinatario;
    private String ruta;
    private String nombreAdjunto;

    public static boolean validarDNI(String dni) {
        if (dni == null || !dni.matches(REGEX_DNI)) return false;
        return Character.toUpperCase(dni.charAt(8)) == LETRAS_DNI.charAt(Integer.parseInt(dni.substring(0, 8)) % 23);
    }

    public static boolean validarTelefono(String telefono) {
        return telefono != null && telefono.matches(REGEX_TELEFONO);
    }

    public static boolean validarEmail(String email) {
        return email != null && email.matches(REGEX_EMAIL);
    }

    public static boolean validarCP(String cp) {
        return cp != null && cp.matches(REGEX_CP);
    }

    public static boolean compruebaCampoVacio(JTextField campo) {
        return campo != null && !campo.getText().trim().isEmpty();
    }

    public static boolean compruebaDNI(JTextField campo) {
        return campo != null && validarDNI(campo.getText().trim());
    }

    public static boolean compruebaFormatoDNI(JTextField campo) {
        return campo != null && campo.getText().trim().matches(REGEX_DNI);
    }

    public static boolean compruebaTelefono(JTextField campo) {
        return campo != null && validarTelefono(campo.getText().trim());
    }

    public static boolean compruebaEmail(JTextField campo) {
        return campo != null && validarEmail(campo.getText().trim());
    }

    public static boolean compruebaCP(JTextField campo) {
        return campo != null && validarCP(campo.getText().trim());
    }

    public static boolean compruebaEntero(JTextField campo) {
        if (campo == null) return false;
        try { return Integer.parseInt(campo.getText().trim()) > 0; }
        catch (NumberFormatException ex) { return false; }
    }

    public static boolean compruebaDouble(JTextField campo) {
        if (campo == null) return false;
        try {
            double valor = Double.parseDouble(campo.getText().trim().replace(',', '.'));
            return Double.isFinite(valor) && valor > 0;
        } catch (NumberFormatException ex) { return false; }
    }

    public static boolean compruebaCombo(JComboBox<?> combo) {
        return combo != null && combo.getSelectedIndex() > 0;
    }

    public static void lanzaAlertaVacio(String campo) { alerta("El campo '" + campo + "' es obligatorio.", "Campo requerido"); }
    public static void lanzaAlertaDni() { alerta("El formato del DNI no es correcto o su letra no corresponde.", "DNI no válido"); }
    public static void lanzaAlertaTelefono() { alerta("El teléfono debe tener 9 dígitos.", "Teléfono no válido"); }
    public static void lanzaAlertaEmail() { alerta("El formato del email no es correcto.", "Email no válido"); }
    public static void lanzaAlertaCP() { alerta("El código postal debe tener 5 dígitos.", "CP no válido"); }
    public static void lanzaAlertaEntero() { alerta("Debe introducir un número entero positivo.", "Valor no válido"); }
    public static void lanzaAlertaDouble() { alerta("Debe introducir un número decimal positivo.", "Valor no válido"); }
    public static void lanzaAlertaCombo(String campo) { alerta("Debe seleccionar una opción en '" + campo + "'.", "Selección requerida"); }

    public static boolean compruebaGrupo(ButtonGroup grupo, String pregunta) {
        boolean valido = grupo != null && grupo.getSelection() != null;
        if (!valido) alerta("Selecciona una respuesta para " + pregunta + ".", "Campo obligatorio");
        return valido;
    }

    private static void alerta(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.WARNING_MESSAGE);
    }

    public UtilidadEmail() {
    }

    public UtilidadEmail(String asunto, String mensaje, String destinatario, String ruta, String nombreAdjunto) {
        this.asunto = asunto;
        this.mensaje = mensaje;
        this.destinatario = destinatario;
        this.ruta = ruta;
        this.nombreAdjunto = nombreAdjunto;
    }

    public UtilidadEmail(String asunto, String mensaje, String destinatario) {
        this(asunto, mensaje, destinatario, null, null);
    }

    public Boolean mail() {
        try {
            boolean adjuntar = ruta != null && !ruta.isBlank();
            Email email = adjuntar ? new MultiPartEmail() : new SimpleEmail();
            email.setHostName(SERVIDOR);
            email.setSmtpPort(PUERTO);
            email.setAuthenticator(new DefaultAuthenticator(CUENTA, CLAVE));
            email.setSSLOnConnect(true);
            email.setCharset("UTF-8");
            email.setFrom(CUENTA);
            email.setSubject(asunto);
            email.addTo(destinatario);
            if (email instanceof MultiPartEmail multiPartEmail) {
                File archivo = new File(ruta);
                if (!archivo.isFile() || !archivo.canRead()) {
                    System.getLogger(UtilidadEmail.class.getName()).log(System.Logger.Level.ERROR,
                            "No se encuentra el archivo adjunto: " + archivo.getAbsolutePath());
                    return false;
                }
                EmailAttachment adjunto = new EmailAttachment();
                adjunto.setPath(archivo.getAbsolutePath());
                adjunto.setDisposition(EmailAttachment.ATTACHMENT);
                adjunto.setName(nombreAdjunto == null || nombreAdjunto.isBlank() ? archivo.getName() : nombreAdjunto);
                multiPartEmail.attach(adjunto);
                multiPartEmail.setMsg(mensaje);
            } else {
                email.setMsg(mensaje);
            }
            email.send();
            return true;
        } catch (EmailException ex) {
            System.getLogger(UtilidadEmail.class.getName()).log(System.Logger.Level.ERROR, "No se pudo enviar el correo", ex);
            return false;
        }
    }
}
