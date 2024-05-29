
package Consultas;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class Editar_Tabla extends DefaultTableCellRenderer{
    public Component getTableCellRendererComponent(JTable table, Object value,
                          boolean isSelected, boolean hasFocus, int row, int column){
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if(esPar(row)){
            this.setBackground(new Color(51,255,51));
            this.setForeground(Color.white);
        }else 
              this.setBackground(new Color(64, 67, 74));
            this.setForeground(Color.white);
            
        return this;
    }
    protected boolean esPar(int row){
        if(row%2==0){
            return true;
        }else{
            return false;
        }
            
    }
    
}
