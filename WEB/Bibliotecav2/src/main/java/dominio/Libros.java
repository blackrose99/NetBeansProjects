                  
package dominio;


public class Libros {
    private int id;
    private String titulo;
    private String autor;
    private int fecha;
    private String genero;
    
  

    public Libros() {
    }

    public Libros(int id) {
        this.id = id;
    }

    public Libros(String titulo, String autor, String genero, int fecha) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.fecha = fecha;
    }

    public Libros(int id, String titulo, String autor, String genero, int fecha) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.fecha = fecha;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    
}
