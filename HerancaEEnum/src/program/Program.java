package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import entities.ContaCorrente;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		//Cliente cliente = new Cliente();
		Conta contaCorrente = new ContaCorrente();
		Conta conta = new Conta();
		
		conta.Depositar(100);
		contaCorrente.Depositar(200);
		
		conta.Sacar(50);
		contaCorrente.Sacar(50);
		
		System.out.println("saldo conta: " + conta.getSaldo());
		System.out.println("Sando conta corrente: " + contaCorrente.getSaldo());
		
		/*
		System.out.print("Entre com o nome do titular da conta: ");
		cliente.setNome(sc.nextLine());
		
		System.out.print("Entre com o cpf do titular: ");
		cliente.setCpf(sc.nextLine());
		
		contaCorrente.setTitular(cliente);
		
		System.out.print("Entre com o numero da agencia: ");
		contaCorrente.setAgencia(sc.nextInt());
		
		System.out.print("Entre com o numero da conta: ");
		contaCorrente.setNumeroConta(sc.nextInt());

		System.out.println("Digite um valor para deposito: ");
		contaCorrente.Depositar(sc.nextDouble()); 
		
		System.out.println("Conta criada!");
		
		System.out.println(contaCorrente);
		
		System.out.print("\nEntre com o valor do saque: ");
		
		contaCorrente.Sacar(sc.nextDouble());
		
		System.out.println("Saldo atualizado: ");
		
		System.out.println(contaCorrente);
		*/
		
		sc.close();
		
	}

}
