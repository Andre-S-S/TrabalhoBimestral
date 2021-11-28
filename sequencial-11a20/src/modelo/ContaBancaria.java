package modelo;

/** 11-  Crie uma classe abstrata Conta Bancaria que cont�m como atributos o numero da conta e o saldo, 
 * e como m�todos abstratos sacar e depositar que recebem um par�metro do tipo double 
 */

public abstract class ContaBancaria {
	private int numeroDeConta;
	private double saldo;

	/**
	 * Metodo reponsavel por efectuar o levantamento numa conta
	 * 
	 * @param valor
	 *            valor a ser levantado
	 */
	public abstract void sacar(double valor);

	/**
	 * Metodo responsavel pelo deposito de valores numa conta
	 * 
	 * @param valor
	 *            valor a ser depositado
	 */
	public abstract void depositar(double valor);

	public int getNumeroDeConta() {
		return numeroDeConta;
	}

	public void setNumeroDeConta(int numeroDeConta) {
		this.numeroDeConta = numeroDeConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * 
	 * 17- Incremente a classe Conta Bancaria com o m�todo transferir que recebe o par�metro 
	 * o valor (double) e um objeto conta banc�ria e transfere o valor desejado da conta 
	 * atual para cada conta informada. Use os m�todos sacar e depositar para isso. 

	 * @param valor
	 * @param conta
	 */
	public void transferir(double valor, ContaBancaria conta) {
		if (this instanceof ContaCorrente) {
			ContaCorrente cc = ((ContaCorrente) this);
			boolean condicao = (this.getSaldo() - valor - cc.getTaxaDeOperacao()) > 0;
			if (condicao) {
				cc.sacar(valor);
				conta.depositar(valor);
			}
		} else {
			ContaPoupanca cp = ((ContaPoupanca) this);
			boolean condicao = (cp.getSaldo() - valor) >= cp.getLimite();
			if (condicao) {
				cp.sacar(valor);
				conta.depositar(valor);
			}
		}

	}

}
