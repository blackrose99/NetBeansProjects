package futbol;

import java.util.Scanner;

public class futbol {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String opc;

        System.out.println("Desea utilizar el programa");
        opc = sc.next();
        while (opc.equalsIgnoreCase("si")) {
            Double seg, min;
            System.out.println("ingrese los segundos: ");
            seg = sc.nextDouble();
            min = seg / 60;
            System.out.println("los minutos que hay aca son de: " + Math.round(min));

            System.out.println("desea continuar");
            opc = sc.next();

        }

    }

}
    

