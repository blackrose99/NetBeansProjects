package calificacion_Cafeteria;
import javax.swing.JOptionPane;
public class classCafeteria {
    public static void main(String[] args) {
        String ordenar = "";
        int auxiliar, contadorEstudiantes = 0;
        int calificaciones[] = new int[10];
        String asteriscos[] = new String[10];
        for (int i = 0; i < asteriscos.length; i++) {
            asteriscos[i] ="";
        }
        do {
            auxiliar = Integer.parseInt(JOptionPane.showInputDialog("Calificacion a nuestra Cafeteria UTS:"));
            if (auxiliar > 0 && auxiliar < 11) {
                calificaciones[auxiliar - 1]++;
                asteriscos[auxiliar - 1] += "*";
                contadorEstudiantes++;
            } else if (auxiliar < 0 || auxiliar >= 11) {
                JOptionPane.showMessageDialog(null, "Ingrese una Calificacion correcta");
            }
        } while (auxiliar != 0);
        JOptionPane.showMessageDialog(null, "Fin de las Calificaciones ", "", JOptionPane.WARNING_MESSAGE);
        ordenar = ordenar + "Rango";
        ordenar += "   ";
        ordenar = ordenar + "Cantidad";
        ordenar += "   ";
        ordenar = ordenar + "Histograma";
        ordenar += "\n";
        for (int i = 0; i < calificaciones.length; i++) {
            ordenar = ordenar + (i + 1 + ".");
            ordenar += "                   ";
            ordenar = ordenar + calificaciones[i];
            ordenar += "                   ";
             ordenar = ordenar + asteriscos[i]+"\n";
        }
        ordenar = ordenar + "La cantidad de estudiantes encuestados es de: " + contadorEstudiantes;
        JOptionPane.showMessageDialog(null, ordenar );
    }
    
}
