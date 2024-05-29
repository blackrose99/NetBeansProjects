//25/04/2022
//Maicol Alexis Cubides Peña.
//D193


package Calculadora_Geometrica;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;

public class Calculadora_Geometrica extends javax.swing.JFrame {

    Cuadrados cua = new Cuadrados();
    Circulos cir = new Circulos();
    Rectangulos rec = new Rectangulos();
    Triangulos tri = new Triangulos();

    public static String resultado;
    public static String OpcionesSelec;
    public static String opcion;
    public static double baseTri, baseREC;
    public static double alturaTri, alturaREC;
    public static double diametro;
    public static double perimetro;
    public static double radio;
    public static double diagonal;
    public static double lado1, lado1REC;
    public static double lado2, lado2REC;

    public Calculadora_Geometrica() {
        this.getContentPane().setBackground(Color.black);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBoxFiguras = new javax.swing.JComboBox<>();
        jComboBoxOperaciones = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonBorrar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonCalcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelcuadradoA = new javax.swing.JLabel();
        jTextFieldcuadradoA = new javax.swing.JTextField();
        jLabelCuadradoB = new javax.swing.JLabel();
        jTextFieldCuadradoB = new javax.swing.JTextField();
        jLabel1CirculoRadio = new javax.swing.JLabel();
        jTextFieldRadio = new javax.swing.JTextField();
        jLabel1Cirperimetro = new javax.swing.JLabel();
        jTextFieldCirperimetro = new javax.swing.JTextField();
        jLabel1Cirdiametro = new javax.swing.JLabel();
        jTextFieldDiametro = new javax.swing.JTextField();
        jLabel1BaseTria = new javax.swing.JLabel();
        jTextFieldTrianguloBas = new javax.swing.JTextField();
        jLabel1AlturaTria = new javax.swing.JLabel();
        jTextFieldAlturaTria = new javax.swing.JTextField();
        jLabel1BaseRed = new javax.swing.JLabel();
        jTextFieldBaseRED = new javax.swing.JTextField();
        jLabelAlturaRED = new javax.swing.JLabel();
        jTextFieldAlturaRED = new javax.swing.JTextField();
        jLabelLadoArec = new javax.swing.JLabel();
        jTextFieldLadoBRED = new javax.swing.JTextField();
        jLabelLadoBrec = new javax.swing.JLabel();
        jTextFieldLadoBRec = new javax.swing.JTextField();
        jLabeRESSS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Calculadora Geometrica");

        jComboBoxFiguras.setBackground(new java.awt.Color(51, 51, 51));
        jComboBoxFiguras.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jComboBoxFiguras.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxFiguras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuadrado", "Circulo", "Triangulo", "Rectangulo", " " }));
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

        jComboBoxOperaciones.setBackground(new java.awt.Color(51, 51, 51));
        jComboBoxOperaciones.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jComboBoxOperaciones.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOperacionesActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Figura");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Operacion");

