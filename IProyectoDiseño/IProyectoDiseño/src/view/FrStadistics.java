/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UIStadistics;
import java.awt.BorderLayout;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;




/**
 *
 * @author Usuario
 */



public class FrStadistics extends javax.swing.JFrame {
    private UIStadistics uiStadistics; 

    public FrStadistics() {
        initComponents();
        DefaultCategoryDataset dataset= new DefaultCategoryDataset();
        dataset.setValue(100, "", "Holita");
        dataset.setValue(150, "", "Holita1");
        dataset.setValue(200, "", "Holita2");
        JFreeChart chart= ChartFactory.createBarChart("hola", "", "", dataset, PlotOrientation.HORIZONTAL, false, true, false);
        CategoryPlot catPlot=chart.getCategoryPlot();
        catPlot.setRangeGridlinePaint(Color.BLACK);
        
        ChartPanel chartPanel=new ChartPanel(chart);
        chartPanel.setMouseWheelEnabled(true);
        pnProf.setLayout(new java.awt.BorderLayout());
        pnProf.add(chartPanel, BorderLayout.CENTER);
        pnProf.validate();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        pnRP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnokResPer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pnProf = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnnewRequest = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnviewRequest = new javax.swing.JMenuItem();
        btnviewStadistics = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnRP.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout pnRPLayout = new javax.swing.GroupLayout(pnRP);
        pnRP.setLayout(pnRPLayout);
        pnRPLayout.setHorizontalGroup(
            pnRPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        pnRPLayout.setVerticalGroup(
            pnRPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        jPanel2.add(pnRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 490, 330));

        jLabel1.setText("Periodo ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        btnokResPer.setText("Aceptar");
        btnokResPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokResPerActionPerformed(evt);
            }
        });
        jPanel2.add(btnokResPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/images/5193848-white-wallpaper.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 470));

        jTabbedPane1.addTab("Cursos con Más Resoluciones en ese Periodo", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout pnProfLayout = new javax.swing.GroupLayout(pnProf);
        pnProf.setLayout(pnProfLayout);
        pnProfLayout.setHorizontalGroup(
            pnProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        pnProfLayout.setVerticalGroup(
            pnProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jPanel3.add(pnProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 530, 350));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/images/5193848-white-wallpaper.jpg"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 470));

        jTabbedPane1.addTab("Profesores con Más Modificaciones de Acta ", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSpinner1.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(1492139524776L), new java.util.Date(), java.util.Calendar.DAY_OF_MONTH));
        jPanel4.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, 30));

        jSpinner2.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(1492139542749L), new java.util.Date(), java.util.Calendar.DAY_OF_MONTH));
        jPanel4.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, -1, 30));

        jLabel2.setText("Fecha Final");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        jLabel6.setText("Fecha de Inicio");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/images/5193848-white-wallpaper.jpg"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 470));

        jTabbedPane1.addTab("Solicitudes Atendidas en un rango de Fechas", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 490));

        jMenu1.setText("Archivo");

        btnnewRequest.setText("Nueva Solicitud...");
        btnnewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewRequestActionPerformed(evt);
            }
        });
        jMenu1.add(btnnewRequest);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ver ");

        btnviewRequest.setText("Ver Solicitudes");
        btnviewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewRequestActionPerformed(evt);
            }
        });
        jMenu2.add(btnviewRequest);

        btnviewStadistics.setText("Ver Estadísticas");
        btnviewStadistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewStadisticsActionPerformed(evt);
            }
        });
        jMenu2.add(btnviewStadistics);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewRequestActionPerformed
        // TODO add your handling code here:
        FrRequest fr=new FrRequest();
        fr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnnewRequestActionPerformed

    private void btnokResPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokResPerActionPerformed
        // TODO add your handling code here:\
        DefaultCategoryDataset dataset= new DefaultCategoryDataset();
        dataset.setValue(100, "", "Holita");
        dataset.setValue(150, "", "Holita1");
        dataset.setValue(200, "", "Holita2");
        dataset.setValue(150, "", "Holita3");
        dataset.setValue(200, "", "Holita4");
        JFreeChart chart= ChartFactory.createBarChart("hola", "", "", dataset, PlotOrientation.HORIZONTAL, false, true, false);
        CategoryPlot catPlot=chart.getCategoryPlot();
        catPlot.setRangeGridlinePaint(Color.BLACK);
        
        ChartPanel chartPanel=new ChartPanel(chart);
        chartPanel.setMouseWheelEnabled(true);
        pnRP.setLayout(new java.awt.BorderLayout());
        pnRP.add(chartPanel, BorderLayout.CENTER);
        pnRP.validate();

    }//GEN-LAST:event_btnokResPerActionPerformed

    private void btnviewStadisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewStadisticsActionPerformed
        // TODO add your handling code here:
        FrStadistics frstadistics= new FrStadistics();
        frstadistics.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnviewStadisticsActionPerformed

    private void btnviewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewRequestActionPerformed
        // TODO add your handling code here:
        FrViewRequest fvr=new FrViewRequest();
        fvr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnviewRequestActionPerformed

  
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrStadistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrStadistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrStadistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrStadistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrStadistics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnnewRequest;
    private javax.swing.JButton btnokResPer;
    private javax.swing.JMenuItem btnviewRequest;
    private javax.swing.JMenuItem btnviewStadistics;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnProf;
    private javax.swing.JPanel pnRP;
    // End of variables declaration//GEN-END:variables
}
