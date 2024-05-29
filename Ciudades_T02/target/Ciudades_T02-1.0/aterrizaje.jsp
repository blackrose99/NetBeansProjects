<!DOCTYPE html>
<html>
<head>
  <title>B�squeda de Ciudades - Bienvenida</title>
  <!-- Enlaza los archivos de Bootstrap (ajusta las rutas seg�n tu estructura de carpetas) -->
  <link rel="stylesheet" href="ruta-a-tu-archivo/bootstrap.min.css">
  <link rel="stylesheet" href="ruta-a-tu-archivo/fontawesome.min.css"> <!-- Enlace a la biblioteca Font Awesome para iconos -->
  <script src="ruta-a-tu-archivo/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="recursos/estilos.css"/>

</head>
<body>

  <div class="container">
    <div class="row mt-5">
      <div class="col-md-6 offset-md-3">
          
        <h1 class="text-center">Bienvenidos</h1>
        <p class="text-center">Encuentra informaci�n sobre ciudades y sus sitios tur�sticos</p>
        <div class="container-sm bg-dark text-light mt-5 p-3 ">        
          <table class="table table-striped">
              <div class="input-group mb-3">
          <input type="text" class="form-control" placeholder="Buscar ciudad..." aria-label="Buscar ciudad" aria-describedby="btn-buscar">
          <div class="input-group-append">
            <button class="btn btn-primary" type="button" id="btn-buscar">Buscar</button>
          </div>
            <thead>
              <tr>
                <th class="text-light">ID</th>
                <th class="text-light">Nombre</th>
                <th class="text-light"></th>
              </tr>
            </thead>
            <tbody>
              <c:forEach var="ciudad" items="${ciudades}">
                <tr>
                  <td class="text-light">${ciudad.id}</td>
                  <td class="text-light">${ciudad.name}</td>
                  <td class="text-light"> <a href="Ciudad_Controlador?action=editar&id=${ciudad.id}" class="btn btn-info"><i class="fas fa-edit"></i> Ver</a> </td>
                </tr>
              </c:forEach>
            </tbody>
          </table>
        </div>
        
        </div>
        
        <h4>�C�mo funciona?</h4>
        <p>Ingresa el nombre de una ciudad en la barra de b�squeda para encontrar informaci�n sobre sus sitios tur�sticos.</p>
        
        <h4>Creadores:</h4>
        <ul>
          <li>Manuel Casta�o</li>
          <li>Yeison Duarte</li>
        </ul>
      </div>
    </div>
  </div>
</body>
</html>
