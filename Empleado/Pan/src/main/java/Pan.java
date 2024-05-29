import java.util.Scanner;

//cada pieza de pan tiene un costo de 5
//si el cliente compra mas de 50 piezas $4.50
//si el cliente compra mas de 100 de costara $4.
//calcule la cantidad de piezas de pan que el cliente compro y cuanto tiene que pagar

public class Pan{
    
    public static void main(String[] args) {
        
        int can_pieza =0;
        double totalpagar =0;
        Scanner scanner =new  Scanner (System.in);
        System.out.println("INGRESE LA CANTIDAD DE PIEZAS DE PAN QUE VA A COMPRAR" );
        can_pieza=scanner.nextInt();
        
        if (can_pieza>= 50 && can_pieza<100){
            totalpagar=can_pieza*4.5;
        }
        else if (can_pieza>=100){
            totalpagar=can_pieza*4;
        }
        else{
            totalpagar=can_pieza*5;
        }
        System.out.println("LA CANTIDAD DE PIEZAS QUE USTED HA COMPRADO SON :" +can_pieza);
        System.out.println("EL TOTAL A PAGAR ES DE :" +totalpagar);
        
    }
}