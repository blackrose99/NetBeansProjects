
package CALCULADORA_MAICOL_GEO;

import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;



public class Panel_Fig extends javax.swing.JFrame {

    double nu1;
    double nu2;
    String box1, box2;
 
    public Panel_Fig() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jComboBoxFiguras = new javax.swing.JComboBox<>();
        jComboBoxOperaciones = new javax.swing.JComboBox<>();
        jButtonCalcular = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        nume1 = new javax.swing.JLabel();
        nume2 = new javax.swing.JLabel();
        escribe1 = new javax.swing.JTextField();
        escribe2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        figurasss = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 51, 51));

        title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        title.setText("Figuras Geometricas");

        jComboBoxFiguras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuadrado", "Rectangulo", "Triangulo", "Circulo" }));
        jComboBoxFiguras.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxFigurasItemStateChanged(evt);
            }
        });
        jComboBoxFiguras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFigurasActionPerformed(evt);
            }
        });

        jComboBoxOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOperacionesActionPerformed(evt);
            }
        });

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        nume1.setText("Base");

        nume2.setText("Altura");

        escribe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribe2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Resultado:");

        figurasss.setText("Figura");

        jLabel7.setText("Operacion");

        jLabelResultado.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(figurasss)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(title))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jLabel7))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(escribe1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(escribe2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(jComboBoxFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jComboBoxOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(jButtonCalcular))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel5)
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94)
                                        .addComponent(nume1)))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nume2)
                                    .addComponent(jButtonBorrar))))
                        .addGap(28, 28, 28)
                        .addComponent(jButtonSalir)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(title)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(figurasss)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCalcular)
                    .addComponent(jButtonBorrar)
                    .addComponent(jButtonSalir))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabelResultado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(escribe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(escribe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nume2)
                            .addComponent(nume1))))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        escribe1.setText("");
        escribe2.setText("");
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void escribe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribe2ActionPerformed

    }//GEN-LAST:event_escribe2ActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed

        box1 = jComboBoxFiguras.getItemAt(jComboBoxFiguras.getSelectedIndex());
        box2 = jComboBoxOperaciones.getItemAt(jComboBoxOperaciones.getSelectedIndex());
        switch(box1) {
            case "Cuadrado":
                switch (box2) {
                    case "Area del Cuadrado":
                        AreaCuadrado();
                        break;
                        
                    case "Perimetro del Cuadrado":
                        PerimetroCuadrado();
                        break;
                        
                    case "Diagonal del Cuadrado":
                        DiagonalCuadrado();
                        break;
                        
                    default:
                        throw new AssertionError();
                }
                break;
            case "Rectangulo":
                
                switch (box2) {
                    case "Area del Rectangulo":
                        AreaRectangulo();
                        break;
                        
                    case "Perimetro del Rectangulo":
                        PerimetroRectangulo();
                        break;
                        
                    case "Diagonal del Rectangulo":
                        DiagonalRectangulo();
                        break;
                        
                    default:
                        throw new AssertionError();
                }
                break;
            case "Triangulo":
                switch (box2) {
                    case "Area del Triangulo":
                        AreaTriangulo();
                        break;

                    case "Perimetro del Triangulo":
                        PerimetroTriangulo();
                        break;

                    case "Hipotenusa del Triangulo":
                        HipotenusaTriangulo();
                        break;

                    default:
                        throw new AssertionError();
                }
                break;
            case "Circulo":
                switch (box2) {
                    case "Area del Circulo":
                        AreaCirculo();
                        break;

                    case "Perimetro del Circulo":
                        PerimetroCirculo();
                        break;

                    case "Diametro del Circulo":
                        DiametroCirculo();
                        break;

                    default:
                        throw new AssertionError();
                }
                break;
            default:
                throw new AssertionError();

        }
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    public void AreaCuadrado(){
      
       nu1= Double.parseDouble(escribe1.getText());
        nu2= Double.parseDouble(escribe2.getText());
        CUADRADO cua = new CUADRADO(nu1, nu2);
     
        cua.calcularArea(jLabelResultado);
    }
    
    public void PerimetroCuadrado(){
        nu1= Double.parseDouble(escribe1.getText());
        nu2= Double.parseDouble(escribe2.getText());
        CUADRADO cup = new CUADRADO(nu1, nu2);
        cup.calcularPerimetro(jLabelResultado);
    }
    
    
     public void DiagonalCuadrado(){
         nu1 = Double.parseDouble(escribe1.getText());
         nu2 = Double.parseDouble(escribe2.getText());
         CUADRADO cud = new CUADRADO(nu1, nu2);
         cud.calcularDiagonalCuadrado(jLabelResultado);
     }
     
     
     
     
     
     public void AreaRectangulo(){
         nu1 = Double.parseDouble(escribe1.getText());
         nu2 = Double.parseDouble(escribe2.getText());
         RECTANGULO rea = new RECTANGULO(nu1, nu2);
         rea.calcularArea(jLabelResultado);
     }
          public void PerimetroRectangulo(){
         nu1 = Double.parseDouble(escribe1.getText());
         nu2 = Double.parseDouble(escribe2.getText());
        RECTANGULO rep = new RECTANGULO(nu1, nu2);
        rep.calcularPerimetro(jLabelResultado);
    }

      public void DiagonalRectangulo() {
        nu1 = Double.parseDouble(escribe1.getText());
        nu2 = Double.parseDouble(escribe2.getText());
        RECTANGULO red = new RECTANGULO(nu1, nu2);
        red.calcularDiagonalRectangulo(jLabelResultado);
    }
      
      
      
      
    public void AreaTriangulo() {
        nu1 = Double.parseDouble(escribe1.getText());
        nu2 = Double.parseDouble(escribe2.getText());
        TRIANGULO tria = new TRIANGULO(nu1, nu2);
        tria.calcularArea(jLabelResultado);
    }
    
    public void PerimetroTriangulo(){
        nu1 = Double.parseDouble(escribe1.getText());
        nu2 = Double.parseDouble(escribe2.getText());
        TRIANGULO trip = new TRIANGULO(nu1,nu2);
        trip.calcularPerimetro(jLabelResultado);
    }

    public void HipotenusaTriangulo() {
        nu1 = Double.parseDouble(escribe1.getText());
        nu2 = Double.parseDouble(escribe2.getText());
        TRIANGULO trih = new TRIANGULO(nu1, nu2);
        trih.calcularHipotenusaTriangulo(jLabelResultado);
    }
    
    
    
    
    
    public void AreaCirculo() {
        nu1 = Double.parseDouble(escribe1.getText());
        CIRCULO cia = new CIRCULO(nu1);
        cia.calcularArea(jLabelResultado);
    }

    public void PerimetroCirculo() {
        nu1 = Double.parseDouble(escribe1.getText());
        CIRCULO cip = new CIRCULO(nu1);
        cip.calcularPerimetro(jLabelResultado);
    }

    public void DiametroCirculo() {
        nu1 = Double.parseDouble(escribe1.getText());
        CIRCULO cid = new CIRCULO(nu1);
        cid.calcularDiametroCirculo(jLabelResultado);
    }


    
    
    
    
    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
  
         this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jComboBoxFigurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFigurasActionPerformed
        
        box1 = jComboBoxFiguras.getItemAt(jComboBoxFiguras.getSelectedIndex());
        if (box1.equals("Cuadrado")) {
            escribe1.setText("");
            escribe2.setText("");
            jLabelResultado.setText("");
        } else if (box1.equals("Circulo")) {
            escribe1.setText("");
            escribe2.setText("");
            jLabelResultado.setText("");
        } else if (box1.equals("Triangulo")) {
            escribe1.setText("");
            escribe2.setText("");
            jLabelResultado.setText("");
        } else if (box1.equals("Rectangulo")) {
            escribe1.setText("");
            escribe2.setText("");
            jLabelResultado.setText("");
        }

    }//GEN-LAST:event_jComboBoxFigurasActionPerformed

    
        public String[] metodosFig(String figura) {
        String[] metodos = new String[3];
        if (figura.equalsIgnoreCase("Cuadrado")) {
            metodos[0] = "Area del Cuadrado";
            metodos[1] = "Perimetro del Cuadrado";
            metodos[2] = "Diagonal del Cuadrado";

        }

        if (figura.equalsIgnoreCase("Circulo")) {
            metodos[0] = "Area del Circulo";
            metodos[1] = "Perimetro del Circulo";
            metodos[2] = "Diametro del Circulo";

        }

        if (figura.equalsIgnoreCase("Triangulo")) {
            metodos[0] = "Area del Triangulo";
            metodos[1] = "Perimetro del Triangulo";
            metodos[2] = "Hipotenusa del Triangulo";

        }

        if (figura.equalsIgnoreCase("Rectangulo")) {
            metodos[0] = "Area del Rectangulo";
            metodos[1] = "Perimetro del Rectangulo";
            metodos[2] = "Diagonal del Rectangulo";

        }

        return metodos;
    }
    

    
    private void jComboBoxOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOperacionesActionPerformed

        
        box2 = jComboBoxOperaciones.getItemAt(jComboBoxOperaciones.getSelectedIndex());
        if (box2.equals("Area del Cuadrado")) {
            nume1.setVisible(true);
            nume2.setVisible(true);
            escribe1.setVisible(true);
            escribe2.setVisible(true);
            nume1.setText("Lado 1");
            nume2.setText("Lado 2");

        } else if (box2.equals("Perimetro del Cuadrado")) {
             nume1.setVisible(true);
            nume2.setVisible(true);
            escribe1.setVisible(true);
            escribe2.setVisible(true);
            nume1.setText("Lado 1");
            nume2.setText("Lado 2");
//            escribe1.setText("");
//            escribe2.setText("");
//            jLabelResultado.setText("");
        } else if (box2.equals("Diagonal del Cuadrado")) {
             nume1.setVisible(true);
            nume2.setVisible(true);
            escribe1.setVisible(true);
            escribe2.setVisible(true);
            nume1.setText("Lado 1");
            nume2.setText("Lado 2");
//            escribe1.setText("");
//            escribe2.setText("");
//            jLabelResultado.setText("");
            
            
            
            
        } else if (box2.equals("Area del Circulo")) {

            nume1.setText("Radio");
            escribe1.setVisible(true);
            nume2.setVisible(false);
            escribe2.setVisible(false);
//            escribe1.setText("");
//            escribe2.setText("");
//            jLabelResultado.setText("");
            
        } else if (box2.equals("Perimetro del Circulo")) {
            nume1.setText("Radio");
            escribe1.setVisible(true);
            nume2.setVisible(false);
            escribe2.setVisible(false);
//            escribe1.setText("");
//            escribe2.setText("");
//            jLabelResultado.setText("");
        } else if (box2.equals("Diametro del Circulo")) {
            nume1.setText("Radio");
            escribe1.setVisible(true);
            nume2.setVisible(false);
            escribe2.setVisible(false);
//            escribe1.setText("");
//            escribe2.setText("");
//            jLabelResultado.setText("");
            
            
            
            
            
            
            
        } else if (box2.equals("Area del Triangulo")) {
            nume1.setVisible(true);
            nume2.setVisible(true);
            escribe1.setVisible(true);
            escribe2.setVisible(true);
            nume1.setText("Base");
            nume2.setText("Altura");
//            escribe1.setText("");
//            escribe2.setText("");
//            jLabelResultado.setText("");
        } else if (box2.equals("Perimetro del Triangulo")){
            nume1.setVisible(true);
            nume2.setVisible(true);
            escribe1.setVisible(true);
            escribe2.setVisible(true);
            nume1.setText("Base");
            nume2.setText("Altura");
////            escribe1.setText("");
////            escribe2.setText("");
////            jLabelResultado.setText("");
        } else if (box2.equals("Hipotenusa del Triangulo")) {
            nume1.setVisible(true);
            nume2.setVisible(true);
            escribe1.setVisible(true);
            escribe2.setVisible(true);
            nume1.setText("Lado 1");
            nume2.setText("Lado 2");
//            escribe1.setText("");
//            escribe2.setText("");
//            jLabelResultado.setText("");
            
            
            
            
        }else if (box2.equals("Area del Rectangulo")){
            nume1.setVisible(true);
            nume2.setVisible(true);
            escribe1.setVisible(true);
            escribe2.setVisible(true);
            nume1.setText("Base");
            nume2.setText("Altura");
//            escribe1.setText("");
//            escribe2.setText("");
//            jLabelResultado.setText("");
        } else if (box2.equals("Perimetro del Rectangulo")) {
            nume1.setVisible(true);
            nume2.setVisible(true);
            escribe1.setVisible(true);
            escribe2.setVisible(true);
            nume1.setText("Lado A");
            nume2.setText("Lado B");
//            escribe1.setText("");
//            escribe2.setText("");
//            jLabelResultado.setText("");
        }else if (box2.equals("Diagonal del Rectangulo")){
            nume1.setVisible(true);
            nume2.setVisible(true);
            escribe1.setVisible(true);
            escribe2.setVisible(true);
            nume1.setText("Lado A");
            nume2.setText("Lado B");
//            escribe1.setText("");
//            escribe2.setText("");
//            jLabelResultado.setText("");
        }
    }//GEN-LAST:event_jComboBoxOperacionesActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void jComboBoxFigurasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxFigurasItemStateChanged
         if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (this.jComboBoxFiguras.getSelectedIndex() >= 0) {

                this.jComboBoxOperaciones.setModel(new DefaultComboBoxModel(this.metodosFig(this.jComboBoxFiguras.getSelectedItem().toString())));
            }

        }
    }//GEN-LAST:event_jComboBoxFigurasItemStateChanged

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
            java.util.logging.Logger.getLogger(Panel_Fig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel_Fig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel_Fig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel_Fig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel_Fig().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField escribe1;
    private javax.swing.JTextField escribe2;
    private javax.swing.JLabel figurasss;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxFiguras;
    private javax.swing.JComboBox<String> jComboBoxOperaciones;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nume1;
    private javax.swing.JLabel nume2;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
