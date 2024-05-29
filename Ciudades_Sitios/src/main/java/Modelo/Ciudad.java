
package Modelo;


public class Ciudad {
    private int id;
    private String name;
    private String depto;
    private String pais;
    private double area;
    private int poblacion;
    private double latitud;
    private double longitud;

    public Ciudad() {
    }

    public Ciudad(int id) {
        this.id = id;
    }

    public Ciudad(String name, String depto, String pais, double area, int poblacion, double latitud, double longitud) {
        this.name = name;
        this.depto = depto;
        this.pais = pais;
        this.area = area;
        this.poblacion = poblacion;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Ciudad(int id, String name, String depto, String pais, double area, int poblacion, double latitud, double longitud) {
        this.id = id;
        this.name = name;
        this.depto = depto;
        this.pais = pais;
        this.area = area;
        this.poblacion = poblacion;
        this.latitud = latitud;
        this.longitud = longitud;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
