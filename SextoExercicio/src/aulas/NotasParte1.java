package aulas;

import java.util.Locale;
import java.util.Scanner;

public class NotasParte1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
	
		double[] notas = {5.5, 10, 6, 8};
		
		System.out.println("As notas bimestrais são: \n");
		
		for(double nota : notas) {
			System.out.println(nota);
						
		}
			
		System.out.println("\nA média  das notas é: " + ((notas[0] + notas[1] + notas[2] + notas[3] )/4));
		
		sc.close();

	}

}
