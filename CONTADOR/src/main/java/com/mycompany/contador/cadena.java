
package com.mycompany.contador;
import javax.swing.JOptionPane;

public class cadena {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null, "Escriba una cadena: ", "Insertar Cadena", JOptionPane.INFORMATION_MESSAGE);
        texto = texto.toLowerCase();
        String espacios = "";
        char cadena[] = {'a', 'e', 'i', 'o', 'u'};
        char caracterActual;
        int contador = 0;
        boolean esVocal;
        for (int i = 0; i < texto.length(); i++) {
            caracterActual = texto.charAt(i);
            esVocal = false;

            for (int j = 0; j < cadena.length && !esVocal; j++) {
                if (cadena[j] == caracterActual) {
                    contador++;
                    esVocal = true;
                }
            }
        }
        JOptionPane.showMessageDialog(null, " La frase tiene " + contador + " vocales ", ""
                + "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
