<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Inicio extends CI_Controller {
	
	public function __construct(){
		parent::__construct();
		$this->load->model('PersonasModel');
		$this->load->model('UsuariosModel');
		$this->load->database();
		$validacion = $this->session->has_userdata("session-mvc");
		if ($validacion) {
			$session = $this->session->userdata("session-mvc");
			if ($session['tipo']=="ADMIN" && $session['estado']=="ACTIVO") {
				return false;
			}else{
				redirect('Login/cerrarSession','refresh');
				die();
			}
		}else{
			redirect('Login/cerrarSession','refresh');
		}
	}

	public function index(){
		$data['session'] = $this->session->userdata("session-mvc");
		$this->load->view('admin/inicio', $data);
	}

	public function openCreateUser(){
		$this->load->helper('form');
		$data['session'] = $this->session->userdata("session-mvc");
		$this->load->view('admin/crearUsuario', $data);
		
		if($this->input->server("REQUEST_METHOD")== "POST"){

		    //persona
            $datas["cedula"] = $this->input->post("cedula");
			$correo=  $this->input->post("correo");
			$doc =  $this->input->post("cedula");
            $datas["nombres"] = $this->input->post("nombre");
            $datas["apellidos"] = $this->input->post("apellido");
			$datas["direccion"] = $this->input->post("direccion");
			$datas["telefono"] = $this->input->post("telefono");
			$datas["foto"] = $this->input->post("foto");	
			$datas["email"] = $correo; 

			//usuarios
			$data1["tipo"] = $this->input->post("tipo");	
            $data1["email"] = $this->input->post("correo");
			$data1["estado"] = $this->input->post("estado");
			$contra= $this->input->post("contrasenia");
			$data1["password"] = md5($contra);
			$data1["cedula"]=$doc;
			
            $this->PersonasModel->insert($datas);
			$this->UsuariosModel->insert($data1);
		}
	}

	public function listUsers(){
		$data['session'] = $this->session->userdata("session-mvc");
		//$this->load->view('admin/verUsuarios', $data);
		//OBTENER PERSONAS
		$data['datos'] = $this->PersonasModel->obtener_datos(); 
        $this->load->view('admin/verUsuarios', $data); 

		//OBTENER USUARIO
		$datos1['datos1'] = $this->UsuariosModel->obtener_datos(); 
      // $this->load->view('admin/verUsuarios',  array('datos1' => $datos1)); 
	}

}

/* End of file Inicio.php */
/* Location: ./application/controllers/admin/Inicio.php */