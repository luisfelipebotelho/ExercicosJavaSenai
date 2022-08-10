package entities;

public class ContaCorrente extends Conta{
	
	public ContaCorrente() {
		
	}
		
	public ContaCorrente(int numeroConta, int agencia, double saldo, Cliente Titular) {
		super(numeroConta, agencia, saldo, Titular);
	}
	@Override
	public boolean Sacar(double valor) {
		if (valor <= this.saldo) {
			saldo -= valor + 4.90;
			return true;

		} else {
			return false;	
		}

	}	
	
}
