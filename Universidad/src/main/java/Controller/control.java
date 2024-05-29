
package Controller;

import DAO.matriculaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "control", urlPatterns = {"/control"})
public class control extends HttpServlet {
    
    matriculaDAO maDao;
    public control(){
        super();
        maDao = new matriculaDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ruta = "";
        String action =request.getParameter("action");
        if(action.equalsIgnoreCase("inicio")){
            ruta = "/view/datos.jsp";
            try {
                request.setAttribute("base1", maDao.llenarMatricula());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        RequestDispatcher rt = request.getRequestDispatcher(ruta);
        rt.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

}
