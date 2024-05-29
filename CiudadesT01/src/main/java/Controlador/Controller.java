package Controlador;

import Model.Ciudad;
import Vista.View;

public class Controller {

    private Ciudad modelo;
    private View vista;

    public Controller(Ciudad modelo, View vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public int getId() {
        return modelo.getId();
    }

    public String getName() {
        return modelo.getName();
    }

    public String getDepto() {
        return modelo.getDepto();
    }

    public String getPais() {
        return modelo.getPais();

    }

    public double getArea() {
        return modelo.getArea();
    }

    public int getPoblacion() {
        return modelo.getPoblacion();
    }

    public double getLatitud() {
        return modelo.getLatitud();
    }

    public double getLongitud() {
        return modelo.getLongitud();
    }

    public void setId(int id) {
        this.modelo.setId(id);
    }

    public void setName(String name) {
        this.modelo.setName(name);
    }

    public void setDepto(String depto) {
        this.modelo.setDepto(depto);
    }

    public void setPais(String pais) {
        this.modelo.setPais(pais);
    }

    public void setPoblacion(int poblacion) {
        this.modelo.setPoblacion(poblacion);
    }

    public void setArea(double area) {
        this.modelo.setArea(area);
    }

    public void setLatitud(double latitud) {
        this.modelo.setLatitud(latitud);
    }

    public void setLongitud(double longitud) {
        this.modelo.setLongitud(longitud);
    }

    public void actualizarVista() {
        vista.imprimirDatosCiudad(modelo.getId(), modelo.getName(), modelo.getDepto(), modelo.getPais(), modelo.getArea(), modelo.getPoblacion(), modelo.getLatitud(), modelo.getLongitud());
    }
}
