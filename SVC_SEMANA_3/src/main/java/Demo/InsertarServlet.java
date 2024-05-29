package Demo;

import Controlador.AutomovilDaoJDBC;
import Modelo.Automovil;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertarServlet")
public class InsertarServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //parametros del formulario a continuacion

        String marca = request.getParameter("marca");
        String modelo = request.getParameter("modelo");
        int año = Integer.parseInt(request.getParameter("año"));
        String color = request.getParameter("color");
        double precio = Double.parseDouble(request.getParameter("precio"));

        // objeto Clientes con los datos del formulario creado
        Automovil automovil = new Automovil();
        automovil.setMarca(marca);
        automovil.setModelo(modelo);
        automovil.setAño(año);
        automovil.setColor(color);
        automovil.setPrecio(precio);

        //METODOS INSERTAR CLIENTEDAO
        AutomovilDaoJDBC AutomovilDaoJDBC = new AutomovilDaoJDBC();

        int RegistrosInsertados = AutomovilDaoJDBC.insertar(automovil);

        //  INSERCION DE DATOS:
        if (RegistrosInsertados > 0) {
            request.setAttribute("Registro Realizado Exitosamente", String.valueOf(RegistrosInsertados));
            request.getRequestDispatcher("Formulario.jsp").forward(request, response);

        } else if (RegistrosInsertados < 1) {

            //GENERO ERROR
            request.setAttribute("Registro Realizado Exitosamente", String.valueOf(RegistrosInsertados));
            request.getRequestDispatcher("Formulario.jsp").forward(request, response);

        }

    }

}
