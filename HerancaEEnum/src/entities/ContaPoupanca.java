package entities;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca() {
				
	}
	
	public ContaPoupanca (int numeroConta, int agencia, double saldo, Cliente Titular) {
		super(numeroConta, agencia, saldo, Titular);
	}

	@Override
	public boolean Sacar(double valor) {
		if(valor <= this.saldo) {
			saldo -= valor + 1.0;
			return true;
		} else {
			return false;
		}
	}

	
}
