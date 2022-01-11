package ec.edu.uce;



import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Cuenta;
import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.repository.PacienteRepoImpl;
import ec.edu.uce.service.EstudianteServiceImpl;
import ec.edu.uce.service.ICuentaService;
import ec.edu.uce.service.IEstudianteService;
import ec.edu.uce.service.IPacienteService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	//private IPacienteService pacienteService=new PacienteRepoImpl(); //no hacer
	private static final Logger LOG= (Logger) LoggerFactory.getLogger(DemoApplication.class);
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	IEstudianteService estudianteService;
	
	@Autowired
	ICuentaService cuentaService;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * // TODO Auto-generated method stub //implemento las clases de la logica
		 * 
		 * LOG.info("****Paciente"); Paciente miPaciente=new Paciente(); //lo tomo de mi
		 * pagina web miPaciente.setNombre("Jessi"); miPaciente.setApellido("Yanez");
		 * miPaciente.setEdad(29); this.pacienteService.guardarP(miPaciente);
		 * 
		 * LOG.info("****Estudiate"); Estudiante estudiante= new Estudiante();
		 * estudiante.setNombre("Andres"); estudiante.setApellido("Lincango");
		 * estudiante.setUniversidad("ruski"); estudianteService.guardarP(estudiante);
		 * LOG.info("est"+estudiante);
		 */
		
		Cuenta cuenta=new Cuenta();
		cuenta.setNumero("1234");
		cuenta.setSaldo(new BigDecimal("9000"));
		
		this.cuentaService.ingresarCuentaHabiente(cuenta);
		
		
		
	}

}
