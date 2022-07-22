package aulas;

import java.util.Locale;
import java.util.Scanner;

public class QuartoExercicioDoisNumeros {

	public static void main(String[] args) {
		
		//Faça um programa que leia dois números e imprima o maior deles.
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		double a = 0;
		double b = 0;
		
		System.out.println("Digite o primeiro número: ");
		a = leia.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		b = leia.nextDouble();
		
		if (a > b) {
			System.out.println("O maior número é: " + a);
		}else {
			System.out.println("O maior número é: " + b);
		}

		leia.close();

	}

}
