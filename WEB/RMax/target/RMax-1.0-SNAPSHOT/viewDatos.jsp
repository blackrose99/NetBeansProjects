
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="estudy.Estudiante"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos del Estudiante</title>
    </head>
    <body>
        <h1>Datos del Estudiante</h1>
       <%
           ArrayList<Estudiante> lista = (ArrayList)request.getSession().getAttribute("lista");
           for(Estudiante es: lista){
           %>
           <table cellspacing=3 cellpadding=3 border=1>
               
               <tr>
                   <td align="right">Tu nombre es:</td>
                   <td><%=es.getNombre()%> </td>
               </tr>

               <tr>
                   <td align="right">Tu Documento es:</td>
                   <td><%=es.getDocumento()%> </td>
               </tr>

               <tr>
                   <td align="right">Tu Materia es:</td>
                   <td><%=es.getMateria()%> </td>
               </tr>

               <tr>
                   <td align="right">Tu Definitiva es de:</td>
                   <td><%=es.getNotaDefinitiva()%> </td>
               </tr>

               <tr>
                   <td align="right">Estado academico:</td>
                   <td> <%=es.getApro()%> </td>
               </tr>
               
           </table>
           <%
               }
               %>
               <form action="index.jsp" method="post">
                   <input type="submit" value="Regresar">
               </form>
    </body>
</html>
