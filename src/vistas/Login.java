/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import bbdd.Conexion;
import modelo.UtilidadEmail;

/**
 *
 * @author song
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

     public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        tituloLogin = new javax.swing.JLabel();
        etiquetaUsuario = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        etiquetaContrasena = new javax.swing.JLabel();
        campoContrasena = new javax.swing.JPasswordField();
        botonEntrar = new javax.swing.JButton();
        imagenEncuesta = new javax.swing.JLabel();
        botonCerrar = new javax.swing.JButton();
        textoRegistro = new javax.swing.JLabel();
        botonCrearCuenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 500));

        fondo.setBackground(new java.awt.Color(0, 0, 0));
        fondo.setPreferredSize(new java.awt.Dimension(900, 500));

        tituloLogin.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tituloLogin.setForeground(new java.awt.Color(224, 0, 0));
        tituloLogin.setText("LOGIN");

        etiquetaUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaUsuario.setForeground(new java.awt.Color(239, 0, 0));
        etiquetaUsuario.setText("Usuario");

        etiquetaContrasena.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiquetaContrasena.setForeground(new java.awt.Color(239, 0, 0));
        etiquetaContrasena.setText("Contraseña");

        botonEntrar.setBackground(new java.awt.Color(215, 0, 0));
        botonEntrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        botonEntrar.setText("Entrar");
        botonEntrar.setFocusPainted(false);
        botonEntrar.addActionListener(this::abrirPrincipal);

        imagenEncuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ENCUESTA.png"))); // NOI18N

        botonCerrar.setBackground(new java.awt.Color(215, 0, 0));
        botonCerrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonCerrar.setForeground(new java.awt.Color(255, 255, 255));
        botonCerrar.setText("cerrar");
        botonCerrar.setFocusPainted(false);
        botonCerrar.addActionListener(this::cerrarAplicacion);

        textoRegistro.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        textoRegistro.setForeground(new java.awt.Color(224, 0, 0));
        textoRegistro.setText("Registrese si no tiene cuenta");

        botonCrearCuenta.setBackground(new java.awt.Color(215, 0, 0));
        botonCrearCuenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        botonCrearCuenta.setText("Crear cuenta");
        botonCrearCuenta.setFocusPainted(false);
        botonCrearCuenta.addActionListener(this::abrirRegistro);

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(etiquetaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(etiquetaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(campoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(botonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78)
                .addComponent(imagenEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(botonCerrar)
                .addGap(410, 410, 410)
                .addComponent(textoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(botonCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(tituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(etiquetaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(etiquetaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(campoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(botonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagenEncuesta))
                .addGap(38, 38, 38)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(textoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonCrearCuenta;
    private javax.swing.JButton botonEntrar;
    private javax.swing.JPasswordField campoContrasena;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel etiquetaContrasena;
    private javax.swing.JLabel etiquetaUsuario;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel imagenEncuesta;
    private javax.swing.JLabel textoRegistro;
    private javax.swing.JLabel tituloLogin;
    // End of variables declaration//GEN-END:variables
  private void abrirPrincipal(java.awt.event.ActionEvent evt) {
        if (!UtilidadEmail.compruebaCampoVacio(campoUsuario)) {
            UtilidadEmail.lanzaAlertaVacio("Usuario");
            return;
        }
        String clave = new String(campoContrasena.getPassword());
        if (clave.isBlank()) {
            campoContrasena.setText("");
            UtilidadEmail.lanzaAlertaVacio("Contraseña");
            return;
        }
        try {
            String nombre = Conexion.autenticarUsuario(campoUsuario.getText().trim(), clave);
            if (nombre == null) {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Acceso denegado", JOptionPane.WARNING_MESSAGE);
                campoContrasena.setText("");
                campoContrasena.requestFocusInWindow();
                return;
            }
            dispose();
            new Principal(nombre).setVisible(true);
        } catch (SQLException ex) {
            System.getLogger(Login.class.getName()).log(System.Logger.Level.ERROR, "No se pudo validar el usuario", ex);
            JOptionPane.showMessageDialog(this, "No se pudo validar el acceso. Comprueba la tabla usuarios.", "Error de acceso", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void abrirRegistro(java.awt.event.ActionEvent evt) {
        setVisible(false);
        Registro dialog = new Registro(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
        setVisible(true);
    }

    private void cerrarAplicacion(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

   }
