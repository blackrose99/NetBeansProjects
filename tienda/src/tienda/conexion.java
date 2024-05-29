/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jhond
 */
public class conexion {

 //   public conexion() {
  //  }
   
    
    
    public static Connection getConexion() {
        Connection conexion = null;

        String url = "jdbc:mysql://localhost:3306/tienda";
        String userdb = "root";
        String pass = "";

        try {
            conexion = DriverManager.getConnection(url,userdb, pass);
            System.out.println("conexion exitosa");
            }
        
            catch(SQLException ex) {
                 JOptionPane.showMessageDialog(null, ex.toString());
                 System.out.println("no conexion");
                    }
        return conexion;
        }

    }
