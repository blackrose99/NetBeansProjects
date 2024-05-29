
package estudy;

public class Estudiante {
            private String nombre;
    private int documento;
    private String materia;
    private double nota1;
    private double nota2;
    private double notaDefinitiva;
    private String apro;

    public Estudiante(){
    }
     public Estudiante(String nota1, String nota2){
      this.nota1 = Double.parseDouble(nota1);
        this.nota2 = Double.parseDouble(nota2);
    }
    
    public Estudiante(String nombre, String documento, String materia, double notadefinitiva, String apro) {
        this.nombre = nombre;
        this.documento = Integer.parseInt(documento);
        this.materia = materia;
        this.notaDefinitiva = notadefinitiva;
        this.apro = apro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNotaDefinitiva() {
        return notaDefinitiva;
    }

    public void setNotaDefinitiva(double notaDefinitiva) {
        this.notaDefinitiva = notaDefinitiva;
    }

    public String getApro() {
        return apro;
    }

    public void setApro(String apro) {
        this.apro = apro;
    }
    
    
    
    public double definitiva(){
        return notaDefinitiva = (nota1 + nota2) / 2;
    }
    
    public String aprobacion(){
        if(notaDefinitiva > 3){
            apro = "Aprobado";
        }else{
            apro = "Reprobado";
        }
        return apro;
    }
}
