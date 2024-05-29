
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="estudy.Estudiante"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String nombre  = request.getParameter("nombre");
        String documento = request.getParameter("documento");
        String materia = request.getParameter("materia");
        String nota1 = request.getParameter("nota1");
        String nota2 = request.getParameter("nota2");
        
       Double definitiva;
        String aprobacion;
        Estudiante estu = new Estudiante(nota1,nota2);
        definitiva = estu.definitiva();
        aprobacion = estu.aprobacion();
        
        Estudiante guardarEstu = new Estudiante(nombre, documento, materia, definitiva, aprobacion);
        
        //crear array y registrar el estudiante
        ArrayList<Estudiante> lista;
        if(request.getSession().getAttribute("lista")==null){
            lista = new ArrayList<>();
        }else{
            //crea una lista en session y la caste
            lista = (ArrayList)request.getSession().getAttribute("lista");
        }
        lista.add(guardarEstu);
        
        // cargar la lista en session
        request.getSession().setAttribute("lista", lista);
        
        //redireccionamos otra vez al index
        request.getRequestDispatcher("index.jsp").forward(request, response);
            %>
    </body>
</html>
