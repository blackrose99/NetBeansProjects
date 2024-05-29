 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <title>Control de Clientes</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous"><!-- comment -->
        <link rel="stylesheet" type="text/css" href="recursos/estilos.css"/>
    </head>
    <body class="uvh-100">
        <jsp:include page="plantillas/navegacion.jsp" />
        
        <header class="container mt-5 d-flex justify-content-between">
            <div class="text-light p-3 text-center">
                <a class="btn btn-success btn-lg" href="RegistroEstudiante.jsp"><i class="fas fa-plus"></i> Agregar Nuevo</a>
            </div>
            <div class="text-light bg-info p-3 text-center">
                <h3><i class="fas fa-chart-bar"></i> Promedio del Grupo:</h3>
                <h3>${promedios}</h3>
            </div>

            <div class="text-light bg-primary p-3 text-center">
                <h3><i class="fas fa-users"></i> Total de Estudiantes:</h3>
                <h3>${estudiantes.size()}</h3>
            </div>


        </header>


        <div class="container-sm bg-dark text-light mt-5 p-3 ">
            <h2 class="text-center">Control de Estudiantes</h2>


            <table class="table table-striped">
                <thead>
                    <tr>
                        <th class="text-light">ID</th>
                        <th class="text-light">CC</th>
                        <th class="text-light">Nombre</th>
                        <th class="text-light">Apellido</th>
                        <th class="text-light">Email</th>
                        <th class="text-light">Promedio</th>
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
                        alert("Error. Este Alumno esta relacionado con otra tabla.");
                    }
                </script>
                <% }%>
                <c:forEach var="estudiante" items="${estudiantes}">
                    <tr>
                        <td class="text-light">${estudiante.id}</td>
                        <td class="text-light">${estudiante.cc}</td>
                        <td class="text-light">${estudiante.nombre}</td>
                        <td class="text-light">${estudiante.apellido}</td>
                        <td class="text-light">${estudiante.email}</td>
                        <td class="text-light">${estudiante.promedio}</td>
                        <td class="text-light"> <a href="Estudiante_Controlador?action=editar&id=${estudiante.id}" class="btn btn-info"><i class="fas fa-edit"></i> Editar</a> </td>
                        <td class="text-light"> <a href="Estudiante_Controlador?action=eliminar&id=${estudiante.id}" class="btn btn-danger"><i class="fas fa-times"></i> Eliminar</a> </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>


        <jsp:include page="plantillas/fotter.jsp" />
    </body>
</html>
