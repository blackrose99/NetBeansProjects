
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="resources/css/materialize.css"/>
    </head>

    <body>
        <div class="container">
            <div class="row">
                <div class="col m12">
                    <div class="card black white-text center-align z-depth-3">
                        <h3>Matriculas</h3>
                    </div>
                    <div class="col m12">
                        <table class="responsive-table">
                            <tr class="black z-depth-4 white-text">
                                <th>Id</th>
                                <th>Año</th>
                                <th>Semestre</th>
                                <th>CC</th>
                                <th>Nombre</th>
                                <th>Apellido</th>
                                <th>Nombre Asignatura</th>
                            </tr>
                           <c:forEach items="${base1}" var="m">
                                <tr>
                                    <td>${m.id_ma}</td>
                                    <td>${m.ano_ma}</td>
                                    <td>${m.sem_ma}</td>
                                    <td>${m.estudiante.cc_est}</td>
                                    <td>${m.estudiante.nom_est}</td>
                                    <td>${m.estudiante.ape_est}</td>
                                    <td>${m.asignatura.nom_asi}</td>
                                </tr>
                            </c:forEach>

                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
