
package vehiculos_v2;
import java.util.Scanner;
import java.util.Date;

public class Vehiculos_v2 {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("digite la dimension ");
        int dimension = sc.nextInt(); 
        
        int[][] umero = new int[dimension][2];
        
        
        int menu;
        do {
            System.out.println("  1Agregar vehículo\"\n"
                    + "                    2. Editar vehículo\"\n"
                    + "                    3. Eliminar vehículo\"\n"
                    + "                    4. Ver vehículo\"\n"
                    + "                    5. Salir\"\n"
                    + "                  Por favor, ingrese una opción: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;

                default:
                    throw new AssertionError();
            }
            
        } while (menu!=5);
       
    }
    
    
    public class Vehiculo{
        private String marca;
        private String modelo;
        private String placa;
        private int cilindraje; 
        
        public Vehiculo(){
            
            
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getPlaca() {
            return placa;
        }

        public void setPlaca(String placa) {
            this.placa = placa;
        }

        public int getCilindraje() {
            return cilindraje;
        }

        public void setCilindraje(int cilindraje) {
            this.cilindraje = cilindraje;
        }
        
    }
    
    public class Impuesto{
        private double valor;
        private Date año;

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }

        public Date getAño() {
            return año;
        }

        public void setAño(Date año) {
            this.año = año;
        }
        
       
    }
}
