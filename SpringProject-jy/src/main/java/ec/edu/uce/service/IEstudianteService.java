package ec.edu.uce.service;

import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.modelo.Paciente;

public interface IEstudianteService {

	public void calcularDeuda();
	public void guardarP(Estudiante estudiante);//insertar
	public void buscarP(String cedula); //buscar por cedula
	public void actualizar(Estudiante estudiante); //actualizar
	public void borrar(String cedula); //borrar
}
