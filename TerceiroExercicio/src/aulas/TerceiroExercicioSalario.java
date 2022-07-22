package aulas;

import java.util.Locale;
import java.util.Scanner;

public class TerceiroExercicioSalario {

	public static void main(String[] args) {
		
		double a = 0;
		double b = 0;
		double resultado = 0;
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite quanto você ganha por hora: ");
		a = leia.nextDouble();
		
		System.out.println("Quantas horas você trabalha no mÊs? ");
		b = leia.nextDouble();
		
		resultado = a * b;
		System.out.println("Seu salário no mês foi: " + resultado);
		
		leia.close();
		

	}

}
