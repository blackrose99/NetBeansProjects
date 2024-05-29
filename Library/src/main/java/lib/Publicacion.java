
package lib;

public class Publicacion {
     int codigo;
    String titulo;
    int año_Publicacion;

    public Publicacion(int codigo, String titulo, int año_Publicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.año_Publicacion = año_Publicacion;
    }


    
   public String mostrar_Libros(){
       return "Libro:" + "\n Codigo: " + codigo + "\n Titulo: " + titulo + "\n Año de Publicación: " + año_Publicacion;
     }
   
    public String mostrar_Revistas(){
       return "Revistas:" + "\n Codigo: " + codigo + "\n Titulo: " + titulo + "\n Año de Publicación: " + año_Publicacion;
   }
   
}