        jButtonBorrar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonBorrar.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jButtonBorrar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jButtonSalir.setBackground(new java.awt.Color(51, 51, 51));
        jButtonSalir.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonCalcular.setBackground(new java.awt.Color(51, 51, 51));
        jButtonCalcular.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jButtonCalcular.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText(" Resultado:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Cuadrado");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Circulo");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Triangulo");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("Rectangulo");

        jLabelcuadradoA.setBackground(new java.awt.Color(255, 255, 255));
        jLabelcuadradoA.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabelcuadradoA.setForeground(new java.awt.Color(153, 0, 0));
        jLabelcuadradoA.setText("Ingrese el lado A:");

        jTextFieldcuadradoA.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldcuadradoA.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jTextFieldcuadradoA.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldcuadradoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcuadradoAActionPerformed(evt);
            }
        });

        jLabelCuadradoB.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCuadradoB.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabelCuadradoB.setForeground(new java.awt.Color(153, 0, 0));
        jLabelCuadradoB.setText("Ingrese el lado B:");

        jTextFieldCuadradoB.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldCuadradoB.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jTextFieldCuadradoB.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCuadradoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCuadradoBActionPerformed(evt);
            }
        });

        jLabel1CirculoRadio.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel1CirculoRadio.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1CirculoRadio.setText("Ingrese el Radio:");

        jTextFieldRadio.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldRadio.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jTextFieldRadio.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRadioActionPerformed(evt);
            }
        });

        jLabel1Cirperimetro.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel1Cirperimetro.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1Cirperimetro.setText("Ingrese el Perimetro:");

        jTextFieldCirperimetro.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldCirperimetro.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jTextFieldCirperimetro.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCirperimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCirperimetroActionPerformed(evt);
            }
        });

        jLabel1Cirdiametro.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel1Cirdiametro.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1Cirdiametro.setText("Ingrese el Diametro:");

        jTextFieldDiametro.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldDiametro.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jTextFieldDiametro.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldDiametro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDiametroActionPerformed(evt);
            }
        });

        jLabel1BaseTria.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel1BaseTria.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1BaseTria.setText("Ingrese la Base:");

        jTextFieldTrianguloBas.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldTrianguloBas.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jTextFieldTrianguloBas.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1AlturaTria.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel1AlturaTria.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1AlturaTria.setText("Ingrese la Altura:");

        jTextFieldAlturaTria.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldAlturaTria.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jTextFieldAlturaTria.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1BaseRed.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel1BaseRed.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1BaseRed.setText("Ingrese la Base:");

        jTextFieldBaseRED.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldBaseRED.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jTextFieldBaseRED.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldBaseRED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBaseREDActionPerformed(evt);
            }
        });

        jLabelAlturaRED.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabelAlturaRED.setForeground(new java.awt.Color(153, 0, 0));
        jLabelAlturaRED.setText("Ingrese la Altura:");

        jTextFieldAlturaRED.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldAlturaRED.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jTextFieldAlturaRED.setForeground(new java.awt.Color(255, 255, 255));

        jLabelLadoArec.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabelLadoArec.setForeground(new java.awt.Color(153, 0, 0));
        jLabelLadoArec.setText("Ingrese el lado A:");

        jTextFieldLadoBRED.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldLadoBRED.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jTextFieldLadoBRED.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldLadoBRED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLadoBREDActionPerformed(evt);
            }
        });

        jLabelLadoBrec.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabelLadoBrec.setForeground(new java.awt.Color(153, 0, 0));
        jLabelLadoBrec.setText("Ingrese el lado B:");

        jTextFieldLadoBRec.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldLadoBRec.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jTextFieldLadoBRec.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldLadoBRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLadoBRecActionPerformed(evt);
            }
        });

        jLabeRESSS.setBackground(new java.awt.Color(255, 255, 255));
        jLabeRESSS.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabeRESSS.setForeground(new java.awt.Color(153, 0, 0));
        jLabeRESSS.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jComboBoxFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 40, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabeRESSS, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187)
                        .addComponent(jTextFieldLadoBRec, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144)
                                .addComponent(jLabel7)
                                .addGap(121, 121, 121)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldAlturaTria, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldTrianguloBas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1BaseTria)
                                    .addComponent(jLabel1AlturaTria, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1Cirperimetro)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextFieldRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12))
                                        .addComponent(jLabel1CirculoRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1Cirdiametro)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldDiametro, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldCirperimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelcuadradoA)
                                        .addComponent(jLabelCuadradoB))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jTextFieldcuadradoA, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldCuadradoB, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonSalir)
                                            .addComponent(jButtonBorrar)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(455, 455, 455)
                                .addComponent(jButtonCalcular)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelLadoBrec)
                                .addComponent(jLabelAlturaRED)
                                .addComponent(jLabelLadoArec, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(55, 55, 55))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1BaseRed)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jTextFieldAlturaRED, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap()))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jTextFieldLadoBRED, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldBaseRED, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jComboBoxOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(473, 473, 473))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCalcular)
                            .addComponent(jComboBoxOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1BaseTria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldTrianguloBas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1AlturaTria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAlturaTria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1CirculoRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1Cirperimetro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldCuadradoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCirperimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addComponent(jLabel1Cirdiametro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabelcuadradoA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldcuadradoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelCuadradoB)
                                .addGap(124, 124, 124))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1BaseRed)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldBaseRED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabelAlturaRED)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldAlturaRED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jLabelLadoArec)
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelLadoBrec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldLadoBRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabeRESSS)
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDiametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldLadoBRED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonBorrar)
                                .addGap(30, 30, 30)))
                        .addComponent(jButtonSalir)
                        .addGap(42, 42, 42))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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


    private void jComboBoxFigurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFigurasActionPerformed


    }//GEN-LAST:event_jComboBoxFigurasActionPerformed


    private void jComboBoxOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOperacionesActionPerformed

        OpcionesSelec = (String) jComboBoxOperaciones.getSelectedItem();
        if (OpcionesSelec.equalsIgnoreCase("Area del Cuadrado")) {
            jLabelcuadradoA.setVisible(true);
            jTextFieldcuadradoA.setVisible(true);
            jTextFieldCuadradoB.setVisible(true);
            jLabelCuadradoB.setVisible(true);
            jLabel1CirculoRadio.setVisible(false);
            jTextFieldRadio.setVisible(false);
            jLabel1Cirperimetro.setVisible(false);
            jTextFieldCirperimetro.setVisible(false);
            jLabel1Cirdiametro.setVisible(false);
            jTextFieldDiametro.setVisible(false);
            jLabel1BaseTria.setVisible(false);
            jTextFieldTrianguloBas.setVisible(false);
            jLabel1AlturaTria.setVisible(false);
            jTextFieldAlturaTria.setVisible(false);
            jLabel1BaseRed.setVisible(false);
            jTextFieldBaseRED.setVisible(false);
            jLabelAlturaRED.setVisible(false);
            jTextFieldAlturaRED.setVisible(false);
            jLabelLadoArec.setVisible(false);
            jTextFieldLadoBRED.setVisible(false);
            jLabelLadoBrec.setVisible(false);
            jTextFieldLadoBRec.setVisible(false);

        } else if (OpcionesSelec.equalsIgnoreCase("Perimetro del Cuadrado")) {
            jLabelcuadradoA.setVisible(true);
            jTextFieldcuadradoA.setVisible(true);
            jTextFieldCuadradoB.setVisible(false);
            jLabelCuadradoB.setVisible(false);
            jLabel1CirculoRadio.setVisible(false);
            jTextFieldRadio.setVisible(false);
            jLabel1Cirperimetro.setVisible(false);
            jTextFieldCirperimetro.setVisible(false);
            jLabel1Cirdiametro.setVisible(false);
            jTextFieldDiametro.setVisible(false);
            jLabel1BaseTria.setVisible(false);
            jTextFieldTrianguloBas.setVisible(false);
            jLabel1AlturaTria.setVisible(false);
            jTextFieldAlturaTria.setVisible(false);
            jLabel1BaseRed.setVisible(false);
            jTextFieldBaseRED.setVisible(false);
            jLabelAlturaRED.setVisible(false);
            jTextFieldAlturaRED.setVisible(false);
            jLabelLadoArec.setVisible(false);
            jTextFieldLadoBRED.setVisible(false);
            jLabelLadoBrec.setVisible(false);
            jTextFieldLadoBRec.setVisible(false);

          

        } else if (OpcionesSelec.equalsIgnoreCase("Diagonal del Cuadrado")) {
            jLabelcuadradoA.setVisible(true);
            jTextFieldcuadradoA.setVisible(true);
            jTextFieldCuadradoB.setVisible(true);
            jLabelCuadradoB.setVisible(true);
            jLabel1CirculoRadio.setVisible(false);
            jTextFieldRadio.setVisible(false);
            jLabel1Cirperimetro.setVisible(false);
            jTextFieldCirperimetro.setVisible(false);
            jLabel1Cirdiametro.setVisible(false);
            jTextFieldDiametro.setVisible(false);
            jLabel1BaseTria.setVisible(false);
            jTextFieldTrianguloBas.setVisible(false);
            jLabel1AlturaTria.setVisible(false);
            jTextFieldAlturaTria.setVisible(false);
            jLabel1BaseRed.setVisible(false);
            jTextFieldBaseRED.setVisible(false);
            jLabelAlturaRED.setVisible(false);
            jTextFieldAlturaRED.setVisible(false);
            jLabelLadoArec.setVisible(false);
            jTextFieldLadoBRED.setVisible(false);
            jLabelLadoBrec.setVisible(false);
            jTextFieldLadoBRec.setVisible(false);

        } else if (OpcionesSelec.equalsIgnoreCase("Area del Circulo")) {
            jLabelcuadradoA.setVisible(false);
            jTextFieldcuadradoA.setVisible(false);
            jTextFieldCuadradoB.setVisible(false);
            jLabelCuadradoB.setVisible(false);
            jLabel1CirculoRadio.setVisible(true);
            jTextFieldRadio.setVisible(true);
            jLabel1Cirperimetro.setVisible(false);
            jTextFieldCirperimetro.setVisible(false);
            jLabel1Cirdiametro.setVisible(false);
            jTextFieldDiametro.setVisible(false);
            jLabel1BaseTria.setVisible(false);
            jTextFieldTrianguloBas.setVisible(false);
            jLabel1AlturaTria.setVisible(false);
            jTextFieldAlturaTria.setVisible(false);
            jLabel1BaseRed.setVisible(false);
            jTextFieldBaseRED.setVisible(false);
            jLabelAlturaRED.setVisible(false);
            jTextFieldAlturaRED.setVisible(false);
            jLabelLadoArec.setVisible(false);
            jTextFieldLadoBRED.setVisible(false);
            jLabelLadoBrec.setVisible(false);
            jTextFieldLadoBRec.setVisible(false);

        } else if (OpcionesSelec.equalsIgnoreCase("Perimetro del Circulo")) {
            jLabelcuadradoA.setVisible(false);
            jTextFieldcuadradoA.setVisible(false);
            jTextFieldCuadradoB.setVisible(false);
            jLabelCuadradoB.setVisible(false);
            jLabel1CirculoRadio.setVisible(false);
            jTextFieldRadio.setVisible(false);
            jLabel1Cirperimetro.setVisible(true);
            jTextFieldCirperimetro.setVisible(true);
            jLabel1Cirdiametro.setVisible(false);
            jTextFieldDiametro.setVisible(false);
            jLabel1BaseTria.setVisible(false);
            jTextFieldTrianguloBas.setVisible(false);
            jLabel1AlturaTria.setVisible(false);
            jTextFieldAlturaTria.setVisible(false);
            jLabel1BaseRed.setVisible(false);
            jTextFieldBaseRED.setVisible(false);
            jLabelAlturaRED.setVisible(false);
            jTextFieldAlturaRED.setVisible(false);
            jLabelLadoArec.setVisible(false);
            jTextFieldLadoBRED.setVisible(false);
            jLabelLadoBrec.setVisible(false);
            jTextFieldLadoBRec.setVisible(false);

        } else if (OpcionesSelec.equalsIgnoreCase("Diametro del Circulo")) {
            jLabelcuadradoA.setVisible(false);
            jTextFieldcuadradoA.setVisible(false);
            jTextFieldCuadradoB.setVisible(false);
            jLabelCuadradoB.setVisible(false);
            jLabel1CirculoRadio.setVisible(false);
            jTextFieldRadio.setVisible(false);
            jLabel1Cirperimetro.setVisible(false);
            jTextFieldCirperimetro.setVisible(false);
            jLabel1Cirdiametro.setVisible(true);
            jTextFieldDiametro.setVisible(true);
            jLabel1BaseTria.setVisible(false);
            jTextFieldTrianguloBas.setVisible(false);
            jLabel1AlturaTria.setVisible(false);
            jTextFieldAlturaTria.setVisible(false);
            jLabel1BaseRed.setVisible(false);
            jTextFieldBaseRED.setVisible(false);
            jLabelAlturaRED.setVisible(false);
            jTextFieldAlturaRED.setVisible(false);
            jLabelLadoArec.setVisible(false);
            jTextFieldLadoBRED.setVisible(false);
            jLabelLadoBrec.setVisible(false);
            jTextFieldLadoBRec.setVisible(false);

        } else if (OpcionesSelec.equalsIgnoreCase("Area del Triangulo")) {
            jLabelcuadradoA.setVisible(false);
            jTextFieldcuadradoA.setVisible(false);
            jTextFieldCuadradoB.setVisible(false);
            jLabelCuadradoB.setVisible(false);
            jLabel1CirculoRadio.setVisible(false);
            jTextFieldRadio.setVisible(false);
            jLabel1Cirperimetro.setVisible(false);
            jTextFieldCirperimetro.setVisible(false);
            jLabel1Cirdiametro.setVisible(false);
            jTextFieldDiametro.setVisible(false);
            jLabel1BaseTria.setVisible(true);
            jTextFieldTrianguloBas.setVisible(true);
            jLabel1AlturaTria.setVisible(true);
            jTextFieldAlturaTria.setVisible(true);
            jLabel1BaseRed.setVisible(false);
            jTextFieldBaseRED.setVisible(false);
            jLabelAlturaRED.setVisible(false);
            jTextFieldAlturaRED.setVisible(false);
            jLabelLadoArec.setVisible(false);
            jTextFieldLadoBRED.setVisible(false);
            jLabelLadoBrec.setVisible(false);
            jTextFieldLadoBRec.setVisible(false);

        } else if (OpcionesSelec.equalsIgnoreCase("Perimetro del Triangulo")) {
            jLabelcuadradoA.setVisible(false);
            jTextFieldcuadradoA.setVisible(false);
            jTextFieldCuadradoB.setVisible(false);
            jLabelCuadradoB.setVisible(false);
            jLabel1CirculoRadio.setVisible(false);
            jTextFieldRadio.setVisible(false);
            jLabel1Cirperimetro.setVisible(false);
            jTextFieldCirperimetro.setVisible(false);
            jLabel1Cirdiametro.setVisible(false);
            jTextFieldDiametro.setVisible(false);
            jLabel1BaseTria.setVisible(true);
            jTextFieldTrianguloBas.setVisible(true);
            jLabel1AlturaTria.setVisible(true);
            jTextFieldAlturaTria.setVisible(true);
            jLabel1BaseRed.setVisible(false);
            jTextFieldBaseRED.setVisible(false);
            jLabelAlturaRED.setVisible(false);
            jTextFieldAlturaRED.setVisible(false);
            jLabelLadoArec.setVisible(false);
            jTextFieldLadoBRED.setVisible(false);
            jLabelLadoBrec.setVisible(false);
            jTextFieldLadoBRec.setVisible(false);

        } else if (OpcionesSelec.equalsIgnoreCase("Hipotenusa del Triangulo")) {
            jLabelcuadradoA.setVisible(false);
            jTextFieldcuadradoA.setVisible(false);
            jTextFieldCuadradoB.setVisible(false);
            jLabelCuadradoB.setVisible(false);
            jLabel1CirculoRadio.setVisible(false);
            jTextFieldRadio.setVisible(false);
            jLabel1Cirperimetro.setVisible(false);
            jTextFieldCirperimetro.setVisible(false);
            jLabel1Cirdiametro.setVisible(false);
            jTextFieldDiametro.setVisible(false);
            jLabel1BaseTria.setVisible(true);
            jTextFieldTrianguloBas.setVisible(true);
            jLabel1AlturaTria.setVisible(true);
            jTextFieldAlturaTria.setVisible(true);
            jLabel1BaseRed.setVisible(false);
            jTextFieldBaseRED.setVisible(false);
            jLabelAlturaRED.setVisible(false);
            jTextFieldAlturaRED.setVisible(false);
            jLabelLadoArec.setVisible(false);
            jTextFieldLadoBRED.setVisible(false);
            jLabelLadoBrec.setVisible(false);
            jTextFieldLadoBRec.setVisible(false);

        } else if (OpcionesSelec.equalsIgnoreCase("Area del Rectangulo")) {
            jLabelcuadradoA.setVisible(false);
            jTextFieldcuadradoA.setVisible(false);
            jTextFieldCuadradoB.setVisible(false);
            jLabelCuadradoB.setVisible(false);
            jLabel1CirculoRadio.setVisible(false);
            jTextFieldRadio.setVisible(false);
            jLabel1Cirperimetro.setVisible(false);
            jTextFieldCirperimetro.setVisible(false);
            jLabel1Cirdiametro.setVisible(false);
            jTextFieldDiametro.setVisible(false);
            jLabel1BaseTria.setVisible(false);
            jTextFieldTrianguloBas.setVisible(false);
            jLabel1AlturaTria.setVisible(false);
            jTextFieldAlturaTria.setVisible(false);
            jLabel1BaseRed.setVisible(true);
            jTextFieldBaseRED.setVisible(true);
            jLabelAlturaRED.setVisible(true);
            jTextFieldAlturaRED.setVisible(true);
            jLabelLadoArec.setVisible(false);
            jTextFieldLadoBRED.setVisible(false);
            jLabelLadoBrec.setVisible(false);
            jTextFieldLadoBRec.setVisible(false);

        } else if (OpcionesSelec.equalsIgnoreCase("Perimetro del Rectangulo")) {
            jLabelcuadradoA.setVisible(false);
            jTextFieldcuadradoA.setVisible(false);
            jTextFieldCuadradoB.setVisible(false);
            jLabelCuadradoB.setVisible(false);
            jLabel1CirculoRadio.setVisible(false);
            jTextFieldRadio.setVisible(false);
            jLabel1Cirperimetro.setVisible(false);
            jTextFieldCirperimetro.setVisible(false);
            jLabel1Cirdiametro.setVisible(false);
            jTextFieldDiametro.setVisible(false);
            jLabel1BaseTria.setVisible(false);
            jTextFieldTrianguloBas.setVisible(false);
            jLabel1AlturaTria.setVisible(false);
            jTextFieldAlturaTria.setVisible(false);
            jLabel1BaseRed.setVisible(false);
            jTextFieldBaseRED.setVisible(false);
            jLabelAlturaRED.setVisible(false);
            jTextFieldAlturaRED.setVisible(false);
            jLabelLadoArec.setVisible(true);
            jTextFieldLadoBRED.setVisible(true);
            jLabelLadoBrec.setVisible(true);
            jTextFieldLadoBRec.setVisible(true);
        } else if (OpcionesSelec.equalsIgnoreCase("Diagonal del Rectangulo")) {
            jLabelcuadradoA.setVisible(false);
            jTextFieldcuadradoA.setVisible(false);
            jTextFieldCuadradoB.setVisible(false);
            jLabelCuadradoB.setVisible(false);
            jLabel1CirculoRadio.setVisible(false);
            jTextFieldRadio.setVisible(false);
            jLabel1Cirperimetro.setVisible(false);
            jTextFieldCirperimetro.setVisible(false);
            jLabel1Cirdiametro.setVisible(false);
            jTextFieldDiametro.setVisible(false);
            jLabel1BaseTria.setVisible(false);
            jTextFieldTrianguloBas.setVisible(false);
            jLabel1AlturaTria.setVisible(false);
            jTextFieldAlturaTria.setVisible(false);
            jLabel1BaseRed.setVisible(false);
            jTextFieldBaseRED.setVisible(false);
            jLabelAlturaRED.setVisible(false);
            jTextFieldAlturaRED.setVisible(false);
            jLabelLadoArec.setVisible(true);
            jTextFieldLadoBRED.setVisible(true);
            jLabelLadoBrec.setVisible(true);
            jTextFieldLadoBRec.setVisible(true);
        }


    }//GEN-LAST:event_jComboBoxOperacionesActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed

        jLabeRESSS.setText(menu());


    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed

        String var1 = jTextFieldcuadradoA.getText();
        String var2 = jTextFieldCuadradoB.getText();
        String var3 = jTextFieldRadio.getText();
        String var4 = jTextFieldCirperimetro.getText();
        String var5 = jTextFieldDiametro.getText();
        String var6 = jTextFieldTrianguloBas.getText();
        String var7 = jTextFieldAlturaTria.getText();
        String var8 = jTextFieldBaseRED.getText();
        String var9 = jTextFieldAlturaRED.getText();
        String var10 = jTextFieldLadoBRED.getText();
        String var11 = jTextFieldLadoBRec.getText();
        if (var1.length() >= 0 && var2.length() >= 0 && var3.length() >= 0 && var4.length() >= 0 && var5.length() >= 0
                && var6.length() >= 0 && var7.length() >= 0 && var8.length() >= 0 && var9.length() >= 0 && var10.length() >= 0 && var11.length() >= 0) {
            var1 = var1.substring(0, var1.length() - var1.length());
            var2 = var2.substring(0, var2.length() - var2.length());
            var3 = var3.substring(0, var3.length() - var3.length());
            var4 = var4.substring(0, var4.length() - var4.length());
            var5 = var5.substring(0, var5.length() - var5.length());
            var6 = var6.substring(0, var6.length() - var6.length());
            var7 = var7.substring(0, var7.length() - var7.length());
            var8 = var8.substring(0, var8.length() - var8.length());
            var9 = var9.substring(0, var9.length() - var9.length());
            var10 = var10.substring(0, var10.length() - var10.length());
            var11 = var11.substring(0, var11.length() - var11.length());
            jTextFieldcuadradoA.setText(var1);
            jTextFieldCuadradoB.setText(var2);
            jTextFieldRadio.setText(var3);
            jTextFieldCirperimetro.setText(var4);
            jTextFieldDiametro.setText(var5);
            jTextFieldTrianguloBas.setText(var6);
            jTextFieldAlturaTria.setText(var7);
            jTextFieldBaseRED.setText(var8);
            jTextFieldAlturaRED.setText(var9);
            jTextFieldLadoBRED.setText(var10);
            jTextFieldLadoBRec.setText(var11);

        }


    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jComboBoxFigurasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxFigurasItemStateChanged
        if (evt.getStateChange()== ItemEvent.SELECTED) {
            if (this.jComboBoxFiguras.getSelectedIndex() >= 0) {

                this.jComboBoxOperaciones.setModel(new DefaultComboBoxModel(this.metodosFig(this.jComboBoxFiguras.getSelectedItem().toString())));
            }

        }


    }//GEN-LAST:event_jComboBoxFigurasItemStateChanged

    private void jTextFieldcuadradoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcuadradoAActionPerformed

    }//GEN-LAST:event_jTextFieldcuadradoAActionPerformed

    private void jTextFieldCirperimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCirperimetroActionPerformed

    }//GEN-LAST:event_jTextFieldCirperimetroActionPerformed

    private void jTextFieldBaseREDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBaseREDActionPerformed

    }//GEN-LAST:event_jTextFieldBaseREDActionPerformed

    private void jTextFieldLadoBREDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLadoBREDActionPerformed

    }//GEN-LAST:event_jTextFieldLadoBREDActionPerformed

    private void jTextFieldLadoBRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLadoBRecActionPerformed

    }//GEN-LAST:event_jTextFieldLadoBRecActionPerformed

    private void jTextFieldCuadradoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCuadradoBActionPerformed

    }//GEN-LAST:event_jTextFieldCuadradoBActionPerformed

    private void jTextFieldRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRadioActionPerformed

    }//GEN-LAST:event_jTextFieldRadioActionPerformed

    private void jTextFieldDiametroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDiametroActionPerformed

    }//GEN-LAST:event_jTextFieldDiametroActionPerformed

    public String menu() {
        opcion = jComboBoxOperaciones.getItemAt(jComboBoxOperaciones.getSelectedIndex());
        switch (opcion) {
            case "Area del Cuadrado":
                lado1 = Integer.parseInt(jTextFieldcuadradoA.getText());
                lado2 = Integer.parseInt(jTextFieldCuadradoB.getText());
                resultado = cua.calcularArea(lado1, lado2);

                break;

            case "Perimetro del Cuadrado":
                lado1 = Integer.parseInt(jTextFieldcuadradoA.getText());
                resultado = cua.calcularPerimetro(lado1);

                break;

            case "Diagonal del Cuadrado":
                lado1 = Integer.parseInt(jTextFieldcuadradoA.getText());
                lado2 = Integer.parseInt(jTextFieldCuadradoB.getText());
                resultado = cua.calcularDiagonalCuadrado(lado1, lado2);

                break;

            case "Area del Circulo":
                radio = Integer.parseInt(jTextFieldRadio.getText());
                resultado = cir.calcularArea(radio);

                break;

            case "Perimetro del Circulo":
                perimetro = Integer.parseInt(jTextFieldCirperimetro.getText());
                resultado = cir.calcularPerimetro(perimetro);

                break;

            case "Diametro del Circulo":
                diametro = Integer.parseInt(jTextFieldDiametro.getText());
                resultado = cir.calcularDiametroCirculo(diametro);

                break;

            case "Area del Triangulo":
                baseTri = Integer.parseInt(jTextFieldTrianguloBas.getText());
                alturaTri = Integer.parseInt(jTextFieldAlturaTria.getText());
                resultado = tri.calcularArea(baseTri, alturaTri);

                break;

            case "Perimetro del Triangulo":
                baseTri = Integer.parseInt(jTextFieldTrianguloBas.getText());
                alturaTri = Integer.parseInt(jTextFieldAlturaTria.getText());
                resultado = tri.calcularPerimetro(baseTri, alturaTri);

                break;

            case "Hipotenusa del Triangulo":
                baseTri = Integer.parseInt(jTextFieldTrianguloBas.getText());
                alturaTri = Integer.parseInt(jTextFieldAlturaTria.getText());
                resultado = tri.calcularHipotenusaTriangulo(baseTri, alturaTri);

                break;
            case "Area del Rectangulo":
                baseREC = Integer.parseInt(jTextFieldBaseRED.getText());
                alturaREC = Integer.parseInt(jTextFieldAlturaRED.getText());
                resultado = rec.calcularArea(baseREC, alturaREC);

                break;

            case "Perimetro del Rectangulo":
                lado1REC = Integer.parseInt(jTextFieldLadoBRED.getText());
                lado2REC = Integer.parseInt(jTextFieldLadoBRec.getText());
                resultado = rec.calcularPerimetro(lado1REC, lado2REC);

                break; 

            case "Diagonal del Rectangulo":
                lado1REC = Integer.parseInt(jTextFieldLadoBRED.getText());
                lado2REC = Integer.parseInt(jTextFieldLadoBRec.getText());
                resultado = rec.calcularDiagonal(lado1REC, lado2REC);
                
                break;
  

        }
        return resultado;

    }

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
            java.util.logging.Logger.getLogger(Calculadora_Geometrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Geometrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Geometrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Geometrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora_Geometrica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxFiguras;
    private javax.swing.JComboBox<String> jComboBoxOperaciones;
    private javax.swing.JLabel jLabeRESSS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1AlturaTria;
    private javax.swing.JLabel jLabel1BaseRed;
    private javax.swing.JLabel jLabel1BaseTria;
    private javax.swing.JLabel jLabel1CirculoRadio;
    private javax.swing.JLabel jLabel1Cirdiametro;
    private javax.swing.JLabel jLabel1Cirperimetro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelAlturaRED;
    private javax.swing.JLabel jLabelCuadradoB;
    private javax.swing.JLabel jLabelLadoArec;
    private javax.swing.JLabel jLabelLadoBrec;
    private javax.swing.JLabel jLabelcuadradoA;
    private javax.swing.JTextField jTextFieldAlturaRED;
    private javax.swing.JTextField jTextFieldAlturaTria;
    private javax.swing.JTextField jTextFieldBaseRED;
    private javax.swing.JTextField jTextFieldCirperimetro;
    private javax.swing.JTextField jTextFieldCuadradoB;
    private javax.swing.JTextField jTextFieldDiametro;
    private javax.swing.JTextField jTextFieldLadoBRED;
    private javax.swing.JTextField jTextFieldLadoBRec;
    private javax.swing.JTextField jTextFieldRadio;
    private javax.swing.JTextField jTextFieldTrianguloBas;
    private javax.swing.JTextField jTextFieldcuadradoA;
    // End of variables declaration//GEN-END:variables
}
