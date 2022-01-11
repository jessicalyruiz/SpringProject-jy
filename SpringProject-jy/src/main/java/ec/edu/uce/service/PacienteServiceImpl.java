package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.repository.IPacienteRepo;
import ec.edu.uce.repository.PacienteRepoImpl;

@Service
public class PacienteServiceImpl implements IPacienteService{

	//private PacienteRepoImpl paciente=new PacienteRepoImpl() ; /// esto debo delegarle al contenedor para que lo instancie y asi desacoplar el codigo
	//declaro la interfaz de la interfaz de la clase que quiero instanciar
	@Autowired
	private IPacienteRepo pacienteRepo;
	//la clase que vamos a "instanciar" la debo marcarla con anotaciones
	
	@Override
	public void calcularDeuda() {
		// traer de la base la deuda
		//multiplicarla por el 12%
		//calcular la multa
		//*********toda la logica
		
	}

	@Override
	public void guardarP(Paciente paciente) {
		// TODO Auto-generated method stub
		pacienteRepo.create(paciente);
	}

	@Override
	public void buscarP(String cedula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		
	}

}
