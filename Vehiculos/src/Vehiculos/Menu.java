package Vehiculos;

import javax.swing.JOptionPane;

public class Menu {

    String marca, modelo, placa, date;
    int cilindraje, dimension, cont, op, op2, op3;
    double valor;

    public void Menu() {
        dimension = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese la dimensión del arreglo (min 2)"));

        Vehiculos V[] = new Vehiculos[dimension];
        Impuesto I[][] = new Impuesto[dimension][2];

        V[0] = new Vehiculos("Mazda", "Sport 2023", "ABC123", 500);
        I[0][0] = new Impuesto(1500, "10-12-2000");

        cont = 1;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("\t\tMenú"
                    + "\n1. Agregar vehículo"
                    + "\n2. Editar vehículo"
                    + "\n3. Eliminar vehículo"
                    + "\n4. Ver vehículo"
                    + "\n5. Salir"
                    + "\n\nPor favor, ingrese una opción: "));

            switch (op) {
                case 1: {
                    marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo");
                    modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo: ");
                    placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo: ");
                    cilindraje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cilindraje del vehículo: "));
                    //registro de vehiculos

                    V[cont] = new Vehiculos(marca, modelo, placa, cilindraje);
                    date = JOptionPane.showInputDialog("Digita el año de los impuestos");
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del impuesto: "));
                    //registro de los impuestos
                    I[cont][cont] = new Impuesto(valor, date);
                    cont++;
                    JOptionPane.showMessageDialog(null, "Registro completado");

                    break;
                }

                case 2: {
                    String placaVehiculo = JOptionPane.showInputDialog("Ingrese la placa del vehículo: ");

                    boolean encontrado = false;

                    for (int i = 0; i < V.length; i++) {
                        if (placa.equalsIgnoreCase(V[i].getPlaca())) {
                            encontrado = true;
                            do {
                                op2 = Integer.parseInt(JOptionPane.showInputDialog("\t\t¿Qué atributo desea editar?"
                                        + "\n1. Marca "
                                        + "\n2. Modelo "
                                        + "\n3. Placa "
                                        + "\n4. cilindraje "
                                        + "\n5. Editar impuetos"
                                        + "\n6. Salir"
                                        + "\n\nPor favor, ingrese una opción: "));
                                switch (op2) {
                                    case 1:
                                        String nuevaMarca = JOptionPane.showInputDialog("Por favor, ingrese la nueva marca del Vehículo: ");
                                        V[i].setMarca(nuevaMarca);
                                        JOptionPane.showMessageDialog(null, "Edición completada");

                                        break;

                                    case 2:
                                        String nuevaModelo = JOptionPane.showInputDialog("Por favor, ingrese el nuevo modelo del Vehículo: ");
                                        V[i].setMarca(nuevaModelo);
                                        JOptionPane.showMessageDialog(null, "Edición completada");

                                        break;

                                    case 3:
                                        placaVehiculo = JOptionPane.showInputDialog("Por favor, ingrese la nueva placa del Vehículo: ");
                                        V[i].setMarca(placaVehiculo);
                                        JOptionPane.showMessageDialog(null, "Edición completada");

                                        break;

                                    case 4:
                                        String nuevoCilindraje = JOptionPane.showInputDialog("Por favor, ingrese el nuevo cilindraje del Vehículo: (km) ");
                                        V[i].setMarca(nuevoCilindraje);
                                        JOptionPane.showMessageDialog(null, "Edición completada");

                                        break;
                                    case 5:
                                        do {
                                            op3 = Integer.parseInt(JOptionPane.showInputDialog("\t\t¿Qué atributo desea editar?"
                                                    + "\n1. Valor "
                                                    + "\n2. Fecha "
                                                    + "\n3. Salir"
                                                    + "\n\nPor favor, ingrese una opción: "));

                                            switch (op3) {
                                                case 1:

                                                    break;
                                                case 2:

                                                    break;
                                                case 3:

                                                    break;
                                                default:
                                                    throw new AssertionError();
                                            }
                                        } while (op3 != 3);

                                        break;

                                    default:
                                        JOptionPane.showConfirmDialog(null, "Opción incorrecta, ingrese una nuevamente");
                                }

                            } while (op2 != 5);
                        }
                    }
                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "La placa ingresada no está registrada");
                    }

                    break;
                }

                case 3: {

                    String placaVehiculo = JOptionPane.showInputDialog("Ingrese la placa del vehículo: ");

                    boolean encontrado = false;

                    for (int i = 0; i < V.length; i++) {
                        if (placa.equalsIgnoreCase(V[i].getPlaca())) {
                            encontrado = true;
                            int contar = i;
                            //eliminacion de los vehiculos 
                            V[i].borrarVehiculo();
                            //eliminacion del de los impuestos 
                            I[contar][contar].BorrarImpuesto();
                            JOptionPane.showMessageDialog(null, "Eliminación completada");

                        }
                    }

                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "La placa ingresada no está registrada");
                    }

                    break;
                }

                case 4: {
                    String placaVehiculo = JOptionPane.showInputDialog("Ingrese la placa del vehículo: ");

                    boolean encontrado = false;

                    for (int i = 0; i < V.length; i++) {
                        if (placa.equalsIgnoreCase(V[i].getPlaca())) {
                            encontrado = true;
                            //mostrar la imformacion del vehiculo mas la de los impuestos
                            JOptionPane.showMessageDialog(null, V[i].mostrarDatos() + I[i][i].toString());

                        }
                    }
                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "La placa ingresada no está registrada");
                    }

                    break;
                }

                case 5:
                    JOptionPane.showMessageDialog(null, "Hasta luego! ");

                    break;

                default:
                    JOptionPane.showConfirmDialog(null, "Opción incorrecta, ingrese una nuevamente");
            }

        } while (op != 5);
    }
}
