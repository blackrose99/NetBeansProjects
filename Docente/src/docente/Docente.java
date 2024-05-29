
package docente;

// Superclase
public class Docente {
     String documento;
     String nombre;
    String genero;
    String programa;
    int categoria;

    public Docente() {
    }

    public Docente(String documento, String nombre, String genero, String programa, int categoria) {
        this.documento = documento;
        this.nombre = nombre;
        this.genero = genero;
        this.programa = programa;
        this.categoria = categoria;
    }


   

    public String mostrarDatosPlanta(){
        return "Docente de Planta"+  "ID: " + documento + " Nombre: "+nombre+ " Programa Academico: "+ programa + " Categoría Docente: "+categoria + " Genero: "+genero;
    }
    
    
        public String mostrarDatosCatedra(){
        return "Docente de Catedra"+  "ID: " + documento + " Nombre: "+nombre+ " Programa Academico: "+ programa + " Categoría Docente: "+categoria + " Genero: "+genero;
    }
    
    
    
}
