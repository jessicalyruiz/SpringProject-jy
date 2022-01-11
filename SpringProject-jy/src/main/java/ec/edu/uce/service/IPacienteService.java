package ec.edu.uce.service;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteService {

	public void calcularDeuda();
	public void guardarP(Paciente paciente);//insertar
	public void buscarP(String cedula); //buscar por cedula
	public void actualizar(Paciente paciente); //actualizar
	public void borrar(String cedula); //borrar
}
