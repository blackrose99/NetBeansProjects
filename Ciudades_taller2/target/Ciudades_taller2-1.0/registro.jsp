<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Formulario sin Bootstrap</title>
</head>
<body>
    <nav>
        <div>
            <a href="#"><h2>Ciudades</h2></a>
            <button type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span></span>
            </button>
            <div>
                <ul>
                    <li>
                        <a href="index.jsp"><i></i> Inicio</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <div>
        <a href="Ciudad_Controlador?action=admin"><i></i> Volver</a>

        <form action="Ciudad_Controlador" method="post">
            <div id="alerta-insertar" style="display:none;"></div>

            <input type="number" name="bandera" value="1" style="display: none;">

            <div>
                <label for="name">Nombre:</label>
                <input type="text" name="name" required>
            </div>

            <div>
                <label for="depto">Departamento:</label>
                <input type="text" name="depto" required>
            </div>

            <div>
                <label for="pais">País:</label>
                <input type="text" name="pais" required>
            </div>

            <div>
                <label for="area">Área:</label>
                <input type="number" step="any" name="area" required>
            </div>

            <div>
                <label for="poblacion">Población:</label>
                <input type="number" name="poblacion" required>
            </div>

            <div>
                <label for="latitud">Latitud:</label>
                <input type="number" step="any" name="latitud" required>
            </div>

            <div>
                <label for="longitud">Longitud:</label>
                <input type="number" step="any" name="longitud" required>
            </div>

            <button type="submit"><i></i> Insertar Datos</button>
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
