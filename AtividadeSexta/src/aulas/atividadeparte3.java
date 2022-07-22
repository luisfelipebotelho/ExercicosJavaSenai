package aulas;

import java.util.Locale;
import java.util.Scanner;

public class atividadeparte3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		int numero = 0;

		System.out.println("Escolha um número de 1 a 7: ");
		numero = leia.nextInt();

		switch (numero) {

		case 1:
			System.out.println("Você escolheu o Domingão!");
			break;

		case 2:
			System.out.println("Você escolheu a Segunda-Feira");
			break;

		case 3:
			System.out.println("Você escolheu a Terça-Feira");
			break;

		case 4:
			System.out.println("Você escolheu a Quarta-Feira");
			break;

		case 5:
			System.out.println("Você escolheu a Quinta-Feira");
			break;

		case 6:
			System.out.println("Você escolheu a Sexta-Feira, Sextoooou!!!");
			break;
		case 7:
			System.out.println("Você escolheu o Sabadão!");
			break;

		default:
			System.out.println("Você não escolheu um número entre 1 e 7!");

		}

		leia.close();

	}

}
