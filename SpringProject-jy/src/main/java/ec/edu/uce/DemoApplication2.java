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
	private IMatriculaSingletonService obj1;
	
//	@Autowired
//	private IMatriculaPrototypeService obj2;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication2.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("Impresion del valor del objeto");
		LOG.info(this.obj1.getCodigo());
	}

}
