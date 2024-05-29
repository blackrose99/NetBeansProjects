
package lib;


public class Libros extends Publicacion{
    String autor;
    boolean prestado;

    public Libros( int codigo, String titulo, int año_Publicacion, String autor, boolean prestado) {
        super(codigo, titulo, año_Publicacion);
        this.autor = autor;
        this.prestado = prestado;
    }
    
    public String mostrar_Libross(){
        return super.mostrar_Libros() + "\n Autor: " + autor + "\n En Servicio: " + prestado;
    }

    
    
    
}
