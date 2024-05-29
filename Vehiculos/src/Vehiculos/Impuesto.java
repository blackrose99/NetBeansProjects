
package Vehiculos;



public class Impuesto {
    private double valor;
        private String ano;
        
        public Impuesto(double valor, String ano){
            this.ano = ano;
            this.valor = valor;
        }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String año) {
        this.ano = año;
    }

    @Override
    public String toString() {
        return "Impuesto{" + "valor=" + valor + ", ano=" + ano + '}';
    }
    
    void BorrarImpuesto(){
         ano = null;
           valor = 0;
    }

        
}
