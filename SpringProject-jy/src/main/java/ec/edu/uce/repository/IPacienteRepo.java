package ec.edu.uce.repository;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Paciente;

//en este paquete  contiene as clases para acceso a datos

public interface IPacienteRepo {
	//debe tener al menos los metodos CRUD
	
	public void create(Paciente paciente);//insertar
	public void read(String cedula); //buscar por cedula
	public void update(Paciente paciente); //actualizar
	public void delete(String cedula); //borrar
	

}
