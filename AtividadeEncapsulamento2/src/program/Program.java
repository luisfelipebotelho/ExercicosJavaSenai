package program;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.AnoException;
import entities.Carro;
import entities.Clientes;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		try {
		
		Carro carro = new Carro();
		
		Clientes cliente = new Clientes();
		
		System.out.print("Entre com o seu nome: ");
		cliente.setNome(sc.nextLine());		
		
		System.out.print("Entre com o ano do carro: ");	
		carro.setAno(sc.nextInt());
		
		sc.nextLine();
		System.out.print("Entre com o modelo do carro: ");
		carro.setModelo(sc.nextLine());
		
		System.out.print("Entre com a cor do carro: ");
		carro.setCor(sc.nextLine());
		
		System.out.print("Entre com o tipo do carro (hatch, sedan, suv): ");
		carro.setTipo(sc.nextLine());
		
		System.out.print("Entre com o tipo de cambio: ");
		carro.setCambio(sc.nextLine());
		
		System.out.print("Entre com o tipo de combustivel: ");
		carro.setTipoCombustivel(sc.nextLine());
		
		System.out.print("Entre com o valor: ");
		carro.setValor(sc.nextInt());
		
		sc.nextLine();
		System.out.print("Entre com o tipo de uso (usado, novo): ");
		carro.setUso(sc.nextLine());
		
		carro.setDono(cliente);
		
		System.out.print("\n-----CARRO VENDIDO-----");
		System.out.println("\nAno do carro: " + carro.getAno());
		System.out.println(" Modelo: " + carro.getModelo());
		System.out.println("Cor: " + carro.getCor());
		System.out.println("Tipo: " + carro.getTipo());
		System.out.println("Transmissão: "+ carro.getCambio());
		System.out.println("Combustivel: " + carro.getTipoCombustivel());
		System.out.println("Valor: R$ " + carro.getValor());
		System.out.println("Tempo de uso: " +carro.getUso());
		System.out.println("Cliente: " + carro.getDono().getNome());
		
		} catch (AnoException a) {
			System.out.println("Erro: " + a.getMessage());
		} catch (InputMismatchException e3) {
			System.out.println("Tipo incompativel, você digitou um caractere incorreto!");
		}
		sc.close();
		
	}

}
