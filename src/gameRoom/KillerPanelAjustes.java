/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameRoom;

import game.KillerGame;



/**
 *
 * @author Yeray
 */
public class KillerPanelAjustes extends javax.swing.JPanel {
    //Variable Killer Game
    private KillerGame kg;
    private KillerRoom kr;
    
    /**
     * Creates new form KillerPanelAjustes
     */
    public KillerPanelAjustes(KillerRoom kr) {
        this.kr = kr;
        kg = kr.getKg();
        initComponents();
    }
    
    public KillerPanelAjustes getKillerPanelAjustes(){
        return this;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelCopy = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(525, 525));
        setMinimumSize(new java.awt.Dimension(525, 525));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gameRoom/img/Logo.png"))); // NOI18N
        jLabelTitulo.setText("jLabel1");
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(480, 80));
        add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabelCopy.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCopy.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCopy.setText("KillerTeam ®");
        add(jLabelCopy, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, -1, -1));

        jButton1.setText("VOLVER");
        jButton1.setPreferredSize(new java.awt.Dimension(100, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gameRoom/img/stars.gif"))); // NOI18N
        add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // VOLVER
        kr.setKillerPanelPrincipal();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelCopy;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
