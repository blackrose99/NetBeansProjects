//Maicol Alexis Cubides Peña.
//25/04/2022

public class Productos_Servicios extends javax.swing.JFrame {

    Servicios ser = new Servicios();
    Producto pro = new Producto();
    public double can;
    public double produc;
    public double var;
    public String res;
    public String op;

    public Productos_Servicios() {
        
        initComponents();
   

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_datos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldValorProductos = new javax.swing.JTextField();
        jTextFieldValorServicio = new javax.swing.JTextField();
        jButtonCalcularCompra = new javax.swing.JButton();
        jLabelResultado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCantidadPro = new javax.swing.JTextField();
        jComboBoxEleccios = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_datos.setBackground(new java.awt.Color(0, 51, 51));
        pnl_datos.setForeground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Computer Gamer");

        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Clase de Venta:");

        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Valor del producto de los Computadores:");

        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Valor del servicio:");

        jTextFieldValorProductos.setBackground(new java.awt.Color(204, 153, 0));
        jTextFieldValorProductos.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldValorProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorProductosActionPerformed(evt);
            }
        });

        jTextFieldValorServicio.setBackground(new java.awt.Color(204, 153, 0));
        jTextFieldValorServicio.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldValorServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorServicioActionPerformed(evt);
            }
        });

        jButtonCalcularCompra.setBackground(new java.awt.Color(204, 153, 0));
        jButtonCalcularCompra.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCalcularCompra.setText("Obtener el valor del la Compra:");
        jButtonCalcularCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularCompraActionPerformed(evt);
            }
        });

        jLabelResultado.setBackground(new java.awt.Color(255, 255, 255));
        jLabelResultado.setForeground(new java.awt.Color(204, 153, 0));
        jLabelResultado.setText("                                    ?");

        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Cantidad");

        jTextFieldCantidadPro.setBackground(new java.awt.Color(204, 153, 0));
        jTextFieldCantidadPro.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCantidadPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadProActionPerformed(evt);
            }
        });

        jComboBoxEleccios.setForeground(new java.awt.Color(255, 204, 0));
        jComboBoxEleccios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pagar solo producto", "pagar solo servicio", "pagar producto y servicio", " " }));
        jComboBoxEleccios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxElecciosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_datosLayout = new javax.swing.GroupLayout(pnl_datos);
        pnl_datos.setLayout(pnl_datosLayout);
        pnl_datosLayout.setHorizontalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_datosLayout.createSequentialGroup()
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxEleccios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_datosLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCantidadPro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datosLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(14, 14, 14)))))
                        .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_datosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldValorProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140)
                                .addComponent(jTextFieldValorServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_datosLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                                .addComponent(jLabel4)))
                        .addGap(56, 56, 56))
                    .addGroup(pnl_datosLayout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_datosLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2))
                    .addGroup(pnl_datosLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jButtonCalcularCompra)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        pnl_datosLayout.setVerticalGroup(
            pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxEleccios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addGroup(pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValorServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldValorProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCantidadPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(jButtonCalcularCompra)
                .addGap(28, 28, 28)
                .addComponent(jLabelResultado)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jTextFieldValorProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorProductosActionPerformed

    }//GEN-LAST:event_jTextFieldValorProductosActionPerformed

    private void jTextFieldValorServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorServicioActionPerformed

    }//GEN-LAST:event_jTextFieldValorServicioActionPerformed

    private void jButtonCalcularCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularCompraActionPerformed

        jLabelResultado.setText(" El total a pagar de la Compra es de: " + metodoCalcular());


    }//GEN-LAST:event_jButtonCalcularCompraActionPerformed

    private void jTextFieldCantidadProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadProActionPerformed

    }//GEN-LAST:event_jTextFieldCantidadProActionPerformed

    private void jComboBoxElecciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxElecciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxElecciosActionPerformed
    public String metodoCalcular() {
        op = jComboBoxEleccios.getItemAt(jComboBoxEleccios.getSelectedIndex());
        switch (op) {
            case "pagar solo producto":
                can = Integer.parseInt(jTextFieldCantidadPro.getText());
                produc = Integer.parseInt(jTextFieldValorProductos.getText());

                res = pro.calcularSubtotalProductos(can, produc);

                break;

            case "pagar solo servicio":
                var = Integer.parseInt(jTextFieldValorServicio.getText());

                res = ser.totalservicio(var);

                break;

            case "pagar producto y servicio":
                can = Integer.parseInt(jTextFieldCantidadPro.getText());
                produc = Integer.parseInt(jTextFieldValorProductos.getText());
                var = Integer.parseInt(jTextFieldValorServicio.getText());
                res = ser.descuentosProSER_(can, produc, var);

                break;
        }

        return res;

    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Productos_Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos_Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos_Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos_Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos_Servicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcularCompra;
    private javax.swing.JComboBox<String> jComboBoxEleccios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JTextField jTextFieldCantidadPro;
    private javax.swing.JTextField jTextFieldValorProductos;
    private javax.swing.JTextField jTextFieldValorServicio;
    private javax.swing.JPanel pnl_datos;
    // End of variables declaration//GEN-END:variables
}
