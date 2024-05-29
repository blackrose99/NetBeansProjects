
package ListaEnlazadas_DoblementeCirculares;


public class ClassObject {
      private String placa;
    private int modelo;
    private int cilindraje;
    private String marca;

    public ClassObject(String placa, int modelo, int cilindraje, String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

   @Override
    public String toString() {
        return " Vehiculo: " + " Placa: " + placa + " Modelo: " + modelo + " Cilindraje: " + cilindraje + " Marca: " + marca;
    }
    
}
