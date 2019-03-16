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
        btnComandas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        cbxTipoComida = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        lblEmpleado = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblNumMesa1 = new javax.swing.JLabel();
        FondoOrden = new javax.swing.JLabel();

        btnSeleccionar.setText("Seleccionar");
        grupo1.add(btnSeleccionar);

        btnEliminar.setText("Eliminar Pedido");
        grupo1.add(btnEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 700, 360));

        lblNumMesa.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        lblNumMesa.setForeground(new java.awt.Color(255, 255, 255));
        lblNumMesa.setText("Mesa: 1");
        getContentPane().add(lblNumMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 130, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Observación");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        txtListaPlatos.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtListaPlatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Platos disponibles", "Sopa1", "Seco1", "Jugo1" }));
        getContentPane().add(txtListaPlatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 310, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 350, 80));

        btnAgregar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 160, 50));

        btnModficar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnModficar.setText("Modificar");
        btnModficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModficarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, 160, 50));

        btnComandas.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnComandas.setText("Comandas");
        btnComandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComandasActionPerformed(evt);
            }
        });
        getContentPane().add(btnComandas, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 570, 160, 50));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/icons/max.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setDefaultCapable(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 10, 50, 50));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/icons/min.png"))); // NOI18N
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, 40, 50));

        cbxTipoComida.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        cbxTipoComida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Cocina", "Bar" }));
        getContentPane().add(cbxTipoComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 310, 40));
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 70, 40));

        lblEmpleado.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpleado.setText("Nombre Empleado");
        getContentPane().add(lblEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));

        lblFecha.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Fecha y Hora");
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 30, -1, -1));

        lblNumMesa1.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        lblNumMesa1.setForeground(new java.awt.Color(255, 255, 255));
        lblNumMesa1.setText("Pedido: 1");
        getContentPane().add(lblNumMesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 130, -1));

        FondoOrden.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        FondoOrden.setForeground(new java.awt.Color(255, 255, 255));
        FondoOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/codigovago/assets/fondo1.png"))); // NOI18N
        getContentPane().add(FondoOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed
    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed
    private void btnComandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComandasActionPerformed
        FrmComandas FrmPedido = new FrmComandas();
        FrmPedido.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnComandasActionPerformed

    private void btnModficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModficarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModficarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoOrden;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnComandas;
    private javax.swing.JMenuItem btnEliminar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnModficar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenuItem btnSeleccionar;
    private javax.swing.JComboBox<String> cbxTipoComida;
    private javax.swing.JPopupMenu grupo1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNumMesa;
    private javax.swing.JLabel lblNumMesa1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JComboBox<String> txtListaPlatos;
    // End of variables declaration//GEN-END:variables
}
