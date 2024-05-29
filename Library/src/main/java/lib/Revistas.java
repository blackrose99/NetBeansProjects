
package lib;


public class Revistas extends Publicacion{
    int serial;

    public Revistas( int codigo, String titulo, int año_Publicacion,int serial) {
        super(codigo, titulo, año_Publicacion);
        this.serial = serial;
    }
        public String mostrar_Revistass(){
        return super.mostrar_Revistas()+ "\n Serial: " + serial ;
    }


    
}
