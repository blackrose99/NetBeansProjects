<%-- 
    Document   : editarCliente
    Created on : 27/05/2023, 09:35:43 PM
    Author     : H4RX0RLAND
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/a970bc1c22.js" crossorigin="anonymous"></script>
        <title>Editar Cliente</title>
    </head>
    <body>

        <!--cabecero-->
        <jsp:include page="/WEB-INF/paginas/comunes/cabecero.jsp"/>


        <form action="${pageContext.request.contextPath}/ServletControlador?accion=modificar&idCliente=${cliente.idCliente}"
              method="POST" class="was-validated">

            <!--botones de navegacion-->
            <jsp:include page="/WEB-INF/paginas/comunes/botonesNavegacionEdicion.jsp"/>

            <section id="details">
                <div class="container">
                    <div class="row">
                        <div class="col">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Editar Cliente</h4>
                                </div>
                                <div class="card-body">
                                    
                                    <div class="form-group">

                                        <label form="nombre">Nombre</label>
                                        <input type="text" class="form-control" name="nombre" required value="${cliente.nombre}">
                                    </div>

                                    <div class="form-group">

                                        <label form="apellido">Apellido</label>
                                        <input type="text" class="form-control" name="apellido"required value="${cliente.apellido}">
                                    </div>
                                    <div class="form-group">

                                        <label form="email">Email</label>
                                        <input type="email" class="form-control" name="email"required value="${cliente.email}">
                                    </div>
                                    <div class="form-group">

                                        <label form="telefono">Telefono</label>
                                        <input type="tel" class="form-control" name="telefono"required value="${cliente.telefono}">
                                    </div>

                                    <div class="form-group">

                                        <label form="saldo">Saldo</label>
                                        <input type="number" class="form-control" name="saldo"required value="${cliente.saldo}"step="any">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>

        </form>

        <!--pie de pagina-->
        <jsp:include page="/WEB-INF/paginas/comunes/piedePagina.jsp"/>

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>