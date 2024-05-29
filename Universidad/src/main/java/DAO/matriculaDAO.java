package DAO;

import Model.*;
import java.sql.*;
import java.util.ArrayList;

public class matriculaDAO extends Conexion {

    public ArrayList<Matricula> llenarMatricula() throws Exception {
        ArrayList<Matricula> lista = new ArrayList<Matricula>();
        try {
            this.Conectar();
            String query = "SELECT m.id_ma, m.ano_ma, m.sem_ma, e.cc_est , e.nom_est, e.ape_est, a.nom_asi from matricula m \n"
                    + "inner join estudiante e on e.id_est = m.id_est \n"
                    + "inner join asignatura a on a.id_asi = m.id_asi;";
            PreparedStatement smt = this.getCnx().prepareStatement(query);
            ResultSet rt = smt.executeQuery();
            while (rt.next()) {
                Matricula m = new Matricula();
                Estudiante a = new Estudiante();
                Asignatura as = new Asignatura();
                m.setId_ma(rt.getInt("m.id_ma"));
                m.setAno_ma(rt.getString("m.ano_ma"));
                m.setSem_ma(rt.getString("m.sem_ma"));
                a.setCc_est(rt.getString("e.cc_est"));
                a.setNom_est(rt.getString("e.nom_est"));
                a.setApe_est(rt.getString("e.ape_est"));
                as.setNom_asi(rt.getString("a.nom_asi"));
                m.setEstudiante(a);
                m.setAsignatura(as);
                lista.add(m);
                
                System.out.println(1);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.Desconectar();
        }
        return lista;
    }
}
