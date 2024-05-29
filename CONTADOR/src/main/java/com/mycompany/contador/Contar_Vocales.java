package com.mycompany.contador;



public class Contar_Vocales {

    public static void main(String[] args) {
        String cadena = "la lluvia es muy fuerte cada dia pero bueno ";
        String espacio = "";
        char caracterActual;
        int contador = 0, i, cont = 0, f, consonantes, can = 0;
        
        //for para contar la longitud de la cadena 
        for (f = 0; f < cadena.length(); f++) {
            cont++;
        }
        //for con condicinal para ver si en la cadena hay vocales 
        for (i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e'
                    || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
                contador++;

            }

        }
        
        //for para agrupar la cadena, y asi que no haya ningun espacio
        for (int j = 0; j < cadena.length(); j++) {
            caracterActual = cadena.charAt(j);
            if (caracterActual != ' ') {
                espacio += caracterActual;
            }
        }
        
        //for es para contar los caracteres de la cadena que se ha agrupado en el otro for
        for (int k = 0; k < espacio.length(); k++) {
            char carac = espacio.charAt(k);
            can++;
        }

        consonantes = can - contador;

        System.out.println("la frace: " + cadena + " tiene " + contador + " Vocales ");
        System.out.println("Las consonantes de la frase son: " + consonantes);

    }
}
