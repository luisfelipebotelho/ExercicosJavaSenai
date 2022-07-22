package aulas;

import java.util.Locale;
import java.util.Scanner;

public class QuartoExercicioTresNumero {

	public static void main(String[] args) {
		// Faça um programa que leia 3 números e mostre o maior deles.
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.println("Digite o primeiro numero: ");
		a = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		b = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		c = leia.nextInt();
		
		if (a > b && a > c) {
			System.out.println("O maior número é o: " + a);
		}else {
			if (b > a && b > c) {
				System.out.println("O maior número é o: " + b);
			}else {
				System.out.println("O maior número é o: " + c);
			}
			
			leia.close();
		}
	}

}
