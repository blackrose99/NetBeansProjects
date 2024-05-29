



public class Producto extends Abstract_Servicios_Productos{
public static String total;

    
    public String calcularSubtotalProductos(double varlorProducto, double cantidadPro){
        total = Double.toString(varlorProducto * cantidadPro);
        return total;
    }

        @Override
    public String totalDescuentos() {
       return total;
    }

    @Override
    public String descuentosProSER(double servicios, double productos) {
       return total;
    }
    
    
}
