package ec.edu.uce.service.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON) //se va a crear un solo objeto, no importa cuanmtas referencias tenga
public class MatriculaSingletonServiceImpl implements IMatriculaSingletonService{

	private String codigo;
	
	@Override
	public String obtenerDato(String valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCodigo() {
		// TODO Auto-generated method stub
		return this.codigo;
	}

}
