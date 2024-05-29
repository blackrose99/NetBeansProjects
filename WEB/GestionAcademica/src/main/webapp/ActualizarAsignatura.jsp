
<%@page import="dominio.Asignaturas"%>
<%@page import="java.util.List"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="recursos/estilos.css"/>

    </head>

    <body class="uvh-100">
        <section>
            <jsp:include page="plantillas/navegacion.jsp" />

            <% if (request.getAttribute("registroExitoso") != null) {%>
            <script>
            var registrosInsertados = <%= request.getAttribute("registroExitoso")%>;
            if (registrosInsertados > 0) {
                alert("Modificacion Exitosa");
            } else {
                alert("Error,No Se puede Modificar.");
            }
            </script>
            <% }%>


            <%
                Asignaturas asignatura = (Asignaturas) request.getAttribute("asignatura");
            %>

            <div class="container-md">
                <h1 class="text-center mb-4">Actualizar Asignaturas</h1>

                <form action="Asignatura_Controlador" method="POST">
                     <input type="number" name="bandera" value="1" style="display: none;">
                     <input type="number" name="id" value="<%=asignatura.getId()%>" style="display: none;">
                    <div class="mb-3">
                        <label for="codigo" class="form-label"><i class="fas fa-code"></i> Codigo</label>
                        <input type="text" name="codigo" id="codigo" class="form-control" required value="<%= asignatura.getCodigo()%>">
                    </div>
                    <div class="mb-3">
                        <label for="nombre" class="form-label"><i class="fas fa-book"></i> Nombre:</label>
                        <input type="text" name="nombre" id="nombre" class="form-control" required value="<%= asignatura.getNombre()%>">
                    </div>
                    <div class="mb-3">
                        <label for="creditos" class="form-label"><i class="fas fa-graduation-cap"></i> Creditos</label>
                        <input type="number" name="creditos" id="creditos" class="form-control" required value="<%= asignatura.getCreditos()%>">
                    </div>

                    <div class="text-center">
                        <input class="btn btn-primary" type="submit" value="Actualizar">
                    </div>
                </form>
            </div>


        </section>
                <jsp:include page="plantillas/fotter.jsp" />
    </body>
</html>