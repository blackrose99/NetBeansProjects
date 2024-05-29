
<%@page import="Modelo.Ciudad"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Registrar Sitios</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="recursos/estilos.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
   
         </head>
    <body>
        <%
            int id_ciudad = Integer.parseInt(request.getParameter("id"));
            
        %>
        <div class="container mt-5">
            <h2>Formulario de Sitios Turísticos</h2>
                        <a class="btn btn-back mt-3 mb-3" href="Ciudad_Controlador?action=ver2&id=<%=id_ciudad%>"><i class="fas fa-arrow-left"></i> Volver</a>
            <form action="Sitios_Controlador" method="post">

                <input type="number" name="bandera" value="1" style="display: none;">

                <div class="mb-2">
                    <label for="name" class="form-label">Nombre:</label>
                    <input type="text" class="form-control" name="name" required>
                </div>

                <div class="mb-2">
                    <label for="direccion" class="form-label">Dirección:</label>
                    <input type="text" class="form-control" name="direccion" required>
                </div>

                <div class="mb-2">
                    <label for="descripcion" class="form-label">Descripción:</label>
                    <textarea class="form-control" name="descripcion" rows="4" required></textarea>
                </div>
                <div class="mb-3">
                    <label for="precio" class="form-label">Precio:</label>
                    <input type="number" step="any" class="form-control" name="precio" required>
                </div>

                <div class="mb-2">
                    <label for="hora_inicio" class="form-label">Hora de Inicio:</label>
                    <input type="time" class="form-control" name="hora_inicio" required>
                </div>

                <div class="mb-3">
                    <label for="hora_fin" class="form-label">Hora de Fin:</label>
                    <input type="time" class="form-control" name="hora_fin" required>
                </div>
                <input type="number" name="id" value="<%=id_ciudad%>" style="display: none;">



                <button  type="submit" class="btn btn-primary mb-4">Insertar Sitio Turístico</button>
            </form>
        </div>
    </body>
</html>
