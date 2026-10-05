package formulariorichmond;

import javax.swing.SwingUtilities;
import vistas.Login;

/** Punto de entrada del proyecto Richmond. */
public class FormularioRichmond {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Login().setVisible(true));
    }
}
