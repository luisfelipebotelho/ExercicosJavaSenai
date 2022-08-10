package entities;

public class Conta {

	private int numeroConta;
	private int agencia;
	protected double saldo;
	private Cliente Titular;
	
	public Conta() {		
	}
	
	public Conta(int numeroConta, int agencia, double saldo, Cliente Titular) {
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.Titular = Titular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return Titular;
	}

	public void setTitular(Cliente titular) {
		Titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean Sacar(double valor) {
		if (valor <= this.saldo) {
			saldo -= valor + 2.0;
			return true;

		} else {
			return false;
		}

	}

	public void Depositar(double valor) {
		this.saldo += valor;
	}
	
	@Override
	public String toString() {
		return "\nTitular da conta : " + Titular.getNome() + "\nCPF: " + Titular.getCpf()
			+ "\nAgencia: " + agencia 
			+ "\nNumero da conta: " + numeroConta
			+ "\nSaldo: " + saldo;
			
				}
	
}
