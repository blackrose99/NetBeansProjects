package USA;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListaUsuario {

    ArrayList< Usuario> Usuar;
    ArrayList<Areas> ar;

    public ListaUsuario() {
        Usuar = new ArrayList<Usuario>();
    }

    //metodo para agregar Usuario
    public void agregarUsuario(Usuario Usu) {
        Usuar.add(Usu);
    }

    public boolean BuscarCedula(int ced) {
        boolean encontrado = false;
        for (Usuario u : Usuar) {
            if (u instanceof Usuario) {
                if (((Usuario) u).cedula == ced) {
                    encontrado = true;
                    JOptionPane.showMessageDialog(null, u.Mostrardatos());
                }
            }
        }
        if (encontrado != true) {
            JOptionPane.showMessageDialog(null, "Este Documento no Esta Registrado", "", JOptionPane.ERROR_MESSAGE);
        }
        return encontrado;
    }

    public boolean BuscarNombre(String nom) {
        boolean en = false;
        for (Usuario u : Usuar) {
            if (u instanceof Usuario) {
                if (((Usuario) u).nombre.equalsIgnoreCase(nom)) {
                    en = true;
                    JOptionPane.showMessageDialog(null, u.Mostrardatos());
                }
            }
        }
        if (en != true) {
            JOptionPane.showMessageDialog(null, "  Nombre no Registrado ", "", JOptionPane.ERROR_MESSAGE);
        }
        return en;
    }

    public boolean BuscarArea(int codig) {
        String cadena = "Los Usuarios del Area " + codig + " son:";
        boolean enco = false;
        for (Usuario u : Usuar) {
            if (u instanceof Usuario) {
                if (((Usuario) u).cod_area == codig) {
                    cadena += ("\n" + u.Mostrardatos());
                }
                enco = true;
            }
        }

        JOptionPane.showMessageDialog(null, cadena);
        return enco;
    }

    public boolean eleiminarpro(int ced) {
        boolean encontrado = false;
        for (int con = 0; con < Usuar.size(); con++) {
            if (Usuar.get(con).cedula == ced) {
                encontrado = true;
                Usuar.remove(con);
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Eliminado Exitoxamente");
        } else {
            JOptionPane.showMessageDialog(null, "Este Documento no se encuentra Registrado", "", JOptionPane.ERROR_MESSAGE);
        }
        return encontrado;
    }
          
          
          
          
            
    public void ordealfa() {
        String cad = "Lista ordenafa Alfabeticamente por su Nombre :";
        Collections.sort(Usuar);
        for (Usuario t : Usuar) {
            cad += ("\n" + t.nombre);

        }
        JOptionPane.showMessageDialog(null, cad);
    }

    public void ordencedu() {
        String cod = " Lista de Usuarios Ordenados por la cedula";
        Collections.sort(Usuar, new comparacedu());
        for (Usuario t : Usuar) {
            cod += ("\n" + t.Mostrardatos());
        }
        JOptionPane.showMessageDialog(null, cod);
    }

    public void ordemotivo() {
        String cod = " Lista de Usuarios Ordenados por Motivo de entrada: ";
        Collections.sort(Usuar, new compararmo());
        for (Usuario t : Usuar) {
            cod += ("\n" + t.Mostrardatos());
        }
        JOptionPane.showMessageDialog(null, cod);
    }

    public void ordenporcogarea() {
        String cod = " Lista de Usuarios Ordenados por El codigo del Area: ";
        Collections.sort(Usuar, new ordecog());
        for (Usuario t : Usuar) {
            cod += ("\n" + t.Mostrardatos());
        }
        JOptionPane.showMessageDialog(null, cod);
    }
}
