


package com.mycompany.productos;
public class servicios extends clase_abstract{
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
    public String descuentosProSER_(double servicios, double producto) {

        double alma = servicios - (servicios * 0.1);
        total = Double.toString(alma + producto);

        return total;
    }
    
        public String metos(double alma1, double alma2){
             total = Double.toString(alma1 * alma2);
        
        return total;
    }
    
}
