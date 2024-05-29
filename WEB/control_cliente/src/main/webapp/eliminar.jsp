<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
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

        <% if (request.getAttribute("eliminacionExitosa") != null) {%>
        <script>
            var registrosEliminados = <%= request.getAttribute("eliminacionExitosa")%>;
            if (registrosEliminados > 0) {
                alert("Eliminación exitosa.");
            } else{
                alert("Error. No se puede eliminar.");
            }
        </script>
        <% }%>


        <div class="container-md">
            <h1 class="text-center mb-4">Eliminar Cliente</h1>
            <form action="ServletEliminarCliente" method="POST">
                <div class="mb-3">
                    <label for="id" class="form-label">ID:</label>
                    <input type="text" name="id" id="id" class="form-control" required>
                </div>

                <div class="text-center">
                    <input class="btn btn-danger" type="submit" value="Eliminar Cliente">
                </div>
            </form>
        </div>

    </body>
