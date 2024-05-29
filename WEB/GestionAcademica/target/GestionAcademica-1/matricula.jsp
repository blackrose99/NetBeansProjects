<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <title>Control de Clientes</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="recursos/estilos.css"/>
    </head>
    <body>
        <jsp:include page="plantillas/navegacion.jsp" />
        <header class="container mt-5 d-flex justify-content-between">
            <div class="text-light p-3 text-center">
                <a class="btn btn-success btn-lg" href="Matricula_Controlador?action=lista"><i class="fas fa-plus"></i> Agregar Nuevo</a>
            </div>

            <div class="text-light bg-primary p-3 text-center">
                <h3><i class="fas fa-clipboard-check"></i> Total de Matriculas:</h3>
                <h3>${matriculas.size()}</h3>
            </div>

        </header>
        <div class="container-sm bg-dark text-light mt-5 p-3">
            <h2 class="text-center">Control de Matrículas</h2>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th class="text-light">ID Matricula</th>
                        <th class="text-light">Cédula</th>
                        <th class="text-light">Nombre Estudiante</th>
                        <th class="text-light">Apellido Estudiante</th>
                        <th class="text-light">Código Asignatura</th>
                        <th class="text-light">Nombre Asignatura</th>
                        <th class="text-light">Créditos</th>
                        <th class="text-light"></th>
                        <th class="text-light"></th>

                    </tr>
                </thead>
                <tbody>
                         <% if (request.getAttribute("alerta") != null) {%>
                <script>
                         var alerta = '<%= request.getAttribute("alerta")%>';
                         if (alerta !== null && alerta !== "") {
                             alert(alerta);
                         }
                </script>
                <% }%>
                    <% if (request.getAttribute("eliminacionExitosa") != null) {%>
                <script>
                    var registrosEliminados = <%= request.getAttribute("eliminacionExitosa")%>;
                    if (registrosEliminados > 0) {
                        alert("Eliminación exitosa.");
                    } else {
                        alert("Error. No se puede eliminar.");
                    }
                </script>
                <% }%>
                <c:forEach var="matricula" items="${matriculas}">
                    <tr>
                        <td class="text-light">${matricula.id}
                        </td>
                        <td class="text-light">${matricula.estudiante.cc}</td>
                        <td class="text-light">${matricula.estudiante.nombre}</td>
                        <td class="text-light">${matricula.estudiante.apellido}</td>      
                        <td class="text-light">${matricula.asignatura.codigo}</td>
                        <td class="text-light">${matricula.asignatura.nombre}</td>
                        <td class="text-light">${matricula.asignatura.creditos}</td>
                        <td class="text-light"> <a href="Matricula_Controlador?action=editar&id=${matricula.id}" class="btn btn-info"><i class="fas fa-edit"></i> Editar</a> </td>
                        <td class="text-light"> <a href="Matricula_Controlador?action=eliminar&id=${matricula.id}" class="btn btn-danger"><i class="fas fa-times"></i> Eliminar</a> </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

        <jsp:include page="plantillas/fotter.jsp" />
    </body>
</html>
