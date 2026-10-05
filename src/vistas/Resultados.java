/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vistas;


import bbdd.Conexion;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

//una unica consulta de sql para resultados en un array 
public class Resultados extends javax.swing.JDialog {

    public Resultados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        cargarResultados();
        setLocationRelativeTo(parent);
    }

    public Resultados(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
     
        cargarResultados();
        setLocationRelativeTo(parent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        logoResultados = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        tituloInforme = new javax.swing.JLabel();
        categoriaEncuestas = new javax.swing.JLabel();
        categoriaAlta = new javax.swing.JLabel();
        categoriaModerada = new javax.swing.JLabel();
        categoriaDudosa = new javax.swing.JLabel();
        categoriaBaja = new javax.swing.JLabel();
        labelNumeroEncuestas = new javax.swing.JLabel();
        labelAlta = new javax.swing.JLabel();
        labelModerada = new javax.swing.JLabel();
        labelDudosa = new javax.swing.JLabel();
        labelBaja = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        botonGraficoBarras = new javax.swing.JButton();
        botonGraficoCircular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RESULTADOS");
        setResizable(false);
        setSize(new java.awt.Dimension(1150, 700));

        fondo.setBackground(new java.awt.Color(238, 238, 238));
        fondo.setPreferredSize(new java.awt.Dimension(1150, 700));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        logoResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/encuesta_cabecera_min.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(1069, Short.MAX_VALUE)
                .addComponent(logoResultados)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(logoResultados))
        );

        jPanel4.setBackground(new java.awt.Color(204, 0, 51));

        tituloInforme.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tituloInforme.setForeground(new java.awt.Color(255, 255, 255));
        tituloInforme.setText("INFORME DE RESULTADOS");

        categoriaEncuestas.setBackground(new java.awt.Color(0, 0, 0));
        categoriaEncuestas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        categoriaEncuestas.setForeground(new java.awt.Color(255, 255, 255));
        categoriaEncuestas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoriaEncuestas.setText("Nº de encuestas");
        categoriaEncuestas.setOpaque(true);

        categoriaAlta.setBackground(new java.awt.Color(0, 0, 0));
        categoriaAlta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        categoriaAlta.setForeground(new java.awt.Color(255, 255, 255));
        categoriaAlta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoriaAlta.setText("Alta");
        categoriaAlta.setOpaque(true);

        categoriaModerada.setBackground(new java.awt.Color(0, 0, 0));
        categoriaModerada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        categoriaModerada.setForeground(new java.awt.Color(255, 255, 255));
        categoriaModerada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoriaModerada.setText("Moderada");
        categoriaModerada.setOpaque(true);

        categoriaDudosa.setBackground(new java.awt.Color(0, 0, 0));
        categoriaDudosa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        categoriaDudosa.setForeground(new java.awt.Color(255, 255, 255));
        categoriaDudosa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoriaDudosa.setText("Dudosa");
        categoriaDudosa.setOpaque(true);

        categoriaBaja.setBackground(new java.awt.Color(0, 0, 0));
        categoriaBaja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        categoriaBaja.setForeground(new java.awt.Color(255, 255, 255));
        categoriaBaja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoriaBaja.setText("Baja");
        categoriaBaja.setOpaque(true);

        labelNumeroEncuestas.setBackground(new java.awt.Color(0, 0, 0));
        labelNumeroEncuestas.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labelNumeroEncuestas.setForeground(new java.awt.Color(255, 255, 255));
        labelNumeroEncuestas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNumeroEncuestas.setOpaque(true);

        labelAlta.setBackground(new java.awt.Color(0, 0, 0));
        labelAlta.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labelAlta.setForeground(new java.awt.Color(255, 255, 255));
        labelAlta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAlta.setOpaque(true);

        labelModerada.setBackground(new java.awt.Color(0, 0, 0));
        labelModerada.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labelModerada.setForeground(new java.awt.Color(255, 255, 255));
        labelModerada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelModerada.setOpaque(true);

        labelDudosa.setBackground(new java.awt.Color(0, 0, 0));
        labelDudosa.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labelDudosa.setForeground(new java.awt.Color(255, 255, 255));
        labelDudosa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDudosa.setOpaque(true);

        labelBaja.setBackground(new java.awt.Color(0, 0, 0));
        labelBaja.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labelBaja.setForeground(new java.awt.Color(255, 255, 255));
        labelBaja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBaja.setOpaque(true);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        botonGraficoBarras.setBackground(new java.awt.Color(213, 0, 0));
        botonGraficoBarras.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        botonGraficoBarras.setForeground(new java.awt.Color(255, 255, 255));
        botonGraficoBarras.setText("VER GRÁFICO DE BARRAS");
        botonGraficoBarras.setFocusPainted(false);
        botonGraficoBarras.addActionListener(this::abrirGraficoBarras);

        botonGraficoCircular.setBackground(new java.awt.Color(213, 0, 0));
        botonGraficoCircular.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        botonGraficoCircular.setForeground(new java.awt.Color(255, 255, 255));
        botonGraficoCircular.setText("VER GRÁFICO CIRCULAR");
        botonGraficoCircular.setFocusPainted(false);
        botonGraficoCircular.addActionListener(this::abrirGraficoCircular);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(botonGraficoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonGraficoCircular, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGraficoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGraficoCircular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(tituloInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNumeroEncuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoriaEncuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(categoriaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(categoriaModerada, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelModerada, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(categoriaDudosa, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelDudosa, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoriaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriaEncuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaModerada, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaDudosa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumeroEncuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelModerada, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDudosa, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 764, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void abrirGraficoCircular(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirGraficoCircular
        // TODO add your handling code here:
    }//GEN-LAST:event_abrirGraficoCircular

    private void abrirGraficoBarras(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirGraficoBarras
        cargaGrafico();
    }//GEN-LAST:event_abrirGraficoBarras

 

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGraficoBarras;
    private javax.swing.JButton botonGraficoCircular;
    private javax.swing.JLabel categoriaAlta;
    private javax.swing.JLabel categoriaBaja;
    private javax.swing.JLabel categoriaDudosa;
    private javax.swing.JLabel categoriaEncuestas;
    private javax.swing.JLabel categoriaModerada;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel labelAlta;
    private javax.swing.JLabel labelBaja;
    private javax.swing.JLabel labelDudosa;
    private javax.swing.JLabel labelModerada;
    private javax.swing.JLabel labelNumeroEncuestas;
    private javax.swing.JLabel logoResultados;
    private javax.swing.JLabel tituloInforme;
    // End of variables declaration//GEN-END:variables
 int formularios, alta, moderada, dudosa, baja;

   
    public void cargaValores() {

        formularios = Integer.parseInt(labelNumeroEncuestas.getText());
        alta = Integer.parseInt(labelAlta.getText());
        moderada = Integer.parseInt(labelModerada.getText());
        dudosa = Integer.parseInt(labelDudosa.getText());
        baja = Integer.parseInt(labelBaja.getText());

    }

    public void cargaGrafico() {

        cargaValores();
     
        DefaultCategoryDataset datos = new DefaultCategoryDataset();

        
        datos.setValue(alta, "Nivel de Motivación", "Alta");
        datos.setValue(moderada, "Nivel de Motivación", "Moderada");
        datos.setValue(dudosa, "Nivel de Motivación", "Dudosa");
        datos.setValue(baja, "Nivel de Motivación", "Baja");

        JFreeChart chart = ChartFactory.createBarChart("Puntuación", "NIVEL DE MOTIVACIÓN",
                "Escala", datos, PlotOrientation.VERTICAL, true,
                true, false);

        ChartPanel panel = new ChartPanel(chart);
        panel.setSize(800, 500);

        GraficoUno gu = new GraficoUno(null, true);
        gu.add(panel);
        gu.setVisible(true);

    }


    private void cargarResultados() {
        try {
            Conexion.ResumenResultados resumen = Conexion.obtenerResumenFormularios();
            labelNumeroEncuestas.setText(Integer.toString(resumen.total()));
            labelAlta.setText(Integer.toString(resumen.alta()));
            labelModerada.setText(Integer.toString(resumen.moderada()));
            labelDudosa.setText(Integer.toString(resumen.dudosa()));
            labelBaja.setText(Integer.toString(resumen.baja()));
        } catch (SQLException ex) {
            System.getLogger(Resultados.class.getName()).log(System.Logger.Level.ERROR, "No se pudieron cargar los resultados", ex);
            mostrarErrorResultados();
        }
    }

    private void mostrarErrorResultados() {
        labelNumeroEncuestas.setText("—"); labelAlta.setText("—"); labelModerada.setText("—"); labelDudosa.setText("—"); labelBaja.setText("—");
        JOptionPane.showMessageDialog(this, "No se pudieron cargar los resultados de la tabla formulario.", "Resultados no disponibles", JOptionPane.WARNING_MESSAGE);
    }
}
