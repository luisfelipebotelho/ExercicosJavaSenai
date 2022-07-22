package aulas;

import java.util.Locale;
import java.util.Scanner;

public class InterpolacaoCondicional {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		/*
		 * String nome = "Luis Felipe"; int idade; double salario = 0; char sexo = 'M';
		 * 
		 * System.out.printf("%s não é do sexo %c e tem %d reias", nome, ...
		 */

		int a = 11;
		int b = 20;
		int c = 10;
		double d = 10.0;

		/*
		 * boolean v = true; boolean f = false;
		 * 
		 * 
		 * 
		 * if (a == c || b == a) { System.out.println("Sim"); } else {
		 * System.out.println("Não"); }
		 */

		// System.out.println(a += b);
		// System.out.println(a += b);

		/*
		 * int ano = 2022;
		 * 
		 * 
		 * if (ano %4 == 0) { System.out.println("O ano é bisesto! "); }else {
		 * System.out.println("O ano não é bisesto! "); }
		 */

		System.out.println("Entre com a nota: ");
		d = leia.nextDouble();

		if (d >= 0.0 && d <= 10.0) {
			System.out.println("Nota válida! ");
		} else {
			System.out.println("Entre com uma nota de 0 a 10!");
			System.out.println("Entre com a nota: ");
			d = leia.nextDouble();

			if (d >= 0.0 && d <= 10.00) {
				System.out.println("Nota válida!");
			} else {
				System.out.println("Sabe ler não? Tem que ser entre 0 e 10");
				System.out.println("Entre com a nota: ");
				d = leia.nextDouble();
				
				if (d >= 0.0 && d <= 10.0) {
					System.out.println("Agora sim, nota válida! ");
			} else {
				System.out.println("Desisto!");
				
			}
			}
			

		}
		leia.close();

	}

}
