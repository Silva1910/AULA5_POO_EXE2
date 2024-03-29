package model;

public class Conta {
	private int agencia;
	private int codigo;
	private int saldo;
	private float limite;

	public Conta() {

	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public float deposito(float valor) {
		saldo = (int) (valor + getSaldo());
		return saldo;
	}

	public float saque(float valor) throws ArithmeticException {

		if (valor > (getSaldo() + limite)) {
			throw new ArithmeticException(
					" o valor e maior que o saldo e limite o valor  na conta e " 
							+ getSaldo() + "$"); 
		} else {

			saldo = (int) (getSaldo() - valor);
			return saldo;
		}
	}

}
