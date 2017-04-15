/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.EDocType;
import controller.UIResolution;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

/**
 *
 * @author Usuario
 */
public class FrResolution extends javax.swing.JFrame {
    private UIResolution uiResolution; 
    /**
     * Creates new form FrResolution
     */
    public FrResolution() {
        uiResolution= new UIResolution();
        initComponents();
        uiResolution.createTemplateResolution(this);
       

        
    }


    public JTextPane getTxtintro() {
        return txtintro;
    }

    public void setTxtintro(JTextPane txtintro) {
        this.txtintro = txtintro;
    }

    public JTextPane getTxtconsider() {
        return txtconsider;
    }

    public void setTxtconsider(JTextPane txtconsider) {
        this.txtconsider = txtconsider;
    }

    public JTextPane getTxtnotify() {
        return txtnotify;
    }

    public void setTxtnotify(JTextPane txtnotify) {
        this.txtnotify = txtnotify;
    }

    public JTextPane getTxtresolve() {
        return txtresolve;
    }

    public void setTxtresolve(JTextPane txtresolve) {
        this.txtresolve = txtresolve;
    }

    public JTextPane getTxtresult() {
        return txtresult;
    }

    public void setTxtresult(JTextPane txtresult) {
        this.txtresult = txtresult;
    }

   
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtintro = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtresult = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtconsider = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtresolve = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtnotify = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        btnNewRequest = new javax.swing.JMenuItem();
        btnSaveAs = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnViewRequest = new javax.swing.JMenuItem();
        btnviewStadistics = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel1.setText("Introducción:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jScrollPane6.setViewportView(txtintro);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 710, 310));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/images/5193848-white-wallpaper.jpg"))); // NOI18N
        jLabel6.setText("jLabel2");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 490));

        jTabbedPane1.addTab("Introducción", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel7.setText("Resultado:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jScrollPane1.setViewportView(txtresult);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 710, 300));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/images/5193848-white-wallpaper.jpg"))); // NOI18N
        jLabel5.setText("jLabel2");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 490));

        jTabbedPane1.addTab("Resultado Único ", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel8.setText("Considerando:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jScrollPane2.setViewportView(txtconsider);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 710, 300));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/images/5193848-white-wallpaper.jpg"))); // NOI18N
        jLabel4.setText("jLabel2");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 490));

        jTabbedPane1.addTab("Considerandos", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel9.setText("Resuelvo:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jScrollPane3.setViewportView(txtresolve);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 710, 300));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/images/5193848-white-wallpaper.jpg"))); // NOI18N
        jLabel3.setText("jLabel2");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 490));

        jTabbedPane1.addTab("Resuelvo", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel10.setText("Notifíquese:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 60, -1, -1));

        jScrollPane4.setViewportView(txtnotify);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 710, 300));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/images/5193848-white-wallpaper.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 490));

        jTabbedPane1.addTab("Notifíquese", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu3.setText("Archivo");

        btnNewRequest.setText("Nueva Solicitud...");
        btnNewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewRequestActionPerformed(evt);
            }
        });
        jMenu3.add(btnNewRequest);

        btnSaveAs.setText("Guardar...");
        btnSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAsActionPerformed(evt);
            }
        });
        jMenu3.add(btnSaveAs);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Ver ");

        btnViewRequest.setText("Ver Solicitudes");
        btnViewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRequestActionPerformed(evt);
            }
        });
        jMenu4.add(btnViewRequest);

        btnviewStadistics.setText("Ver Estadísticas");
        btnviewStadistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewStadisticsActionPerformed(evt);
            }
        });
        jMenu4.add(btnviewStadistics);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewRequestActionPerformed
        // TODO add your handling code here:
        FrRequest fr=new FrRequest();
        fr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNewRequestActionPerformed

    private void btnSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAsActionPerformed
        // TODO add your handling code here:
        
        int i=JOptionPane.showConfirmDialog(this, "¿Seguro de que quiere crear una Resolución?","",JOptionPane.YES_NO_OPTION);
        EDocType format=(EDocType) JOptionPane.showInputDialog(this, 
        "Guardar como...",
        "Favorite Pizza",
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        EDocType.values(), 
        EDocType.values()[0]);
        if(i==JOptionPane.YES_OPTION){
            uiResolution.createResolution(this,format);
            FrViewRequest fvr=new FrViewRequest();
            fvr.setVisible(true);
            this.setVisible(false);}
    }//GEN-LAST:event_btnSaveAsActionPerformed

    private void btnViewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRequestActionPerformed
        // TODO add your handling code here:
        FrViewRequest fvr=new FrViewRequest();
        fvr.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnViewRequestActionPerformed

    private void btnviewStadisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewStadisticsActionPerformed
        // TODO add your handling code here:
        FrStadistics frstadistics= new FrStadistics();
        frstadistics.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnviewStadisticsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrResolution.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrResolution.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrResolution.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrResolution.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrResolution().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnNewRequest;
    private javax.swing.JMenuItem btnSaveAs;
    private javax.swing.JMenuItem btnViewRequest;
    private javax.swing.JMenuItem btnviewStadistics;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane txtconsider;
    private javax.swing.JTextPane txtintro;
    private javax.swing.JTextPane txtnotify;
    private javax.swing.JTextPane txtresolve;
    private javax.swing.JTextPane txtresult;
    // End of variables declaration//GEN-END:variables
}
