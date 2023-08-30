<?php 
    header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
    header("Access-Control-Allow-Methods: GET, POST, OPTIONS");
    header("Access-Control-Allow-Headers: Content-Type");
    
    include 'Conexion.php';

    if (!empty($_POST['cedula']) and !empty($_POST['nombres']) and !empty($_POST['apellidos']) and !empty($_POST['telefono']) and !empty($_POST['direccion']) and !empty($_POST['email'])) {

        $documento = $_POST['cedula'];
        $nombres = $_POST['nombres'];
        $apellidos = $_POST['apellidos'];
        $telefono= $_POST['telefono'];
        $direccion= $_POST['direccion'];
        $email= $_POST['email'];

        $consulta = $base_de_datos->prepare("DELETE * FROM personas WHERE cedula=:doc");

        $consulta->bindParam(':doc', $documento);
        $consulta->bindParam(':nom', $nombres);
        $consulta->bindParam(':ape', $apellidos);
        $consulta->bindParam(':tel', $telefono);
        $consulta->bindParam(':dir', $direccion);
        $consulta->bindParam(':email', $email);
        
        $proceso = $consulta->execute();

        if( $proceso ){
            $respuesta['respuesta'] = [
                                        'status' => true,
                                        'mesagge' => "OK##Cliente##DELETE",
                                      ];
            echo json_encode($respuesta);
        }else{
            $respuesta['respuesta'] = [
                                        'status' => false,
                                        'mesagge' => "ERROR##Cliente##DELETE",
                                      ];
            echo json_encode($respuesta);
        }
        
    }else{
        $respuesta['respuesta'] = [
                                    'status' => false,
                                    'mesagge' => "ERROR##DATOS##POST",
                                  ];
        echo json_encode($respuesta);
    }
?>