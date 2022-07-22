package aulas;

import java.util.Locale;
import java.util.Scanner;

public class TerceiroExercicioSoma {

	public static void main(String[] args) {
	
		double numero1 = 0;
		double numero2 = 0;
		double soma = 0;
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = leia.nextDouble();
		
		soma = numero1 + numero2;
		System.out.println("A soma dos números é: " + soma);
	
		
		leia.close();

	}

}
