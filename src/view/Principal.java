package view;

import model.Conta;

public class Principal {

	public static void main(String[] args) {
		Conta c = new Conta();

		c.setAgencia(10);
		c.setCodigo(1);
		c.setLimite(10);
		c.setSaldo(10);
		c.saque(50f);
	}

}
