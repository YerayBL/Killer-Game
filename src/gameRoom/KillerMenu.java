/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameRoom;

/**
 *
 * @author Yeray
 */
 public class KillerMenu extends javax.swing.JFrame {

    /**
     * Creates new form KillerMenu
     */
    public KillerMenu() {
        initComponents();
        this.setSize(525, 525);
        this.setLocationRelativeTo(null); 
        this.setVisible(true);
        jPanelConectar.setVisible(false);
        jPanelAjustes.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButtonJugar = new javax.swing.JButton();
        jButtonConectar = new javax.swing.JButton();
        jButtonAjustes = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanelAjustes = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonVolverAjustes = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanelConectar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonVolverConectar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelPrincipal.setMaximumSize(new java.awt.Dimension(525, 525));
        jPanelPrincipal.setPreferredSize(new java.awt.Dimension(525, 525));
        jPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gameRoom/img/Logo.png"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(480, 80));
        jPanelPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("KillerTeam ®");
        jPanelPrincipal.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, -1, -1));

        jButtonJugar.setText("JUGAR");
        jButtonJugar.setPreferredSize(new java.awt.Dimension(100, 30));
        jButtonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJugarActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jButtonConectar.setText("CONECTAR");
        jButtonConectar.setPreferredSize(new java.awt.Dimension(100, 30));
        jButtonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConectarActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonConectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        jButtonAjustes.setText("AJUSTES");
        jButtonAjustes.setPreferredSize(new java.awt.Dimension(100, 30));
        jButtonAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjustesActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        jButtonSalir.setText("SALIR");
        jButtonSalir.setPreferredSize(new java.awt.Dimension(100, 30));
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gameRoom/img/stars.gif"))); // NOI18N
        jPanelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanelAjustes.setPreferredSize(new java.awt.Dimension(525, 525));
        jPanelAjustes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("KillerTeam ®");
        jPanelAjustes.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gameRoom/img/Logo.png"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(480, 80));
        jPanelAjustes.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jButtonVolverAjustes.setText("VOLVER");
        jButtonVolverAjustes.setPreferredSize(new java.awt.Dimension(100, 30));
        jButtonVolverAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverAjustesActionPerformed(evt);
            }
        });
        jPanelAjustes.add(jButtonVolverAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gameRoom/img/stars.gif"))); // NOI18N
        jPanelAjustes.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, -1, -1));

        jPanelConectar.setPreferredSize(new java.awt.Dimension(525, 525));
        jPanelConectar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gameRoom/img/Logo.png"))); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(480, 80));
        jPanelConectar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("KillerTeam ®");
        jPanelConectar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, -1, -1));

        jButtonVolverConectar.setText("VOLVER");
        jButtonVolverConectar.setPreferredSize(new java.awt.Dimension(100, 30));
        jButtonVolverConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverConectarActionPerformed(evt);
            }
        });
        jPanelConectar.add(jButtonVolverConectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gameRoom/img/stars.gif"))); // NOI18N
        jPanelConectar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelConectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverConectarActionPerformed
        // VOLVER DEL PANEL CONECTAR
        jPanelConectar.setVisible(false);
        jPanelPrincipal.setVisible(true);
        this.setContentPane(jPanelPrincipal);
    }//GEN-LAST:event_jButtonVolverConectarActionPerformed

    private void jButtonVolverAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverAjustesActionPerformed
        // VOLVER DEL PANEL  AJUSTES
        jPanelAjustes.setVisible(false);
        jPanelPrincipal.setVisible(true);
        this.setContentPane(jPanelPrincipal);
    }//GEN-LAST:event_jButtonVolverAjustesActionPerformed

    private void jButtonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConectarActionPerformed
        // IR AL PANEL CONECTAR
        jPanelPrincipal.setVisible(false);
        jPanelConectar.setVisible(true);
        this.setContentPane(jPanelConectar);
    }//GEN-LAST:event_jButtonConectarActionPerformed

    private void jButtonAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjustesActionPerformed
        // IR AL PANEL  AJUSTES
        jPanelPrincipal.setVisible(false);
        jPanelAjustes.setVisible(true);
        this.setContentPane(jPanelAjustes);
    }//GEN-LAST:event_jButtonAjustesActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // SALIR
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJugarActionPerformed
        // JUGAR
    }//GEN-LAST:event_jButtonJugarActionPerformed

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
            java.util.logging.Logger.getLogger(KillerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KillerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KillerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KillerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KillerMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAjustes;
    private javax.swing.JButton jButtonConectar;
    private javax.swing.JButton jButtonJugar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVolverAjustes;
    private javax.swing.JButton jButtonVolverConectar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelAjustes;
    private javax.swing.JPanel jPanelConectar;
    static javax.swing.JPanel jPanelPrincipal;
    // End of variables declaration//GEN-END:variables
}
