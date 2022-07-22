package aulas;

import java.util.Locale;
import java.util.Scanner;

public class atividadeparte4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		int item = 0;
		int qtd = 0;

		System.out.println("Escolha um item do menu: " + " 1 - Sanduiche natureba" + " 2 - Sanduba bomba"
				+ " 3 - Coxinha de jaca" + " 4 - Feijoada vegetariana");
		item = leia.nextInt();

		System.out.println("Escolha a quantidade: ");
		qtd = leia.nextInt();

		switch (item) {
		case 1:
			System.out.println("Você escolheu " + qtd + " Sanduiche Natureba");
			break;

		case 2:
			System.out.println("Você escolheu " + qtd + " Sanduiche Bomba");
			break;

		case 3:
			System.out.println("Você escolheu " + qtd + " Coxinha de Jaca");
			break;

		case 4:
			System.out.println("Você escolheu " + qtd + " Feijoada Vegetariana");
			break;

		default:
			System.out.println("Você não escolheu um item do cardápio!");
			break;

		}
		System.out.println("Seu pedido ficará pronto em breve! Obrigado e volte sempre!");

		leia.close();

	}

}
