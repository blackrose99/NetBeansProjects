<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Matricula</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
              rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
              crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="recursos/estilos.css"/>
    </head>
    <body class="uvh-100">
        <jsp:include page="plantillas/navegacion.jsp" />

        <% if (request.getAttribute("registroExitoso") != null) {%>
        <script>
            var registrosInsertados = <%= request.getAttribute("registroExitoso")%>;
            if (registrosInsertados > 0) {
                alert("Registro exitoso.");
            } else {
                alert("Error, no se puede registrar.");
            }
        </script>
        <% }%>

     <div class="container-md p-3">
    <h1 class="text-center">Matriculas Estudiantes</h1>
    <form action="Matricula_Controlador" method="post">
        <div class="row">
            <div class="col"></div>
            <div class="col-lg-15 m-2 text-center">
                <label><i class="bi bi-person-fill"></i> Seleccionar Alumno</label>
            </div>
            <div class="col-lg-15 m-2">
                <select name="cmbAlumno" class="form-select">
                    <option value="">---Seleccione---</option>
                    <c:forEach items="${estudiantes}" var="estudiante">
                        <c:choose>
                            <c:when test="${matriculas.estudiante.id == estudiante.id}">
                                <option value="${estudiante.id}" selected>
                                    ${estudiante.id} ${estudiante.cc} ${estudiante.nombre} ${estudiante.apellido}
                                </option>
                            </c:when>
                            <c:otherwise>
                                <option value="${estudiante.id}">
                                    ${estudiante.id} ${estudiante.cc} ${estudiante.nombre} ${estudiante.apellido}
                                </option>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="row">
            <div class="col"></div>
            <div class="col-lg-15 m-2 text-center">
                <label><i class="bi bi-book-fill"></i> Seleccionar Asignatura</label>
            </div>
            <div class="col-lg-15 m-2">
                <select name="cmbAsignatura" class="form-select">
                    <option value="">---Seleccione---</option>
                    <c:forEach var="asignatura" items="${asignaturas}">
                        <c:choose>
                            <c:when test="${matriculas.asignatura.id == asignatura.id}">
                                <option value="${asignatura.id}" selected>
                                    ${asignatura.id} ${asignatura.codigo} ${asignatura.nombre}
                                </option>
                            </c:when>
                            <c:otherwise>
                                <option value="${asignatura.id}">
                                    ${asignatura.id} ${asignatura.codigo} ${asignatura.nombre}
                                </option>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                </select>
            </div>
        </div>
        <br>
        <input type="hidden" name="id" value="${matriculas.id}">
        <div class="row justify-content-center">
            <div class="col-auto">
                <button type="submit" class="btn btn-primary" onclick="return validarSeleccion()">
                    <i class="bi bi-check-circle-fill"></i> Enviar
                </button>
            </div>
        </div>
    </form>
</div>



        <script>
            function validarSeleccion() {
                var cmbAlumno = document.getElementsByName("cmbAlumno")[0];
                var cmbAsignatura = document.getElementsByName("cmbAsignatura")[0];

                if (cmbAlumno.value === "" || cmbAsignatura.value === "") {
                    alert("Por favor, seleccione una opción en ambos campos.");
                    return false;
                }

                return true;
            }
        </script>

        <br>
        <br>
    </body>

    <jsp:include page="plantillas/fotter.jsp" />
</html>
