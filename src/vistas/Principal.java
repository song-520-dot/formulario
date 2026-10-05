/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vistas;

import java.awt.BorderLayout;
import java.awt.Dimension;

public class Principal extends javax.swing.JFrame {

    private final String nombreUsuario;

    public Principal(java.awt.Frame parent, boolean modal) {
        super();
        this.nombreUsuario = "";
        initComponents();
        configurarVentana();
        setLocationRelativeTo(parent);
    }

    public Principal(String nombreUsuario) {
        super();
        this.nombreUsuario = nombreUsuario == null || nombreUsuario.isBlank() ? "usuario" : nombreUsuario;
        initComponents();
        bienvenida.setText("Bienvenido " + this.nombreUsuario);
        configurarVentana();
        setLocationRelativeTo(null);
    }

    public Principal() {
        this((java.awt.Frame) null, false);
    }

    private void configurarVentana() {
        setMinimumSize(new Dimension(1060, 700));
        setSize(1060, 700);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenidoPrincipal = new javax.swing.JPanel();
        fondo = new javax.swing.JPanel();
        barraInferior = new javax.swing.JPanel();
        bienvenida = new javax.swing.JLabel();
        imagenLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        contenidoPrincipal.setBackground(new java.awt.Color(238, 238, 238));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1060, 700));
        setSize(new java.awt.Dimension(1060, 700));

        fondo.setBackground(new java.awt.Color(0, 0, 0));
        fondo.setPreferredSize(new java.awt.Dimension(1060, 700));

        barraInferior.setBackground(new java.awt.Color(0, 0, 0));

        bienvenida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bienvenida.setForeground(new java.awt.Color(224, 0, 0));
        bienvenida.setText("Bienvenido admin");

        imagenLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/encuesta_cabecera.png"))); // NOI18N

        jPanel1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(barraInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagenLogo)
                .addGap(27, 27, 27))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(imagenLogo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void abrirEncuesta(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirEncuesta
        NuevoFormulario formulario = new NuevoFormulario(this, true);
        formulario.setEncuestador(nombreUsuario);
        formulario.setVisible(true);
    }//GEN-LAST:event_abrirEncuesta



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraInferior;
    private javax.swing.JLabel bienvenida;
    private javax.swing.JPanel contenidoPrincipal;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel imagenLogo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    private void abrirResultados(java.awt.event.ActionEvent evt) {
        new Resultados(this, true).setVisible(true);
    }}
