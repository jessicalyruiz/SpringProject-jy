package ec.edu.uce; //debe hacer match con el paquete del que queremos inyectar



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
import ec.edu.uce.service.scope.IMatriculaPrototypeService;
import ec.edu.uce.service.scope.IMatriculaSingletonService;

@SpringBootApplication//(scanBasePackages={"jy.com.ec.edu.service.scope", "jy.com.ec.edu.service.scope.IMatriculaSingletonService"})
//@ComponentScan ({"jy.com.ec.edu.service.scope", "jy.com.ec.edu.service.scope.IMatriculaSingletonService"})
public class DemoApplication2 implements CommandLineRunner {

	//private IPacienteService pacienteService=new PacienteRepoImpl(); //no hacer
	private static final Logger LOG= (Logger) LoggerFactory.getLogger(DemoApplication2.class);
	@Autowired
	private IMatriculaSingletonService objeto1;
	@Autowired
	private IMatriculaSingletonService objeto2;
	@Autowired
	private IMatriculaSingletonService objeto3;
	
	@Autowired
	private IMatriculaPrototypeService pro1;
	
	@Autowired
	private IMatriculaPrototypeService pro2;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication2.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("Impresion valor del objeto");
    	this.objeto1.establecerValor("Edison");
    	LOG.info(this.objeto1.obtenerCodigo());
    	
    	LOG.info("Objeto 2");
    	LOG.info(this.objeto2.obtenerCodigo());
    	
    	LOG.info("Objeto 3");
    	LOG.info(this.objeto3.obtenerCodigo());
    	
    	LOG.info("Objeto 1 Nuevo");
    	LOG.info(this.objeto3.establecerValor("Pepe"));
    	
    	LOG.info("******** Prototype *********");
    	this.pro1.establecerNombre("Juanito");
    	LOG.info(this.pro1.obtenerNombre());
    	
    	LOG.info("Pro 2");
    	this.pro2.establecerNombre("Maria");
    	LOG.info(this.pro2.obtenerNombre());
    	
    	LOG.info(this.pro1.obtenerNombre());
	}

}
