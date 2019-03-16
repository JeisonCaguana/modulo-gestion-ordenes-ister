/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codigovago.vista;

import com.codigovago.controlador.Roles;
import com.codigovago.modelo.accesoDatos.Empleados;

/**
 *
 * @author JEISON
 */
public class FrmComandas extends javax.swing.JFrame {

    /**
     * Creates new form FrmPedido
     */
    Empleados empleados = new Empleados();
    Roles Roles = new Roles();

    public FrmComandas(){
        this.setUndecorated(true);
        initComponents();
        lblMesero.setText(empleados.buscarDatosUsuario(Roles.idEmpleado));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        btnPreparar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        lblMesero = new javax.swing.JLabel();
        lblMesa = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblPedido = new javax.swing.JLabel();
        FondoOrden = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnCancelar.setText("Modificar pedido");
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, 180, 50));

        btnPreparar1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnPreparar1.setText("Cerrar cuenta");
        getContentPane().add(btnPreparar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 160, 50));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 250, 70));

        btnAgregar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 160, 50));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Observaciones (campo opcional)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setBorder(null);
        jTextArea3.setOpaque(false);
        jScrollPane4.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 440, 470));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setBorder(null);
        jTextArea2.setOpaque(false);
        jScrollPane3.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 440, 470));
        getContentPane().add(lblMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 160, 30));
        getContentPane().add(lblMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 60, 30));
        getContentPane().add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 60, 30));
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 110, 30));
        getContentPane().add(lblPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 100, 20));

        FondoOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/Comanda3.png"))); // NOI18N
        getContentPane().add(FondoOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoOrden;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPreparar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblMesa;
    private javax.swing.JLabel lblMesero;
    private javax.swing.JLabel lblPedido;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
