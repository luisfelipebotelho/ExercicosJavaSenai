package program;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Carro;
import entities.Moto;
import entities.Veiculo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		Veiculo veiculo = new Veiculo();
		Moto moto = new Moto();
		Carro carro = new Carro();
		
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		char opt;
		
		System.out.print("Deseja cadastrar um novo veículo?(s/n): ");
		opt = sc.next().charAt(0);
		
		while (Character.toLowerCase(opt) == 's') {
			
		System.out.print("Entre com a quantidade de pneus: ");
		veiculo.setQuantPneus(sc.nextInt());
		
		System.out.print("Entre com a potência do motor: ");
		veiculo.setMotor(sc.nextDouble());
		
		System.out.print("Entre com a quantidade de passageiros: ");
		veiculo.setQuantPassageiros(sc.nextInt());
		
		System.out.print("Entre com o tipo de combustível:(g/a/f) ");
		veiculo.setQuantPassageiros(sc.next().charAt(0));
			
		System.out.print("Dados do veículo cadastrado: \n");
		
		veiculos.add(veiculo);
			
		System.out.print("Deseja cadastrar um novo veículo?(s/n): ");
		opt = sc.next().charAt(0);
		
		}
		
		for(Veiculo listaVeiculos : veiculos) {
			System.out.println(listaVeiculos);
		}
		
		System.out.println("\nLista de cadastro finalizada!");

		sc.close();
	}

}
