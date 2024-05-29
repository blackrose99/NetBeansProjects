package Demo;

import Controlador.AutomovilDaoJDBC;
import Modelo.Automovil;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Automovil> automoviles = new AutomovilDaoJDBC().listar();
        //double saldoTotal = calcularSaldoTotal(automoviles);

        //request.setAttribute("automoviles", automoviles);
       // request.setAttribute("totalSaldo", saldoTotal);

        request.getRequestDispatcher("automoviles.jsp").forward(request, response);
    }

   // private double calcularSaldoTotal(List<Automovil> automoviles) {
       // double saldoTotal = 0;

       // for (Cliente cliente : clientes) {
           // saldoTotal += cliente.getSaldo();
       // }

        //return saldoTotal;
    }

