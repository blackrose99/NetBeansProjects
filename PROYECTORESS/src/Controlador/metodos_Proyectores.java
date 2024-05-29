
package Controlador;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class metodos_Proyectores {
    public static void main(String[] args) throws ParseException {
//        Scanner sc = new Scanner(System.in);
//        int dia;
//        int mes;
//        int anio;
//        System.out.println("ingrese el dia de su nacimiento");
//        dia = sc.nextInt();
//        
//        System.out.println("ingrese el mes de su nacimiento");
//        mes = sc.nextInt();
//        mes = mes -1;
//        System.out.println("ingrese el año de su nacimiento");
//        anio = sc.nextInt();
//        anio = anio - 1900;
//        Date fe = new Date(anio, mes, dia); 
//
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        String cadena = sdf.format(fe);
//        System.out.println(cadena);
//        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      Date fechaActual = new Date();
   System.out.println(fechaActual);
        System.out.println("----------------------------");
        DateFormat formatearHora = new SimpleDateFormat("HH:mm:ss");
        DateFormat formatearFecha = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Son las: " + formatearHora.format(fechaActual) + " de fecha " + formatearFecha.format(fechaActual));
        
        
    Calendar fecha = Calendar.getInstance();
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH) + 1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);

        System.out.println("Fecha Actual: " +dia+ "/" + mes + "/" + año);
        System.out.printf("Hora actual: %02d:%02d:%02d %n", hora, minuto, segundo);
        
        
        System.out.println("Fecha y Hora desglosada \n");
        
        
        
        System.out.println("El año es: " + año);
        System.out.println("El mes es: " + mes);
        System.out.println("El dia es: " + dia);
        System.out.printf("La hora es: %02d %n", hora);
        System.out.printf("El minuto es: %02d %n", minuto);
        System.out.printf("El segundo es: %02d %n", segundo);
        

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date now = df.parse("2004-03-26 13:31:40");
        java.util.Date date = df.parse("2004-01-02 11:30:24");
        long l = now.getTime() - date.getTime();
        long day = l/(24*60*60*1000);
        long hour = (l/(60*60*1000)-day*24);
        long min = ((l/(60*1000))-day*24*60-hour*60);
        long s = (l/1000-day*24*60*60-hour*60*60-min*60);
        System.out.println("dia: " + day + " horas: " + hour + " minutos: " + min + " segundos: " + s );


    }

}
