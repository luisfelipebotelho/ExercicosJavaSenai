package aulas;

import java.util.Locale;
import java.util.Scanner;

public class TerceiroExercicoNotas {

	public static void main(String[] args) {
		
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double resultado = 0;
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite a nota do primeiro bimestre: ");
		a = leia.nextDouble();
		
		System.out.println("Digite a nota do segundo bimestre: ");
		b = leia.nextDouble();
		
		System.out.println("Digite a nota do terceiro bimestre: ");
		c = leia.nextDouble();
		
		System.out.println("Digite a nota do quarto bimestre: ");
		d = leia.nextDouble();
		
		resultado = (a + b + c + d)/4;
		System.out.println("A média bimestral do aluno é: "+ resultado);
		
		leia.close();

	}

}
