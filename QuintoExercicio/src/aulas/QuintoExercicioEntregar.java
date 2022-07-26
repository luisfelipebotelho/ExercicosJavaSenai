package aulas;

import java.util.Locale;
import java.util.Scanner;

public class QuintoExercicioEntregar {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		int i = 0;

		System.out.println("Entre com uma nota de 0 a 10: ");
		i = leia.nextInt();

		while (i < 0 || i > 10) {
			System.out.println("\nNota inválida! \n");
			System.out.println("Entre com uma nota entre 0 a 10: ");
			i = leia.nextInt();

		}
		System.out.println("\nA nota digitada foi: " + i);

		leia.close();

	}

}
