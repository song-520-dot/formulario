/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vistas;

import java.awt.event.ActionEvent;
import java.nio.file.Path;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import bbdd.Conexion;
import modelo.Formulario;
import modelo.UtilidadEmail;

/**
 *
 * @author song
 */
public class NuevoFormulario extends javax.swing.JDialog {

    public NuevoFormulario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
    }

    public NuevoFormulario(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoPregunta1 = new javax.swing.ButtonGroup();
        grupoPregunta2 = new javax.swing.ButtonGroup();
        grupoPregunta3 = new javax.swing.ButtonGroup();
        grupoPregunta4 = new javax.swing.ButtonGroup();
        fondo = new javax.swing.JPanel();
        pregunta1 = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        r1Si = new javax.swing.JRadioButton();
        r1No = new javax.swing.JRadioButton();
        pregunta2 = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        r2Mucho = new javax.swing.JRadioButton();
        r2Bastante = new javax.swing.JRadioButton();
        r2Algo = new javax.swing.JRadioButton();
        r2Nada = new javax.swing.JRadioButton();
        pregunta3 = new javax.swing.JLabel();
        separador3 = new javax.swing.JSeparator();
        r3Mucho = new javax.swing.JRadioButton();
        r3Bastante = new javax.swing.JRadioButton();
        r3Algo = new javax.swing.JRadioButton();
        r3Nada = new javax.swing.JRadioButton();
        pregunta4 = new javax.swing.JLabel();
        separador4 = new javax.swing.JSeparator();
        r4Si = new javax.swing.JRadioButton();
        r4Probable = new javax.swing.JRadioButton();
        r4Dudoso = new javax.swing.JRadioButton();
        r4No = new javax.swing.JRadioButton();
        botonEnviar = new javax.swing.JButton();
        textoPuntuacion = new javax.swing.JLabel();
        campoPuntuacion = new javax.swing.JTextField();
        textoNivel = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        checkEnviarEmail = new javax.swing.JCheckBox();
        campoEmail = new javax.swing.JTextField();
        botonEnviarEmail = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tituloEncuesta = new javax.swing.JLabel();
        encuestador = new javax.swing.JLabel();
        logoEncuesta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1150, 650));

        fondo.setBackground(new java.awt.Color(238, 238, 238));
        fondo.setPreferredSize(new java.awt.Dimension(1150, 650));

        pregunta1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pregunta1.setForeground(new java.awt.Color(208, 0, 0));
        pregunta1.setText("¿Le gustaría dejar de fumar si pudiera hacerlo fácilmente?");

        grupoPregunta1.add(r1Si);
        r1Si.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        r1Si.setForeground(new java.awt.Color(208, 0, 0));
        r1Si.setText("Sí");
        r1Si.setActionCommand("1");

        grupoPregunta1.add(r1No);
        r1No.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        r1No.setForeground(new java.awt.Color(208, 0, 0));
        r1No.setText("No");
        r1No.setActionCommand("0");

        pregunta2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pregunta2.setForeground(new java.awt.Color(208, 0, 0));
        pregunta2.setText("¿Cuánto interés tiene en dejarlo?");

        grupoPregunta2.add(r2Mucho);
        r2Mucho.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        r2Mucho.setForeground(new java.awt.Color(208, 0, 0));
        r2Mucho.setText("MUCHO");
        r2Mucho.setActionCommand("3");

        grupoPregunta2.add(r2Bastante);
        r2Bastante.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        r2Bastante.setForeground(new java.awt.Color(208, 0, 0));
        r2Bastante.setText("BASTANTE");
        r2Bastante.setActionCommand("2");

        grupoPregunta2.add(r2Algo);
        r2Algo.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        r2Algo.setForeground(new java.awt.Color(208, 0, 0));
        r2Algo.setText("ALGO");
        r2Algo.setActionCommand("1");
        r2Algo.addActionListener(this::r2AlgoActionPerformed);

        grupoPregunta2.add(r2Nada);
        r2Nada.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        r2Nada.setForeground(new java.awt.Color(208, 0, 0));
        r2Nada.setText("NADA");
        r2Nada.setActionCommand("0");

        pregunta3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pregunta3.setForeground(new java.awt.Color(208, 0, 0));
        pregunta3.setText("¿Intentará dejar de fumar en las próximas dos semanas?");

        grupoPregunta3.add(r3Mucho);
        r3Mucho.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        r3Mucho.setForeground(new java.awt.Color(208, 0, 0));
        r3Mucho.setText("MUCHO");
        r3Mucho.setActionCommand("3");

        grupoPregunta3.add(r3Bastante);
        r3Bastante.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        r3Bastante.setForeground(new java.awt.Color(208, 0, 0));
        r3Bastante.setText("BASTANTE");
        r3Bastante.setActionCommand("2");

        grupoPregunta3.add(r3Algo);
        r3Algo.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        r3Algo.setForeground(new java.awt.Color(208, 0, 0));
        r3Algo.setText("ALGO");
        r3Algo.setActionCommand("1");

        grupoPregunta3.add(r3Nada);
        r3Nada.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        r3Nada.setForeground(new java.awt.Color(208, 0, 0));
        r3Nada.setText("NADA");
        r3Nada.setActionCommand("0");

        pregunta4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pregunta4.setForeground(new java.awt.Color(208, 0, 0));
        pregunta4.setText("¿Cree que dentro de 6 meses no fumará?");

        grupoPregunta4.add(r4Si);
        r4Si.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        r4Si.setForeground(new java.awt.Color(208, 0, 0));
        r4Si.setText("SI");
        r4Si.setActionCommand("3");

        grupoPregunta4.add(r4Probable);
        r4Probable.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        r4Probable.setForeground(new java.awt.Color(208, 0, 0));
        r4Probable.setText("PROBABLE");
        r4Probable.setActionCommand("2");

        grupoPregunta4.add(r4Dudoso);
        r4Dudoso.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        r4Dudoso.setForeground(new java.awt.Color(208, 0, 0));
        r4Dudoso.setText("DUDOSO");
        r4Dudoso.setActionCommand("1");

        grupoPregunta4.add(r4No);
        r4No.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        r4No.setForeground(new java.awt.Color(208, 0, 0));
        r4No.setText("NO");
        r4No.setActionCommand("0");

        botonEnviar.setBackground(new java.awt.Color(0, 0, 0));
        botonEnviar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonEnviar.setForeground(new java.awt.Color(224, 0, 0));
        botonEnviar.setText("ENVIAR");
        botonEnviar.setFocusPainted(false);
        botonEnviar.addActionListener(this::botonEnviarActionPerformed);

        textoPuntuacion.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        textoPuntuacion.setText("Puntuación obtenida");

        campoPuntuacion.setEditable(false);
        campoPuntuacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        textoNivel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        textoNivel.setText("Nivel de motivación");

        barraProgreso.setMaximum(10);
        barraProgreso.setStringPainted(true);

        checkEnviarEmail.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        checkEnviarEmail.addItemListener(this::alternarCorreo);
        checkEnviarEmail.addActionListener(this::checkEnviarEmailActionPerformed);

        campoEmail.setEnabled(false);

        botonEnviarEmail.setText("Enviar");
        botonEnviarEmail.setEnabled(false);
        botonEnviarEmail.addActionListener(this::botonEnviarEmailActionPerformed);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        tituloEncuesta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tituloEncuesta.setForeground(new java.awt.Color(255, 255, 255));
        tituloEncuesta.setText("TEST DE MOTIVACIÓN PARA DEJAR DE FUMAR – RICHMOND");

        encuestador.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        encuestador.setForeground(new java.awt.Color(255, 255, 255));
        encuestador.setText("Encuestador: admin");

        logoEncuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/encuesta_cabecera_min.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(encuestador, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 514, Short.MAX_VALUE)
                .addComponent(logoEncuesta)
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoEncuesta)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tituloEncuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(encuestador, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setText("¿Recibir email?");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(pregunta1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(r1Si, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(r1No, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(pregunta2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(r2Mucho, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(r2Bastante, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(r2Algo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(r2Nada, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(pregunta3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(r3Mucho, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(r3Bastante, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(r3Algo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(r3Nada, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(separador3, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(pregunta4, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(r4Si, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(r4Probable, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(r4Dudoso, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(r4No, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(separador4, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(405, 405, 405)
                .addComponent(botonEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(textoPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(campoPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(textoNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(barraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(checkEnviarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(botonEnviarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pregunta1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1Si, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1No, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pregunta2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2Mucho, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2Bastante, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2Algo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2Nada, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pregunta3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3Mucho, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3Bastante, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3Algo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3Nada, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(separador3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pregunta4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4Si, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4Probable, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4Dudoso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4No, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(separador4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(botonEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(textoPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(campoPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(textoNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(barraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(checkEnviarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEnviarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void r2AlgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2AlgoActionPerformed
      
    }//GEN-LAST:event_r2AlgoActionPerformed

    private void botonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarActionPerformed
         calcularResultado(evt);
    }//GEN-LAST:event_botonEnviarActionPerformed

    private void botonEnviarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarEmailActionPerformed
        enviarResultadoEmail(evt);
    }//GEN-LAST:event_botonEnviarEmailActionPerformed

    private void checkEnviarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkEnviarEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkEnviarEmailActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JButton botonEnviar;
    private javax.swing.JButton botonEnviarEmail;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoPuntuacion;
    private javax.swing.JCheckBox checkEnviarEmail;
    private javax.swing.JLabel encuestador;
    private javax.swing.JPanel fondo;
    private javax.swing.ButtonGroup grupoPregunta1;
    private javax.swing.ButtonGroup grupoPregunta2;
    private javax.swing.ButtonGroup grupoPregunta3;
    private javax.swing.ButtonGroup grupoPregunta4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoEncuesta;
    private javax.swing.JLabel pregunta1;
    private javax.swing.JLabel pregunta2;
    private javax.swing.JLabel pregunta3;
    private javax.swing.JLabel pregunta4;
    private javax.swing.JRadioButton r1No;
    private javax.swing.JRadioButton r1Si;
    private javax.swing.JRadioButton r2Algo;
    private javax.swing.JRadioButton r2Bastante;
    private javax.swing.JRadioButton r2Mucho;
    private javax.swing.JRadioButton r2Nada;
    private javax.swing.JRadioButton r3Algo;
    private javax.swing.JRadioButton r3Bastante;
    private javax.swing.JRadioButton r3Mucho;
    private javax.swing.JRadioButton r3Nada;
    private javax.swing.JRadioButton r4Dudoso;
    private javax.swing.JRadioButton r4No;
    private javax.swing.JRadioButton r4Probable;
    private javax.swing.JRadioButton r4Si;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    private javax.swing.JSeparator separador4;
    private javax.swing.JLabel textoNivel;
    private javax.swing.JLabel textoPuntuacion;
    private javax.swing.JLabel tituloEncuesta;
    // End of variables declaration//GEN-END:variables
 
    private void alternarCorreo(java.awt.event.ItemEvent evt) {
        boolean activo = checkEnviarEmail.isSelected();
        campoEmail.setEnabled(activo);
        botonEnviarEmail.setEnabled(activo);
    }


    public void setEncuestador(String nombre) {
        encuestador.setText("Encuestador: " + (nombre == null || nombre.isBlank() ? "usuario" : nombre));
    }

    private void calcularResultado(ActionEvent evt) {
        String valor1 = obtenerPuntuacion(grupoPregunta1, "Pregunta 1", 0, 1);
        if (valor1 == null) return;
        String valor2 = obtenerPuntuacion(grupoPregunta2, "Pregunta 2", 0, 3);
        if (valor2 == null) return;
        String valor3 = obtenerPuntuacion(grupoPregunta3, "Pregunta 3", 0, 3);
        if (valor3 == null) return;
        String valor4 = obtenerPuntuacion(grupoPregunta4, "Pregunta 4", 0, 3);
        if (valor4 == null) return;

        int puntuacion = Integer.parseInt(valor1) + Integer.parseInt(valor2)
                + Integer.parseInt(valor3) + Integer.parseInt(valor4);
        Formulario formulario = new Formulario(puntuacion);
        campoPuntuacion.setText(Integer.toString(formulario.getPuntos()));
        barraProgreso.setValue(formulario.getPuntos());
        barraProgreso.setString(formulario.getPuntos() + " / 10");
        textoNivel.setText("Nivel de motivación: " + formulario.getNivel());
        guardarEncuesta();
    }

    private String obtenerPuntuacion(javax.swing.ButtonGroup grupo, String nombrePregunta, int minimo, int maximo) {
        if (!UtilidadEmail.compruebaGrupo(grupo, nombrePregunta)) return null;
        String valor = grupo.getSelection().getActionCommand();
        try {
            if (valor == null || valor.isBlank()) throw new NumberFormatException();
            int puntos = Integer.parseInt(valor);
            if (puntos >= minimo && puntos <= maximo) return valor;
        } catch (NumberFormatException ex) {
            
        }
        JOptionPane.showMessageDialog(this, "La respuesta de " + nombrePregunta + " no tiene una puntuación válida. Revisa su propiedad actionCommand.", "Respuesta no válida", JOptionPane.WARNING_MESSAGE);
        return null;
    }

    private void guardarEncuesta() {
        try {
            String nombreEncuestador = encuestador.getText().replaceFirst("^Encuestador:\\s*", "");
            Conexion.guardarFormulario(
                    puntosSeleccionados(grupoPregunta1), puntosSeleccionados(grupoPregunta2),
                    puntosSeleccionados(grupoPregunta3), puntosSeleccionados(grupoPregunta4),
                    nombreEncuestador);
        } catch (SQLException ex) {
            System.getLogger(NuevoFormulario.class.getName()).log(System.Logger.Level.ERROR, "No se pudo guardar la encuesta", ex);
            JOptionPane.showMessageDialog(this, "Se calculó la puntuación, pero no se pudo guardar en la tabla formulario.", "Error al guardar", JOptionPane.ERROR_MESSAGE);
        }
    }

    private int puntosSeleccionados(javax.swing.ButtonGroup grupo) {
        return Integer.parseInt(grupo.getSelection().getActionCommand());
    }

    private void enviarResultadoEmail(ActionEvent evt) {
        if (campoPuntuacion.getText().isBlank()) {
            JOptionPane.showMessageDialog(this,
                    "Primero completa y envía la encuesta para calcular la puntuación.",
                    "Falta la puntuación", JOptionPane.WARNING_MESSAGE);
            campoEmail.setText("");
            campoEmail.requestFocusInWindow();
            return;
        }
        if (!UtilidadEmail.validarEmail(campoEmail.getText().trim())) {
            JOptionPane.showMessageDialog(this,
                    "Introduce una dirección de correo válida.",
                    "Email no válido", JOptionPane.WARNING_MESSAGE);
            campoEmail.setText("");
            campoEmail.requestFocusInWindow();
            return;
        }
        String mensaje = "El resultado del formulario sobre su nivel de motivación para dejar de fumar ha sido de "
                + campoPuntuacion.getText() + " sobre 10.\n"
                + "Su motivación para dejar de fumar es "
                + textoNivel.getText().replace("Nivel de motivación: ", "") + ".\n"
                + "Su salud es lo primero. Piense en ello.\n\n"
                + "Servicio de prevención de tabaquismo";
        Path archivoAdjunto = Path.of("documento", "documento.pdf");
        new UtilidadEmail("Resultados formulario Richmond: Motivación para dejar de fumar",
                mensaje, campoEmail.getText().trim(), archivoAdjunto.toString(), "documento.pdf").mail();
    }

}
