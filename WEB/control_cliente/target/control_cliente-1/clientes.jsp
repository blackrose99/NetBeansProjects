<meta http-equiv="refresh" content="1.3 ;url=${pageContext.request.contextPath}/ServletControlador">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Control de Clientes</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous"><!-- comment -->
        <link rel="stylesheet" type="text/css" href="recursos/estilos.css"/>
    </head>
    <body class="uvh-100">
        <nav>
            <div class="logo">
                <img src="img/ruta_del_logo.png.png" alt="Logo" width="50" height="50">
            </div>
            <ul>
                <li><a href="index.jsp">Inicio</a></li>
                <li><a href="clientes.jsp">Listar Clientes</a></li>
                <li><a href="Formulario.jsp">Registrar Clientes</a></li>
                <li><a href="eliminar.jsp">Eliminar Clientes</a></li>
                <li><a href="actualizar.jsp">Actualizar Clientes</a></li>
            </ul>
        </nav>
        

        <div class="container-sm bg-dark text-primary mt-5 p-3 ">
            <h2 class="text-center">Control de Clientes</h2>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th class="text-light">ID</th>
                        <th class="text-light">Nombre</th>
                        <th class="text-light">Apellido</th>
                        <th class="text-light">Email</th>
                        <th class="text-light">Sueldo</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="cliente" items="${clientes}">
                        <tr>
                            <td class="text-light">${cliente.id}</td>
                            <td class="text-light">${cliente.nombre}</td>
                            <td class="text-light">${cliente.apellido}</td>
                            <td class="text-light">${cliente.email}</td>
                            <td class="text-light">${cliente.sueldo}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

        <br>

    </body>
</html>
