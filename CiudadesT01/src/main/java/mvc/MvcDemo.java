package mvc;

import Controlador.Controller;
import Model.Ciudad;
import Vista.View;

public class MvcDemo {

    public static void main(String[] args) {
        Ciudad modelo = llenarDatosCiudad();
        View vista = new View();

        Controller controlador = new Controller(modelo, vista);

        controlador.actualizarVista();

        controlador.setName("PRUEBA");
        controlador.setPais("Venezuala");
        controlador.setPoblacion(0);
        controlador.actualizarVista();
    }

    private static Ciudad llenarDatosCiudad() {
        Ciudad ciudad = new Ciudad();
        ciudad.setId(1);
        ciudad.setName("Bucaramanga");
        ciudad.setDepto("Santander");
        ciudad.setPais("Colombia");
        ciudad.setArea(1234);
        ciudad.setPoblacion(50);
        ciudad.setLatitud(456);
        ciudad.setLongitud(789);
        return ciudad;
    }
}
