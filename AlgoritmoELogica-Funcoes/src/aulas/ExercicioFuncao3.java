package aulas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFuncao3 {

	public static void main(String[] args) {

		// EXERCÍCIO 3
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		double a = 0.0;
		double b = 0.0;
		double c = 0.0;

		System.out.print("Entre com o valor de a: ");
		a = sc.nextDouble();

		System.out.print("Entre com o valor de b: ");
		b = sc.nextDouble();

		System.out.print("Entre com o valor de c: ");
		c = sc.nextDouble();
		
		FsegundoGrau(a, b, c);
			
		sc.close();

	}

	public static void FsegundoGrau(double a, double b, double c) {
		double delta = (Math.pow(b, 2)) - (4 * a *c);
		double X1 = 0.0;
		double X2 = 0.0;
		if(delta < 0) {
			System.out.println("Delta não tem raiz");
		} else {
			X1 = (-b + Math.sqrt(delta)) / (2 * a);
			X2 = (-b - Math.sqrt(delta)) / (2 * a);
		}		
		System.out.printf("Delta está valendo: %.2f", delta);
		System.out.printf("\nX1 está valendo: %.2f", X1);
		System.out.printf("\nX2 está valendo: %.2f", X2);
		
	}
}

	

