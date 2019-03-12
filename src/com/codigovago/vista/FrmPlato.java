/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codigovago.vista;

/**
 *
 * @author JEISON
 */
public class FrmPlato extends javax.swing.JFrame {

    /**
     * Creates new form FrmOrden
     */
    FrmMesa FrmMesa = new FrmMesa();
    public FrmPlato() {
        this.setUndecorated(true);
        initComponents();
        lblNumMesa.setText("Mesa: "+FrmMesa.ban);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.JPopupMenu();
        btnSeleccionar = new javax.swing.JMenuItem();
        btnEliminar = new javax.swing.JMenuItem();
        txtCantidad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblNumMesa = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtListaPlatos = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnAgregar = new javax.swing.JButton();
        btnModficar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        lblNumMesa1 = new javax.swing.JLabel();
        FondoOrden = new javax.swing.JLabel();

        btnSeleccionar.setText("Seleccionar");
        grupo1.add(btnSeleccionar);

        btnEliminar.setText("Eliminar Pedido");
        grupo1.add(btnEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "1", "2", "3", "4", "5" }));
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 190, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "NUMERO", "PLATO", "CANTIDAD", "PRECIO", "DESCRIPCION"
            }
        ));
        jTable1.setComponentPopupMenu(grupo1);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 600, 360));

        lblNumMesa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNumMesa.setText("Mesa: 1");
        getContentPane().add(lblNumMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Cantidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Descripción");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        txtListaPlatos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtListaPlatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Platos Disponibles", "Sopa1", "Seco1", "Jugo1" }));
        getContentPane().add(txtListaPlatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 290, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 290, 140));

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 160, 50));

        btnModficar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnModficar.setText("Modificar");
        getContentPane().add(btnModficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 160, 50));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 160, 50));

        btnOrdenar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 160, 50));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/icons/max.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setDefaultCapable(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 50, 50));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/icons/min.png"))); // NOI18N
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 40, 50));

        lblNumMesa1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNumMesa1.setText("Pedido: 1");
        getContentPane().add(lblNumMesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 130, -1));

        FondoOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/FonfoFrmOrden.png"))); // NOI18N
        getContentPane().add(FondoOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed
    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed
    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        FrmPedido FrmPedido = new FrmPedido();
        FrmPedido.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnOrdenarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoOrden;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JMenuItem btnEliminar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnModficar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenuItem btnSeleccionar;
    private javax.swing.JPopupMenu grupo1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblNumMesa;
    private javax.swing.JLabel lblNumMesa1;
    private javax.swing.JComboBox<String> txtCantidad;
    private javax.swing.JComboBox<String> txtListaPlatos;
    // End of variables declaration//GEN-END:variables
}
