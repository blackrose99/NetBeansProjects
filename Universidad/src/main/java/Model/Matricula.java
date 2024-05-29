
package Model;

public class Matricula {
    private int id_ma;
    private String ano_ma;
    private String sem_ma;
    private Estudiante estudiante;
    private Asignatura asignatura;

    public int getId_ma() {
        return id_ma;
    }

    public void setId_ma(int id_ma) {
        this.id_ma = id_ma;
    }

    public String getAno_ma() {
        return ano_ma;
    }

    public void setAno_ma(String ano_ma) {
        this.ano_ma = ano_ma;
    }

    public String getSem_ma() {
        return sem_ma;
    }

    public void setSem_ma(String sem_ma) {
        this.sem_ma = sem_ma;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
    
}
