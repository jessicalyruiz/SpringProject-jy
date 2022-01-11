package ec.edu.uce.repository;

import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.modelo.Paciente;

public interface IEstudianteRepo {

	public void create(Estudiante estudiante);//insertar
	public void read(String cedula); //buscar por cedula
	public void update(Estudiante estudiante); //actualizar
	public void delete(String cedula); //borrar
}
