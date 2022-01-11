package ec.edu.uce.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


import ec.edu.uce.modelo.Estudiante;

@Repository
public class EstudianteRepoImpl implements IEstudianteRepo{

	private static final Logger LOG=(Logger) LoggerFactory.getLogger(PacienteRepoImpl.class);

	@Override
	public void create(Estudiante estudiante) {
		LOG.info("se ha guardado el "+ estudiante);
	}

	@Override
	public void read(String cedula) {
		// TODO Auto-generated method stub
		LOG.info("buscando estudiante con cedula "+ cedula);
	}

	@Override
	public void update(Estudiante estudiante) {
		// TODO Auto-generated method stub
		LOG.info("se ha actualizado el "+ estudiante);
	}

	@Override
	public void delete(String cedula) {
		// TODO Auto-generated method stub
		LOG.info("se ha eliminado el estudiante con cedula "+ cedula);
	}
	
}
