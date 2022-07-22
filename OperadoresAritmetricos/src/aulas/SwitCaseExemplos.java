package aulas;

import java.util.Locale;
import java.util.Scanner;

public class SwitCaseExemplos {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Entre com um numero: ");
		int numero = leia.nextInt();

		switch (numero) {
		case 1:
			System.out.println("Voce digitou o numero 1");
			break;

		case 2:
			System.out.println("Voce digitou o numero 2");
			break;

		default:
			System.out.println("Voce digitou um numero maior que 2 ou vc digitou uma letra!");

			break;

		}
		System.out.println("Saiu do shitch case!");

		leia.close();
	}

}
