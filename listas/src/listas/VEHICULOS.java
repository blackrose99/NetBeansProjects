package listas;

public class VEHICULOS {

   public String placa;
   public  String marca;
   public int modelo;
   public int cilindraje;
    //si fuera objeto tocaria creal el metodo toString. Y para mostrar los datos tocaria
   //temporal.getDato().toString();
    VEHICULOS enlace;

    public VEHICULOS(String placa, String marca, int modelo, int cilindraje) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.enlace = null;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCilindrage() {
        return cilindraje;
    }

    public void setCilindrage(int cilindrage) {
        this.cilindraje = cilindrage;
    }

    public VEHICULOS getEnlace() {
        return enlace;
    }

    public void setEnlace(VEHICULOS enlace) {
        this.enlace = enlace;
    }



 








    


}
