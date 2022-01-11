package ec.edu.uce.repository;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ch.qos.logback.classic.Logger;
import ec.edu.uce.modelo.Paciente;
@Repository //destinado para acceder a datos
public class PacienteRepoImpl implements IPacienteRepo{

	private static final Logger LOG=(Logger) LoggerFactory.getLogger(PacienteRepoImpl.class);
	
	@Override
	public void create(Paciente paciente) {
		//System.out.println("Se guardo en la base el paciente "+ paciente);
		LOG.info("Se guardo en la base el paciente "+ paciente);
	}

	@Override
	public void read(String cedula) {
		//System.out.println("buscando al paciente con cedula "+cedula);
	}

	@Override
	public void update(Paciente paciente) {
		System.out.println("Actualizando a paciente" + paciente);
	}

	@Override
	public void delete(String cedula) {
		System.out.println("borrando al paciente con cedula "+cedula);
	}

}
