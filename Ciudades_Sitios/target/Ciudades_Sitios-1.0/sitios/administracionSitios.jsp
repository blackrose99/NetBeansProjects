


<%@page import="Modelo.SitiosTuristicos"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Ciudad"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administracion de Sitios</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
        <link rel="stylesheet" type="text/css" href="recursos/estilos.css"/>

        <script>

            function doSearch() {
                var tableReg = document.getElementById('datos');
                var searchText = document.getElementById('buscar').value.toLowerCase();
                var cellsOfRow = "";
                var found = false;
                var compareWith = "";

                //Recorremos todas las filas con contenido en las tablas 
                for (var i = 1; i < tableReg.rows.length; i++) {
                    cellsOfRow = tableReg.rows[i].getElementsByTagName('td');
                    found = false;
                    //recorremos todas la celdas
                    for (var j = 0; j < cellsOfRow.length && !found; j++) {
                        compareWith = cellsOfRow[j].innerHTML.toLowerCase();

                        //Buscamos el texto en el contenido de la celda
                        if (searchText.length == 0 || (compareWith.indexOf(searchText) > -1)) {
                            found = true;
                        }
                    }
                    if (found) {
                        tableReg.rows[i].style.display = '';
                    } else {
                        tableReg.rows[i].style.display = 'none';
                      }
                    }  
            }
        </script>
    </head>
    <%
        int id_ciudad = Integer.parseInt(request.getParameter("id"));
        Ciudad ciu = (Ciudad) request.getAttribute("ciuadades");
        List<SitiosTuristicos> sitios = (List<SitiosTuristicos>) request.getAttribute("sitios");

    %>
    <body>


    <div class="d-flex justify-content-center mb-3">
        <div>
            <h2 class="text-center">Ciudad ${ciuadades.name} ${ciuadades.pais}</h2>
        </div>
    </div>
    <header class="container mt-1 d-flex justify-content-between">
        <a class="btn btn-back mt-1 mb-4" href="Ciudad_Controlador?action=editar&id=<%=id_ciudad%>"><i class="fas fa-arrow-left"></i> Volver</a>
        <div class="text-light p-3 text-center">

            <a class="btn btn-success btn-lg" href="Sitios_Controlador?action=ver&id=<%=id_ciudad%>"><i class="fas fa-plus"></i> Agregar Nuevos Sitios</a>
        </div>
        <div class="text-light p-3 text-center">
            <a class="btn btn-danger btn-lg" href="Sitios_Controlador?action=eliminar2&id=<%=id_ciudad%>">- Eliminar Todo</a>
        </div>
    </header>
    <div class="col-lg-6 offset-lg-3 ">
        <div class="col-lg-9 col-md-4 col-sm-12 offset-sm-1 col-12 mt-4">

            <div class="input-group mb-4">                        
                <input id="buscar" type="text" class="form-control" placeholder="Buscar ciudad..." onkeyup="doSearch()">
            </div>

            <div class="container mt-5">

                <div class="alert alert-danger text-center" id="alerta" style="display: none;">
                    <p>${requestScope.eliminacion}</p>
                </div>
            </div>

            <div class="row mt-3 mb-5">
                <table id="datos" class="table table-striped">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombre</th>
                            <th>Dirección del Sitio</th>
                            <th>Descripción</th>
                            <th>Precio</th>
                            <th>Hora Inicio</th>
                            <th>Hora Cierre</th>
                            <th>____________</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="sitio" items="${sitios}">
                            <tr>
                                <td>${sitio.id}</td>
                                <td>${sitio.name}</td>
                                <td>${sitio.direccion}</td>
                                <td>${sitio.descripcion}</td>
                                <td>${sitio.precio}</td>
                                <td>${sitio.hora_inicio}</td>
                                <td>${sitio.hora_fin}</td>
                                <td><a href="Sitios_Controlador?action=eliminar&id=${sitio.id}&id2=<%=id_ciudad%>" class="btn btn-danger"><i class="fas fa-timese"></i>Eliminar</a></td>

                            </tr>
                        </c:forEach>
                    </tbody>

                </table>
            </div>
            <script>
                var eliminacionMessage = "${requestScope.eliminacion}";
                if (eliminacionMessage) {
                    var alerta = document.getElementById("alerta");
                    alerta.style.display = "block";
                }
            </script>
            </body>


            </html>
