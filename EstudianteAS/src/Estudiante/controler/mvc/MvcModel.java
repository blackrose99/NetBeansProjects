package Estudiante.controler.mvc;

import Estudiante.controler.AsignaturaControler;
import Estudiante.model.Estudiante;
import Estudiante.view.EstudianteView;
import Estudiante.controler.EstudianteControler;
import Estudiante.model.Asignatura;
import Estudiante.model.Login;
import Estudiante.view.AsignaturaView;
import java.util.Scanner;

public class MvcModel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese nombre de usuario: ");
        String us = scanner.nextLine();

        System.out.print("Ingrese contraseña: ");
        String co = scanner.nextLine();

        Login login = Login.getInstance();
        Estudiante modelo = Estudiante.getInstance();
        Asignatura modeloa = Asignatura.getInstance();
        EstudianteView vista = new EstudianteView();
        AsignaturaView vistaa = new AsignaturaView();

        EstudianteControler controlador = new EstudianteControler(modelo, vista);
        AsignaturaControler controladora = new AsignaturaControler(modeloa, vistaa);

        // Ingresar datos en Estudiante
        if (login.autenticar(us, co)) {
            // Ingresar datos solo si el inicio de sesión es exitoso
            modelo.setId(1);
            modelo.setNombre("Andres");
            modelo.setApellido("Garcia");
            modelo.setTelefono("3114325698");
            modelo.setEmail("aaa@gmail.com");

            modeloa.setId(1001);
            modeloa.setCreditos(3);
            modeloa.setNombre("Programación Java");
            modeloa.setId_estudiante(modelo);
            modeloa.setNom_estudiante(modelo);

            controlador.actualizar();
            controladora.actualizarAsignatura();
        } else {
            System.out.println("Inicio de sesión fallido. Credenciales incorrectas.");
        }

        scanner.close();

    }
    /*
    private static Estudiante llenarDatosEstudiantes(){
            Estudiante estudiante =  new Estudiante();
            estudiante.setId(4);
            estudiante.setNombre("Andres");
            estudiante.setApellido("Garcia");
            estudiante.setTelefono("3114325698");
            estudiante.setEmail("aaa@gmail.com");
            return estudiante;
            
        }
    
    private static Asignatura llenarDatosAsignatura(){
            Asignatura asignatura =  new Asignatura();
            asignatura.setId(14242);
            asignatura.setCreditos(3);
            asignatura.setNombre("Nuevas tecnologias");
            Estudiante estudiante = llenarDatosEstudiantes();
            asignatura.setId_estudiante(estudiante);
            return asignatura;
        }
     */
}
