package com.mycompany.contador;

import javax.swing.JOptionPane;

public class Espacios {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null, "Escriba una cadena: ", "Insertar Cadena", JOptionPane.INFORMATION_MESSAGE);

        char caracterActual;
        String texto_Sin_Espacio=""; 

        for (int i = 0; i < texto.length(); i++) {
            caracterActual = texto.charAt(i);
            
            
            if(caracterActual !=' '){
                texto_Sin_Espacio+=caracterActual;
            }

        }
             JOptionPane.showMessageDialog(null, texto_Sin_Espacio ,"Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

}
