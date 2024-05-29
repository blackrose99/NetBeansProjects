package dominio;

public class Prestamos {

    private int id;
    private Usuarios user;
    private Libros libro;
    private String fechaPrestamo;
    private String fechaEntrega;

    public Prestamos() {
    }

    public Prestamos(int id) {
        this.id = id;
    }

    public Prestamos(Usuarios user, Libros libro, String fechaPrestamo, String fechaEntrega) {
        this.user = user;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
    }

    public Prestamos(int id, Usuarios user, Libros libro, String fechaPrestamo, String fechaEntrega) {
        this.id = id;
        this.user = user;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
    }

 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuarios getUser() {
        return user;
    }

    public void setUser(Usuarios user) {
        this.user = user;
    }

    public Libros getLibro() {
        return libro;
    }

    public void setLibro(Libros libro) {
        this.libro = libro;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

}
