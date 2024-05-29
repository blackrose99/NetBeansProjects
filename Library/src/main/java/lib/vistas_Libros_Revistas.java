
package lib;

import javax.swing.JOptionPane;
public class vistas_Libros_Revistas {
    public static void main(String[] args) {
        Metodos_Libros M_Lis = new Metodos_Libros();
        Metodos_Revistas M_Re = new Metodos_Revistas();
        
        int opcion, codigo, año_de_publicacion,serial;
        String titulo,autor;
        boolean prestadoo=false;
        
        
        Libros li1 = new Libros(5050, "Cien años de soledad", 2003, "Gabriel Garcia Márquez", false);
        M_Lis.agregarLibro(li1);
        Libros li2 = new Libros(6060, "El olvido que seremos", 2006, "Hertor Abad Faciolince", false);
        M_Lis.agregarLibro(li2);
        Libros li3 = new Libros(3030, "La maria", 2009, "Jorge Isaacs", true);
        M_Lis.agregarLibro(li3);

        
        
        Revistas re1 = new Revistas(1020, "Dinero", 2019, 6143);
        M_Re.agregarRevista(re1);
        Revistas re2 = new Revistas(1021, "Dinero", 2018, 2460);
        M_Re.agregarRevista(re2);
        Revistas re3 = new Revistas(1030, "Dinero", 2019, 6144);
        M_Re.agregarRevista(re3);

        
        do {            
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Menu de Opciones"+
                    "\n 1.Crear un libro"+
                    "\n 2.Crear una revista"+
                    "\n 3.Consultar u libro por el codigo"+
                    "\n 4.Prestar libro"+
                    "\n 5.devolver libro"+
                    "\n 6.Listado de libros prestados"+
                    "\n 7.Listado de revistas publicadas en los ultimos 5 años"+
                    "\n 8.Buscar la cantidad de revistas por el nombre"+
                    "\n 9.Salir del Programa"
            ));
            
                if(opcion>=10 || opcion<1){
                 JOptionPane.showMessageDialog(null, "Elija bien su Opción ", "",JOptionPane.ERROR_MESSAGE); 
             }else
            switch(opcion){
             
                           
                case 1:
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cogido del libro"));
                    titulo = JOptionPane.showInputDialog("Ingrese el titulo del libro");
                    año_de_publicacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de publicacion"));
                    autor=JOptionPane.showInputDialog("Ingrese el nombre del autor");
                    Libros li=new Libros(codigo,titulo,año_de_publicacion,autor,prestadoo);
                    M_Lis.agregarLibro(li);
                    JOptionPane.showMessageDialog(null, "Libro " + titulo + " añadido correctamente");
                    break;

                case 2:
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cogido de la revista"));
                    titulo = JOptionPane.showInputDialog("Ingrese el titulo de la revista");
                    año_de_publicacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de publicacion"));
                    serial=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el serial "));
                    Revistas re=new Revistas(codigo,titulo,año_de_publicacion,serial);
                    M_Re.agregarRevista(re);
                    JOptionPane.showMessageDialog(null, " Revista " + titulo + " añadido correctamente");

                    break;
        
                case 3:
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo a consultar"));
                    M_Lis.consultarLibro(codigo);
                    break;
                    
                    
                case 4:
                      codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo al libro que va a prestar"));
                      M_Lis.Prestar_Libro(codigo);
                    break;
                    
                case 5:
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo al libro que va a devolver"));
                    M_Lis.resivir_Libro(codigo);
                    break;
   
                    
                case 6:
                    M_Lis.lista_Libros_Prestados();
                    break;

                case 7:
                    M_Re.publicacion_Revistas();
                    break;

                case 8:
                    titulo = JOptionPane.showInputDialog("Ingrese el nombre de la revista");
                    M_Re.cantidad_PorNombre(titulo);
                    break;
                    


   
            }
        } while (opcion!=9);

    }
}
