/*
luis Manuel Castaño 
Miguel Angel Ortis Ramirez
Darwin Moncada Castro

*/


package paquete;

public class Formulario3 extends javax.swing.JFrame {

    double numero1;
    double numero2;
    double numero3;
    String opcion, opcion2;

    public Formulario3() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        n1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        n3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        n2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        nu1 = new javax.swing.JTextField();
        nu3 = new javax.swing.JTextField();
        nu2 = new javax.swing.JTextField();
        total1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("CALCULAdORA GEOMETRICA");

        n1.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        n1.setForeground(new java.awt.Color(255, 51, 0));
        n1.setText("Numero 1");

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FIGURA");

        n3.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        n3.setForeground(new java.awt.Color(255, 51, 0));
        n3.setText("Numero 3");

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("RESULTADO");

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" OPERACION");

        n2.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        n2.setForeground(new java.awt.Color(255, 51, 0));
        n2.setText("Numero 2");

        jToggleButton1.setBackground(new java.awt.Color(102, 102, 102));
        jToggleButton1.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("CALCULAR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(102, 102, 102));
        jComboBox1.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuadrado", "Rectangulo", "Triangulo", "Circulo", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(102, 102, 102));
        jComboBox2.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 24)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Area", "Perimetro" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        nu1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        nu3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        nu2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        total1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 30)); // NOI18N
        total1.setForeground(new java.awt.Color(0, 102, 0));
        total1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total1.setText("0");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jButton1.setText("LIMPIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(n3)
                        .addGap(18, 18, 18)
                        .addComponent(nu3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(n1)
                                .addGap(18, 18, 18)
                                .addComponent(nu1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(total1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(n2)
                        .addGap(18, 18, 18)
                        .addComponent(nu2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(216, 216, 216))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(64, 64, 64))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(n1)
                    .addComponent(nu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n3)
                    .addComponent(nu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(total1)
                    .addComponent(jToggleButton1))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        opcion = this.jComboBox1.getItemAt(this.jComboBox1.getSelectedIndex());
        opcion2 = this.jComboBox2.getItemAt(this.jComboBox2.getSelectedIndex());
        switch (opcion) {
            case "Cuadrado":
                switch (opcion2) {
                    case "Area":
                        ValidarRectangulo();

                        break;
                    case "Perimetro":
                        ValidarRectanguloPer();

                        break;
                    default:
                        throw new AssertionError();
                }

                break;
            case "Rectangulo":
                switch (opcion2) {
                    case "Area":
                        ValidarRectangulo();

                        break;
                    case "Perimetro":
                        ValidarRectanguloPer();

                        break;
                    case "Diagonal":
                        ValidarRectanguloDiag();

                        break;    
                    default:
                        throw new AssertionError();
                }

            case "Triangulo":
                switch (opcion2) {
                    case "Area":
                        ValidarTriangulo();

                        break;
                    case "Perimetro":
                        ValidarTrianguloPer();

                        break;
                    case "Hipotenusa":
                        ValidarTrianguloHipo();

                        break;    
                  
                }

                break;
            case "Circulo":
                switch (opcion2) {
                    case "Area":
                        ValidarCirculo();

                        break;
                    case "Perimetro":
                        ValidarCirculoPer();

                        break;
                    case "Diametro":
                        ValidarCirculoDiam();

                        break;    

                    default:
                        throw new AssertionError();
                }

                break;
            default:
                throw new AssertionError();
        }


    }//GEN-LAST:event_jToggleButton1ActionPerformed

    public void ValidarRectangulo() {
          opcion = (String)(jComboBox1.getSelectedItem());
        numero1 = Double.parseDouble(nu1.getText());
        numero2 = Double.parseDouble(nu1.getText());
      
        if (opcion.equals("Cuadrado")) {
            numero2 = numero1;
        }
        Rectangulo obj1 = new Rectangulo(numero1, numero2);
        obj1.CalcularArea();
        obj1.PresentarArea(total1);

    }

    public void ValidarRectanguloPer() {

        numero1 = Double.parseDouble(nu1.getText());
        numero2 = Double.parseDouble(nu1.getText());
        opcion = (String) (jComboBox1.getSelectedItem());
        if (opcion.equals("Cuadrado")) {
            numero2 = numero1;
        }
        Rectangulo obj1 = new Rectangulo(numero1, numero2);
        obj1.CalcularPerimetro();
        obj1.PresentarPerimetro(total1);

    }

    public void ValidarTriangulo() {

        numero1 = Double.parseDouble(nu1.getText());
        numero2 = Double.parseDouble(nu2.getText());
        numero3 = Double.parseDouble(nu1.getText());
        opcion2 = (String) (jComboBox1.getSelectedItem());
        Triangulo obj2 = new Triangulo(numero1, numero2, numero3);
        obj2.CalcularArea();
        obj2.PresentarArea(total1);

    }

    public void ValidarTrianguloPer() {

        numero1 = Double.parseDouble(nu1.getText());
        numero2 = Double.parseDouble(nu2.getText());
        numero3 = Double.parseDouble(nu1.getText());
        Triangulo obj2 = new Triangulo(numero1, numero2, numero3);
        obj2.CalcularPerimetro();
        obj2.PresentarPerimetro(total1);

    }

    public void ValidarCirculo() {

        numero1 = Double.parseDouble(nu1.getText());
        Circulo obj3 = new Circulo(numero1);
        obj3.CalcularArea();
        obj3.PresentarArea(total1);

    }

    public void ValidarCirculoPer() {

        numero1 = Double.parseDouble(nu1.getText());
        Circulo obj3 = new Circulo(numero1);
        obj3.CalcularPerimetro();
        obj3.PresentarPerimetro(total1);
    }
    public void  ValidarRectanguloDiag(){
        numero1 = Double.parseDouble(nu1.getText());
        numero2 = Double.parseDouble(nu2.getText());
        Rectangulo obj1 = new Rectangulo(numero1, numero2);
        obj1.CalcularDiagonal();
        obj1.PresentarDiag(total1);
    }
     public void ValidarCirculoDiam() {
        numero1 = Double.parseDouble(nu1.getText());
        Circulo obj3 = new Circulo(numero1);
        obj3.CalcularDiam();
        obj3.PresentarDiam(total1);

    }
     public void ValidarTrianguloHipo() {

        numero1 = Double.parseDouble(nu1.getText());
        numero2 = Double.parseDouble(nu2.getText());
        numero3 = Double.parseDouble(nu1.getText());
        Triangulo obj2 = new Triangulo(numero1, numero2, numero3);
        obj2.CalcularHipotenusa();
        obj2.PresentarHipo(total1);
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        opcion = this.jComboBox1.getItemAt(this.jComboBox1.getSelectedIndex());
        if (opcion.equals("Cuadrado")) {
            nu2.setVisible(false);
            nu3.setVisible(false);
            n2.setVisible(false);
            n3.setVisible(false);
            n1.setText("Lado");
            nu1.setText("");
             nu2.setText("");
             nu3.setText(""); nu2.setVisible(false);
            nu3.setVisible(false);
            n2.setVisible(false);
            n3.setVisible(false);
             total1.setText("");
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Area", "Perimetro" }));
            
        }else if (opcion.equals("Rectangulo")) {
            n1.setText("Lado 1");
            n2.setText("Lado 2");
            nu2.setVisible(true);
            n2.setVisible(true);
            nu3.setVisible(false);
            n3.setVisible(false);
             nu1.setText("");
        nu2.setText("");
        nu3.setText("");
        total1.setText("");
             jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Area", "Perimetro","Diagonal" }));
             
        }else if (opcion.equals("Circulo")) {
            nu2.setVisible(false);
            nu3.setVisible(false);
             n2.setVisible(false);
            n3.setVisible(false);
            n1.setText("Radio");
             nu1.setText("");
             nu2.setText("");
             nu3.setText("");
             total1.setText("");
             jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Area", "Perimetro","Diametro"}));
        
        }else{
            nu1.setVisible(true);
            nu2.setVisible(true);
            nu3.setVisible(true);
            n1.setVisible(true);
            n2.setVisible(true);
            n3.setVisible(true);
               n3.setText("Diagonal");
               n2.setText("Altura");
               n1.setText("Base");
                nu1.setText("");
        nu2.setText("");
        nu3.setText("");
        total1.setText("");
                jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Area", "Perimetro","Hipotenusa"}));
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nu1.setText("");
        nu2.setText("");
        nu3.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n2;
    private javax.swing.JLabel n3;
    private javax.swing.JTextField nu1;
    private javax.swing.JTextField nu2;
    private javax.swing.JTextField nu3;
    private javax.swing.JLabel total1;
    // End of variables declaration//GEN-END:variables
}
