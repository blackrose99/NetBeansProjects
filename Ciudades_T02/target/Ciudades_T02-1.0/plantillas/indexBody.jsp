
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="recursos/estilos.css" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"
              integrity="sha512-...tu-codigo-de-integridad..." crossorigin="anonymous" />
        <style>
            @import url('https://fonts.googleapis.com/css2?family=EB+Garamond&display=swap');
        </style>
    </head>
    <body>
        <div class="container p-3">
            <header>
               <h1 class="text-center text-light" style="font-family: 'EB Garamond', serif; font-weight: bold; font-size: 60px;">Gestión Académica</h1>
              <p class="text-center text-light" style="font-size: 25px; font-family: 'EB Garamond', serif;">Bienvenido a nuestra plataforma de gestión académica. Aquí podrás realizar diversas tareas relacionadas con la administración de estudiantes, asignaturas y matriculaciones.</p>
            </header>
            <div class="row p-3">
                <div class="col-md-4">
                    <div class="text-light bg-primary p-3 text-center mt-3">
                        <h1><i class="fas fa-users"></i></h1>
                    </div>
                    <div class="card">
                        <div class="card-body text-center">
                            <h2 class="card-title"><i class="fas fa-users"></i> Estudiantes</h2>
                            <p class="card-text">Administra la información de los estudiantes, como sus datos personales, notas y
                                asistencias.</p>
                            <a href="Estudiante_Controlador?action=inicio" class="btn btn-primary"><i class="fas fa-eye"></i> Ver Estudiantes</a>
                        </div>
                    </div>

                </div>

                <div class="col-md-4">

                    <div class="text-light bg-primary p-3 text-center mt-3">
                        <h1><i class="fas fa-book"></i> </h1>
                    </div>
                    <div class="card">
                        <div class="card-body text-center">                         
                            <h2 class="card-title"><i class="fas fa-book"></i> Asignaturas</h2>
                            <p class="card-text">Gestiona las asignaturas ofrecidas, sus Codigos, Creditos y otros detalles
                                relevantes.</p>
                            <a href="Asignatura_Controlador?action=inicio" class="btn btn-primary"><i class="fas fa-eye"></i> Ver Asignaturas</a>
                        </div>
                    </div>

                </div>
                <div class="col-md-4">
                    <div class="text-light bg-primary p-3 text-center mt-3">
                        <h1><i class="fas fa-clipboard-check"></i></h1>
                    </div>
                    <div class="card">
                        <div class="card-body text-center">
                            <h2 class="card-title"><i class="fas fa-graduation-cap"></i> Matriculaciones</h2>
                            <p class="card-text te">Realiza el proceso de matriculación de los estudiantes en las asignaturas
                                disponibles.</p>
                            <a href="Matricula_Controlador?action=inicio" class="btn btn-primary "><i class="fas fa-eye"></i> Ver Matriculaciones</a>
                        </div>
                    </div>

                </div>
            </div>



        </div>
    </body>
</html>
