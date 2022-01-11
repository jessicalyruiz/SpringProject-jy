package ec.edu.uce.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Cuenta;
import ec.edu.uce.repository.CuentaCorrienteRepoImpl;
import ec.edu.uce.repository.ICuentaRepo;

@Service
public class CuentaServiceImpl implements ICuentaService{

	private static Logger LOG=LoggerFactory.getLogger(CuentaCorrienteRepoImpl.class);
	
	@Autowired
	@Qualifier("corriente") //para diferenciar entre dos implememtaciones 
	ICuentaRepo cuentaRepo;
	
	@Autowired
	@Qualifier("ahorros") //para diferenciar entre dos implememtaciones 
	ICuentaRepo cuentaRepoA;
	
	
	@Override
	public void ingresarCuentaHabiente(Cuenta cuenta) {
		// TODO Auto-generated method stub
		if(cuenta.getSaldo().intValue()>=500) {
			this.cuentaRepo.crear(cuenta);
		}else {
			cuentaRepoA.crear(cuenta);
		}
		
	}

}
