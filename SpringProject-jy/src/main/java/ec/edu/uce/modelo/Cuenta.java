package ec.edu.uce.modelo;

import java.math.BigDecimal;

public class Cuenta {

	private String numero;
	private BigDecimal saldo; //para todo tipo monetario
	
	
	
	//setters y getters
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	
	
	
	
}
