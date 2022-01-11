package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.repository.EstudianteRepoImpl;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	EstudianteRepoImpl estudianteRepo;

	@Override
	public void calcularDeuda() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void guardarP(Estudiante estudiante) {
		// TODO Auto-generated method stub
		estudianteRepo.create(estudiante);
	}

	@Override
	public void buscarP(String cedula) {
		// TODO Auto-generated method stub
		estudianteRepo.read(cedula);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		estudianteRepo.update(estudiante);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		estudianteRepo.delete(cedula);
	}
	
	
}
