/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vistas;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import bbdd.Conexion;
import modelo.UtilidadEmail;
import modelo.Usuario;

/**
 *
 * @author song
 */
public class Registro extends javax.swing.JDialog {

    public Registro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        botonRegistrar.addActionListener(this::registrarUsuario);
        setLocationRelativeTo(parent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        imagenCabecera = new javax.swing.JLabel();
        bordeRegistro = new javax.swing.JPanel();
        etiquetaNombre = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        etiquetaApellidos = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JTextField();
        separadorRegistro = new javax.swing.JSeparator();
        etiquetaUsuario = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        etiquetaContrasena = new javax.swing.JLabel();
        campoContrasena = new javax.swing.JPasswordField();
        botonRegistrar = new javax.swing.JButton();
        botonVolverLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REGISTRO");
        setResizable(false);
        setSize(new java.awt.Dimension(700, 530));

        fondo.setBackground(new java.awt.Color(0, 0, 0));
        fondo.setPreferredSize(new java.awt.Dimension(700, 530));

        imagenCabecera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/detallePie.png"))); // NOI18N

        bordeRegistro.setBackground(new java.awt.Color(204, 0, 51));
        bordeRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)), "CREAR CUENTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(204, 0, 51))); // NOI18N
        bordeRegistro.setOpaque(false);

        etiquetaNombre.setText("Nombre");
        etiquetaNombre.setForeground(new java.awt.Color(224, 0, 0));
        etiquetaNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        campoNombre.setName("NOMBRE"); // NOI18N

        etiquetaApellidos.setText("Apellidos");
        etiquetaApellidos.setForeground(new java.awt.Color(224, 0, 0));
        etiquetaApellidos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        etiquetaUsuario.setText("Usuario");
        etiquetaUsuario.setForeground(new java.awt.Color(224, 0, 0));
        etiquetaUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        etiquetaContrasena.setText("Contraseña");
        etiquetaContrasena.setForeground(new java.awt.Color(224, 0, 0));
        etiquetaContrasena.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        botonRegistrar.setText("Registrar");
        botonRegistrar.setBackground(new java.awt.Color(215, 0, 0));
        botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonRegistrar.setFocusPainted(false);

        botonVolverLogin.setText("Volver al Login");
        botonVolverLogin.setBackground(new java.awt.Color(215, 0, 0));
        botonVolverLogin.setForeground(new java.awt.Color(255, 255, 255));
        botonVolverLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonVolverLogin.setFocusPainted(false);
        botonVolverLogin.addActionListener(this::volverLogin);

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagenCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(etiquetaApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(botonVolverLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(separadorRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(etiquetaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(etiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(campoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(etiquetaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bordeRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(imagenCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(etiquetaApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(botonVolverLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(separadorRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(etiquetaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(etiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(campoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(etiquetaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bordeRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bordeRegistro;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton botonVolverLogin;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JPasswordField campoContrasena;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel etiquetaApellidos;
    private javax.swing.JLabel etiquetaContrasena;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaUsuario;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel imagenCabecera;
    private javax.swing.JSeparator separadorRegistro;
    // End of variables declaration//GEN-END:variables
  private void volverLogin(java.awt.event.ActionEvent evt) {
        java.awt.Window parent = getOwner();
        dispose();
        if (parent != null) {
            parent.setVisible(true);
        }
    }

    private void registrarUsuario(java.awt.event.ActionEvent evt) {
        if (!UtilidadEmail.compruebaCampoVacio(campoNombre)) {
            UtilidadEmail.lanzaAlertaVacio("Nombre");
            return;
        } else if (!UtilidadEmail.compruebaCampoVacio(campoApellidos)) {
            UtilidadEmail.lanzaAlertaVacio("Apellidos");
            return;
        } else if (!UtilidadEmail.compruebaCampoVacio(campoUsuario)) {
            UtilidadEmail.lanzaAlertaVacio("Usuario");
            return;
        } else if (new String(campoContrasena.getPassword()).isBlank()) {
            campoContrasena.setText("");
            UtilidadEmail.lanzaAlertaVacio("Contraseña");
            return;
        }
        String contrasena = new String(campoContrasena.getPassword());
        try {
            Usuario usuario = new Usuario(campoNombre.getText().trim(), campoApellidos.getText().trim(),
                    campoUsuario.getText().trim(), contrasena);
            Conexion.registrarUsuario(usuario);
            JOptionPane.showMessageDialog(this, "Usuario registrado correctamente.", "Registro", JOptionPane.INFORMATION_MESSAGE);
            campoNombre.setText(""); campoApellidos.setText(""); campoUsuario.setText(""); campoContrasena.setText("");
        } catch (SQLException ex) {
            System.getLogger(Registro.class.getName()).log(System.Logger.Level.ERROR, "No se pudo registrar el usuario", ex);
            String mensaje = ex.getErrorCode() == 1062 ? "Ese nombre de usuario ya existe." : "No se pudo registrar. Comprueba que existe la tabla usuarios (nombre, apellidos, usuario, contrasena).";
            JOptionPane.showMessageDialog(this, mensaje, "Error de registro", JOptionPane.ERROR_MESSAGE);
            campoUsuario.setText("");
            campoUsuario.requestFocusInWindow();
        }
    }}
