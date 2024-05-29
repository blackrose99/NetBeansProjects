
package lib;

import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Metodos_Libros {
    ArrayList<Libros> librito;
    
    
    
        
       public Metodos_Libros() {
        librito = new ArrayList<Libros>();
    }
    public void agregarLibro(Libros lib){
        librito.add(lib);
    } 
    
    
    public boolean consultarLibro(int codigo){
        boolean encontrado = false;
        for(Libros li: librito){
            if(li instanceof Libros){
                if(((Libros)li).codigo==codigo){
                    encontrado = true;
                    JOptionPane.showMessageDialog(null, li.mostrar_Libross());
                }
            }
        }
        if(encontrado != true){
            JOptionPane.showMessageDialog(null, " Este codigo no esta registrado ", "", JOptionPane.ERROR_MESSAGE);
        }
        return encontrado;
    }
    
    public boolean Prestar_Libro(int cog){
        boolean encon = false;
        for (Libros libr : librito) {
            if (libr instanceof Libros) {
                if (((Libros) libr).codigo == cog) {
                    encon = true;
                    if (libr.prestado == true) {
                        JOptionPane.showMessageDialog(null, "Este Libro se encuentra prestado");
                    }else if(libr.prestado == false){
                        libr.prestado=true;
                        JOptionPane.showMessageDialog(null, "Libro " + libr.titulo + " Prestado exitosamente");
                    }
                }
            }
        }
        if (encon != true) {
            JOptionPane.showMessageDialog(null, " Este codigo no esta registrado ", "", JOptionPane.ERROR_MESSAGE);
        }

        return encon;
    }

    public boolean resivir_Libro(int cog) {
        boolean encontrado = false;
        for (Libros li : librito) {
            if (li instanceof Libros) {
                if (((Libros) li).codigo == cog) {
                    encontrado = true;
                       if (li.prestado == true) {
                        JOptionPane.showMessageDialog(null, "Libro " + li.titulo + " devuelto exitosamente");
                        li.prestado=false;
                    }else if(li.prestado == false){
                        JOptionPane.showMessageDialog(null, "Este libro no se encuentra prestado, 'verifique bien' ");
                      
                    }
                }
            }
        }
        if (encontrado != true) {
            JOptionPane.showMessageDialog(null, " Este codigo no esta registrado ", "", JOptionPane.ERROR_MESSAGE);
        }

        return encontrado;
    }
    
    
    public void lista_Libros_Prestados(){
        String mostrar="Los libros prestados son: ";
        for(Libros libr: librito){
            if(libr instanceof Libros){
                if(((Libros)libr).prestado==true){
                    mostrar += ("\n" + libr.mostrar_Libross());
                }
            }
        }  
        
        JOptionPane.showMessageDialog(null, mostrar );
        
    }
    
    
    

    
    
}
