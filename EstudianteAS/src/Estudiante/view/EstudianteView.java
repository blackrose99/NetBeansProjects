package Estudiante.view;

public class EstudianteView {
    public void imprimirDatos(int id, String nombre, String apellido, String telefono, String email){
        System.out.println("---Datos Estudiante---");
        System.out.println("ID: "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Telefono: "+telefono);
        System.out.println("email: "+email);
        System.out.println("");
    }
}
