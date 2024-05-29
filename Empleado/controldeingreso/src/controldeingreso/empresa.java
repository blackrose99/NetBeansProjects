
  package controldeingreso;

import java.awt.geom.Area;
import javax.swing.JOptionPane;

public class empresa {
   
    
public static void main(String[] args) {
    
MetodosUsuario listaUso = new MetodosUsuario ();
MetodosUsuario area=new MetodosUsuario();

String Nombre,Tipo_de_usuario,motivo_entrada;
int contacto=0,cedula,f=0;
int opcion=0;
double temperaura;


do{opcion=Integer.parseInt(JOptionPane.showInputDialog("MENU DE ELECCIONES"+
"\n 1. registro de un Usuario"+
"\n 2. datos para poder entrar"+
"\n 3. Agregar su temperatura"+
"\n 4. hora de salida"+
"\n 5. salir"+
"\n\n ingrese una opcion"));


switch (opcion) {
case 1: cedula=Integer.parseInt(JOptionPane.showInputDialog("ingrese el documento.")); 
Nombre=JOptionPane.showInputDialog("ingrese el nombre.");
contacto=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de telefono."));
Tipo_de_usuario=JOptionPane.showInputDialog("ingrese su cargo.");
motivo_entrada=JOptionPane.showInputDialog("Cual es su motivo de entrada");
usuarios E= new usuarios(cedula,Nombre,contacto,Tipo_de_usuario,motivo_entrada);
listaUso.agregarusuario(E);
break;


case 2: String fecha = JOptionPane.showInputDialog("ingrese la fecha de hoy"); 
String horaentrada = JOptionPane.showInputDialog("Dijite la hora de ingreso");
 int opc;

do{
   opc=Integer.parseInt(JOptionPane.showInputDialog("Aque Area desea ingresar:"+
"\n 1. Atencion al Cliente"+
"\n 2. Produccion"+
"\n 3. Marketing y ventas"+
"\n 4. Tecnología"+
"\n 5. Finanzas y contabilidad"+
"\n\n salir del menu de areas"));
  
 switch(opc){
       
   case 1:
        JOptionPane.showMessageDialog(null, "Bienbenido al Area Atencion a Cliente");
   break;
    case 2:
        JOptionPane.showMessageDialog(null, "Bienbenido al Area de Produccion");
   break;
    case 3:
        JOptionPane.showMessageDialog(null, "Bienbenido al Area Marketing y Ventas");
   break;
    case 4:
        JOptionPane.showMessageDialog(null, "Bienbenido al Area Tecnología");
   break;
    case 5:
        JOptionPane.showMessageDialog(null, "Bienbenido al Area Finanzas y Contabilidad ");
   break;
   }
   
}while (opc!=opc);

  



break;


case 3: temperaura= Double.parseDouble(JOptionPane.showInputDialog("ingrese su temperatura"));
if(temperaura>=38.0){
    JOptionPane.showMessageDialog(null, "Su temperatura corporal sobrepasa los Protocolos Establecidos ");
}else
    JOptionPane.showMessageDialog(null, "Bienvenido a la empresa ");

break;


case 4: String horasalida = JOptionPane.showInputDialog("ingrese la hora de salida");

break;

}
}while (opcion != 5);
}

}