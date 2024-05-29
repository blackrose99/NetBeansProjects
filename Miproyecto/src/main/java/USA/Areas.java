
package USA;

public class Areas {

    String nom_area;
    int capa_max;
    int cod;
    int cantidad_actual;

    public Areas(String nom_area, int capa_max, int cod, int cantidad_actual) {
        this.nom_area = nom_area;
        this.capa_max = capa_max;
        this.cod = cod;
        this.cantidad_actual = cantidad_actual;
    }

  
    public String mostr() {
        return "Areas:" + "\n nombre del Area:" + nom_area + ", capa_max=" + capa_max + ", cod=" + cod + ", cantidad_actual=" + cantidad_actual + '}';
    }

    
    
}
