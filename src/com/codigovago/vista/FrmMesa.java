/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codigovago.vista;

import com.codigovago.controlador.Roles;

/**
 *
 * @author JEISON
 */
public class FrmMesa extends javax.swing.JFrame {

    /**
     * Creates new form FrmComandero
     */
    public static int ban; 
    Roles Roles = new Roles();
    public FrmMesa() {
        this.setUndecorated(true);
        initComponents();
        lblNombre.setText("Mesero: "+Roles.idEmpleado); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        btnMinimizar = new javax.swing.JButton();
        btnMesa1 = new javax.swing.JButton();
        btnMesa2 = new javax.swing.JButton();
        btnMesa3 = new javax.swing.JButton();
        btnMesa4 = new javax.swing.JButton();
        btnMesa5 = new javax.swing.JButton();
        btnMesa6 = new javax.swing.JButton();
        btnMesa7 = new javax.swing.JButton();
        btnMesa8 = new javax.swing.JButton();
        btnMesa9 = new javax.swing.JButton();
        btnMesa10 = new javax.swing.JButton();
        btnMesa11 = new javax.swing.JButton();
        btnMesa12 = new javax.swing.JButton();
        btnMesa13 = new javax.swing.JButton();
        btnMesa14 = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        FondoComanda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1360, 740));
        setMinimumSize(new java.awt.Dimension(1360, 740));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código Vago", "Perfil", "Salir" }));
        jComboBox1.setBorder(null);
        jComboBox1.setFocusTraversalPolicyProvider(true);
        jComboBox1.setInheritsPopupMenu(true);
        jComboBox1.setOpaque(false);
        jComboBox1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 100, 30));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/icons/min.png"))); // NOI18N
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 0, 40, 50));

        btnMesa1.setBorder(null);
        btnMesa1.setBorderPainted(false);
        btnMesa1.setContentAreaFilled(false);
        btnMesa1.setDefaultCapable(false);
        btnMesa1.setFocusable(false);
        btnMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 330, 120));

        btnMesa2.setBorder(null);
        btnMesa2.setBorderPainted(false);
        btnMesa2.setContentAreaFilled(false);
        btnMesa2.setDefaultCapable(false);
        btnMesa2.setFocusable(false);
        btnMesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 100, 110));

        btnMesa3.setBorder(null);
        btnMesa3.setBorderPainted(false);
        btnMesa3.setContentAreaFilled(false);
        btnMesa3.setDefaultCapable(false);
        btnMesa3.setFocusable(false);
        btnMesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, 110, 110));

        btnMesa4.setBorder(null);
        btnMesa4.setBorderPainted(false);
        btnMesa4.setContentAreaFilled(false);
        btnMesa4.setDefaultCapable(false);
        btnMesa4.setFocusable(false);
        btnMesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 110, 110, 110));

        btnMesa5.setBorder(null);
        btnMesa5.setBorderPainted(false);
        btnMesa5.setContentAreaFilled(false);
        btnMesa5.setDefaultCapable(false);
        btnMesa5.setFocusable(false);
        btnMesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 130, 100));

        btnMesa6.setBorder(null);
        btnMesa6.setBorderPainted(false);
        btnMesa6.setContentAreaFilled(false);
        btnMesa6.setDefaultCapable(false);
        btnMesa6.setFocusable(false);
        btnMesa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 130, 90));

        btnMesa7.setBorder(null);
        btnMesa7.setBorderPainted(false);
        btnMesa7.setContentAreaFilled(false);
        btnMesa7.setDefaultCapable(false);
        btnMesa7.setFocusable(false);
        btnMesa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 120, 90));

        btnMesa8.setBorder(null);
        btnMesa8.setBorderPainted(false);
        btnMesa8.setContentAreaFilled(false);
        btnMesa8.setDefaultCapable(false);
        btnMesa8.setFocusable(false);
        btnMesa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 330, 130, 90));

        btnMesa9.setBorder(null);
        btnMesa9.setBorderPainted(false);
        btnMesa9.setContentAreaFilled(false);
        btnMesa9.setDefaultCapable(false);
        btnMesa9.setFocusable(false);
        btnMesa9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa9ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 590, 70, 50));

        btnMesa10.setBorder(null);
        btnMesa10.setBorderPainted(false);
        btnMesa10.setContentAreaFilled(false);
        btnMesa10.setDefaultCapable(false);
        btnMesa10.setFocusable(false);
        btnMesa10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 590, 70, 50));

        btnMesa11.setBorder(null);
        btnMesa11.setBorderPainted(false);
        btnMesa11.setContentAreaFilled(false);
        btnMesa11.setDefaultCapable(false);
        btnMesa11.setFocusable(false);
        btnMesa11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 590, 70, 50));

        btnMesa12.setBorder(null);
        btnMesa12.setBorderPainted(false);
        btnMesa12.setContentAreaFilled(false);
        btnMesa12.setDefaultCapable(false);
        btnMesa12.setFocusable(false);
        btnMesa12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa12ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa12, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 590, 70, 50));

        btnMesa13.setBorder(null);
        btnMesa13.setBorderPainted(false);
        btnMesa13.setContentAreaFilled(false);
        btnMesa13.setDefaultCapable(false);
        btnMesa13.setFocusable(false);
        btnMesa13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa13ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa13, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 580, 70, 60));

        btnMesa14.setBorder(null);
        btnMesa14.setBorderPainted(false);
        btnMesa14.setContentAreaFilled(false);
        btnMesa14.setDefaultCapable(false);
        btnMesa14.setFocusable(false);
        btnMesa14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesa14ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMesa14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 290, 90, 380));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("jLabel1");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, 140, -1));

        FondoComanda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/FonfoFrmComandero.png"))); // NOI18N
        getContentPane().add(FondoComanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed
    private void btnMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa1ActionPerformed
        this.ban=1;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa1ActionPerformed
    private void btnMesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa2ActionPerformed
        this.ban=2;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa2ActionPerformed
    private void btnMesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa3ActionPerformed
        this.ban=3;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa3ActionPerformed
    private void btnMesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa4ActionPerformed
        this.ban=4;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa4ActionPerformed
    private void btnMesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa5ActionPerformed
        this.ban=5;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa5ActionPerformed
    private void btnMesa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa6ActionPerformed
        this.ban=6;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa6ActionPerformed
    private void btnMesa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa7ActionPerformed
        this.ban=7;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa7ActionPerformed
    private void btnMesa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa8ActionPerformed
        this.ban=8;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa8ActionPerformed
    private void btnMesa9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa9ActionPerformed
        this.ban=9;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa9ActionPerformed
    private void btnMesa10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa10ActionPerformed
        this.ban=10;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa10ActionPerformed
    private void btnMesa11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa11ActionPerformed
        this.ban=11;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa11ActionPerformed
    private void btnMesa12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa12ActionPerformed
        this.ban=12;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa12ActionPerformed
    private void btnMesa13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa13ActionPerformed
        this.ban=13;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa13ActionPerformed
    private void btnMesa14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesa14ActionPerformed
        this.ban=14;
        FrmPlato FrmOrden = new FrmPlato();
        FrmOrden.setVisible(true);
    }//GEN-LAST:event_btnMesa14ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoComanda;
    private javax.swing.JButton btnMesa1;
    private javax.swing.JButton btnMesa10;
    private javax.swing.JButton btnMesa11;
    private javax.swing.JButton btnMesa12;
    private javax.swing.JButton btnMesa13;
    private javax.swing.JButton btnMesa14;
    private javax.swing.JButton btnMesa2;
    private javax.swing.JButton btnMesa3;
    private javax.swing.JButton btnMesa4;
    private javax.swing.JButton btnMesa5;
    private javax.swing.JButton btnMesa6;
    private javax.swing.JButton btnMesa7;
    private javax.swing.JButton btnMesa8;
    private javax.swing.JButton btnMesa9;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
