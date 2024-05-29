
package SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Crud_libro extends conexion_sql{
       DefaultTableModel modelo;
       String[] columna = {"id","codigo", "titulo", "autor", "editorial", "isnb","fecha"};
      String[] libro = new String[7];
      java.sql.Statement st;
       ResultSet rs;
       
  
  public  void Insert(String codigo, String titulo, String autor, String editorial, String isnb,String fecha) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = " insert into libro(codigo,titulo,autor,editorial,isbn,fecha)values('" + codigo + "','" + titulo + "','" + autor + "','" + editorial + "','"+ isnb +"','"+ fecha +"');";
            st.execute(sql);
            st.close();
            conexion.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pude guardar el libro  " );
        } 
    }


   public void SelectI(JTable tabla1) {
       modelo = new DefaultTableModel(null, columna);
        modelo.setRowCount(0);
        String sql = "select * from libro;";
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 7; i++) {
                    libro[i] = rs.getString(i + 1);
                }
                modelo.addRow(libro);

            }
            tabla1.setModel(modelo);
            st.close();
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puedn mostrar los libros");
        }
    }



    public void Update(JTable tabla1) {
        int fila = tabla1.getSelectedRow();
        int id = Integer.parseInt(tabla1.getValueAt(fila, 0).toString());
        String codigo = tabla1.getValueAt(fila, 1).toString();
        String titulo = tabla1.getValueAt(fila, 2).toString();
        String autor = tabla1.getValueAt(fila, 3).toString();
        String editorial = tabla1.getValueAt(fila, 4).toString();
         String isbn = tabla1.getValueAt(fila, 5).toString();
          String fecha = tabla1.getValueAt(fila, 6).toString();

        String sql = "update libro set codigo ='" + codigo + "', titulo= '" + titulo + "', autor='" + autor + "', editorial='" + editorial + "', isbn='"+ isbn +"', fecha= '"+ fecha +"' where id ='" + id + "' ;";
        try {
            Connection conexion = conectar();
            PreparedStatement actualizar = conexion.prepareStatement(sql);
            actualizar.executeUpdate();
            SelectI(tabla1);
            actualizar.close();
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error no se puede modificar este campo"+e );
        }
    }


    public void Delete(JTable tabla1) {
        int fila = tabla1.getSelectedRow();
        int id = Integer.parseInt(tabla1.getValueAt(fila, 0).toString());

        String sql = "delete from libro where id ='" + id + "' ;";
        try {
            Connection conexion = conectar();
            PreparedStatement eliminar = conexion.prepareStatement(sql);
            eliminar.executeUpdate();
            SelectI(tabla1);
            eliminar.close();
            conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "no se puede eliminar " + e);
        }
    }
}
