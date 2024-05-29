package DAO;

import java.sql.*;

public class Conexion {
    private static String ruta = "jdbc:mysql://localhost:3306/universidades?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static String user = "root";
    private static String pass = "0852";

    private Connection cnx;

    public Connection getCnx() {
        return cnx;
    }

    public void setCnx(Connection cnx) {
        this.cnx = cnx;
    }

    public void Conectar() throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.cnx = DriverManager.getConnection(ruta, user, pass);
            if (this.cnx != null) {
                System.out.println("Conectado Correctamente");
            } else {
                System.out.println("Error al conectar");
            }
        } catch (Exception e) {
        }
    }

    public void Desconectar() throws Exception {
        try {
            if(this.cnx != null){
                if(this.cnx.isClosed() != true){
                    this.cnx.close();
                }
            }
        } catch (Exception e) {
        }
    }
}
