


public class Servicios extends Abstract_Servicios_Productos{
public static String total;



    @Override
    public String totalDescuentos() {
       return total;
    }

    @Override
    public String descuentosProSER(double servicios, double productos) {

         return total;
    }
    public String totalservicio(double servicio){
        total = Double.toString(servicio);
        return total;
    }
    public String descuentosProSER_(double servicios, double valorproductos, double cantidaPro) {
         double productos =  valorproductos * cantidaPro;
        double f2 = servicios - (servicios * 0.1);
        total = Double.toString(productos + f2);
        return total;
    }
    
}
