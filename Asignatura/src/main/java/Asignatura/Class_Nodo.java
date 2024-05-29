
package Asignatura;


public class Class_Nodo {
   private Asignatura_Objeto informacion;
   Class_Nodo despues,antes;

    public Class_Nodo(Asignatura_Objeto informacion, Class_Nodo despues, Class_Nodo antes) {
        this.informacion = informacion;
        this.despues = despues;
        this.antes = antes;
    }
   
    public Class_Nodo(Asignatura_Objeto info){
      this(info, null, null);
     }

    public Asignatura_Objeto getInformacion() {
        return informacion;
    }

    public void setInformacion(Asignatura_Objeto informacion) {
        this.informacion = informacion;
    }

    public Class_Nodo getDespues() {
        return despues;
    }

    public void setDespues(Class_Nodo despues) {
        this.despues = despues;
    }

    public Class_Nodo getAntes() {
        return antes;
    }

    public void setAntes(Class_Nodo antes) {
        this.antes = antes;
    }
    
    
    
}
