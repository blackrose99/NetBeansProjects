package dominio;

public class Matriculas {

    private int id;
    public Estudiantes estudiante;
    public Asignaturas asignatura;

    public Matriculas() {
    }

    public Matriculas(int id) {
        this.id = id;
    }

    public Matriculas(int id, Estudiantes estudiante, Asignaturas asignatura) {
        this.id = id;
        this.estudiante = estudiante;
        this.asignatura = asignatura;
    }

    public Matriculas(Estudiantes estudiante, Asignaturas asignatura) {
        this.estudiante = estudiante;
        this.asignatura = asignatura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estudiantes getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiantes estudiante) {
        this.estudiante = estudiante;
    }

    public Asignaturas getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignaturas asignatura) {
        this.asignatura = asignatura;
    }

}