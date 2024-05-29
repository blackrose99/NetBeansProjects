

package proyector;

public class Proyector {
    int codigo;
    String marca;
    int año_compra;
    boolean prestado; //true prestado y falce disponible
     
    public Proyector(){
}

    public Proyector(int codigo, String marca, int año_compra, boolean prestado) {
        this.codigo = codigo;
        this.marca = marca;
        this.año_compra = año_compra;
        this.prestado = prestado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño_compra() {
        return año_compra;
    }

    public void setAño_compra(int año_compra) {
        this.año_compra = año_compra;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
        
    public String mostrarDatos(){
        return ("Codigo del proyector: "+codigo + " Año del compra: "+año_compra + " Marca: "+ marca + " Estado de prestamo: "+prestado);    
    }
        public void prestar(){
        if (prestado)
            System.out.println("Este proyector ya está prestado.");
        else
            prestado=true;
    }
            
    public void devolver(){
        prestado=false; 
    }
 
}


