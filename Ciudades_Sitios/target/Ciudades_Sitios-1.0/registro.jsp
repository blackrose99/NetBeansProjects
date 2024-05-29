<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario con Bootstrap</title>
         
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="recursos/estilos.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
        
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container">
                <a class="navbar-brand" href="#"><h2>Ciudades</h2></a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="index.jsp"><i class="fas fa-home"></i> Inicio</a>


                    </ul>
                </div>
            </div>
        </nav>
        <div class="container">
            <a class="btn btn-back  mb-2" href="Ciudad_Controlador?action=admin"><i class="fas fa-arrow-left"></i> Volver</a>

            <form action="Ciudad_Controlador" method="post">
                <div id="alerta-insertar" class="alert alert-info" style="display:none;"></div>

                <input type="number" name="bandera" value="1" style="display: none;">

                <div class="mb-2">
                    <label for="name" class="form-label">Nombre:</label>
                    <input type="text" class="form-control" name="name" required>
                </div>

                <div class="mb-2">
                    <label for="depto" class="form-label">Departamento:</label>
                    <input type="text" class="form-control" name="depto" required>
                </div>

                <div class="mb-2">
                    <label for="pais" class="form-label">País:</label>
                    <input type="text" class="form-control" name="pais" required>
                </div>

                <div class="mb-2">
                    <label for="area" class="form-label">Área:</label>
                    <input type="number" step="any" class="form-control" name="area" required>
                </div>

                <div class="mb-2">
                    <label for="poblacion" class="form-label">Población:</label>
                    <input type="number" class="form-control" name="poblacion" required>
                </div>

                <div class="mb-2">
                    <label for="latitud" class="form-label">Latitud:</label>
                    <input type="number" step="any" class="form-control" name="latitud" required>
                </div>

                <div class="mb-3">
                    <label for="longitud" class="form-label">Longitud:</label>
                    <input type="number" step="any" class="form-control" name="longitud" required>
                </div>

                <button type="submit" class="btn btn-primary mb-5"><i class="fas fa-save me-2"></i> Insertar Datos</button>
            </form>
        </div>
 <script>
    var insercionMessage = "${requestScope.insertar}";
    if (insercionMessage) {
        var alertaInsertar = document.getElementById("alerta-insertar");
        alertaInsertar.textContent = insercionMessage;
        alertaInsertar.style.display = "block"; // Muestra la alerta
        
        // Establecer un temporizador para ocultar la alerta después de 2 segundos (2000 milisegundos)
        setTimeout(function() {
            alertaInsertar.style.display = "none"; // Oculta la alerta después de 2 segundos
        }, 2000); // 2000 milisegundos = 2 segundos
    }
</script>


    </body>
</html>
