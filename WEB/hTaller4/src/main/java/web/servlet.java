package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet")
public class servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //Resivir los datos del formulario

            String id = request.getParameter("id");
            String name = request.getParameter("name");
            double nota1 = Double.parseDouble(request.getParameter("nota1"));
            double nota2 = Double.parseDouble(request.getParameter("nota2"));
            double nota3 = Double.parseDouble(request.getParameter("nota3"));
            //calcular el promedio 
            double promedio  = (nota1 + nota2 + nota3) / 3;
                promedio = Math.round(promedio*100)/100;
            //crear un array que almacene los 

          Estudiante estudiante = new Estudiante(id, name, nota1, nota2, nota3, promedio);

            ArrayList<Estudiante> lista;
            if (request.getSession().getAttribute("lista") == null) {
                lista = new ArrayList<>();
            } else {
                //crea una lista en session y la caste
                lista = (ArrayList) request.getSession().getAttribute("lista");
            }
            lista.add(estudiante);
            // cargar la lista en session
            request.getSession().setAttribute("lista", lista);

            //redireccionamos otra vez al index
            request.getRequestDispatcher("index.html").forward(request, response);
        }
    }
}
