package aulas;

import java.util.Locale;
import java.util.Scanner;

public class IdadeAlturaParte2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int[] idades = new int[2];
		int[] alturas = new int[2];

		for (int i = 0; i < idades.length; i++) {

			System.out.println("Entre com a idade: ");
			idades[i] = sc.nextInt();

			System.out.println("Entre com a altura em centímetros: ");
			alturas[i] = sc.nextInt();
		}

		for (int idade : idades) {
			System.out.println("idade " + idade + " anos");

		}

		for (int altura : alturas) {
			System.out.println("altura " + altura + " cm");

		}

		sc.close();

	}

}
