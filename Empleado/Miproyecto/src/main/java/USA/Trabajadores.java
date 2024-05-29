
package USA;


public class Trabajadores extends Usuario{
 String cargo_empresa;
 int codigo_empleado;
 String clave_acceso;

 public Trabajadores(){  
 }

    public Trabajadores(String cargo_empresa, int codigo_empleado, String clave_acceso, int cod_area, double temperatura, String nombre, int cedula, int edad, int telefono, String motivo_emtrada, String fecha_entrada, String hora_entrada) {
        super(cod_area, temperatura, nombre, cedula, edad, telefono, motivo_emtrada, fecha_entrada, hora_entrada);
        this.cargo_empresa = cargo_empresa;
        this.codigo_empleado = codigo_empleado;
        this.clave_acceso = clave_acceso;
    }
    public  String Mostrardatos(){
       return  super.Mos()+"\n Datos Como Trabajador: " + " \n cargo en la empresa: " +cargo_empresa+ "\n codigo del empleado: "+codigo_empleado;
    }
 

}
