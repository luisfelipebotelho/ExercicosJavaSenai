package aulas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFuncao1 {

	public static void main(String[] args) {

		// EXERCÍCIO 1 - PRECISA FINALIZAR...
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		double altura = 0.0;
		int idade = 0;
		double peso = 0.0;
		char sexo;

		System.out.println("Entre com a altura: ");
		altura = sc.nextDouble();
		System.out.println("Entre com a idade: ");
		idade = sc.nextInt();
		System.out.println("Entre com o peso: ");
		peso = sc.nextDouble();
		System.out.println("Entre com o sexo: ");
		sexo = sc.next().charAt(0);

		System.out.println(CalcularIMC(altura, peso, sexo));

		sc.close();

	}

	public static String CalcularIMC(double a, double p, char s) {
		double imc = (p / (a * a));

		if (Character.toUpperCase(s) == 'M' && imc < 20.7) {
			return "Abaixo do peso, imc: " + imc;

		} else if (Character.toUpperCase(s) == 'M' && imc >= 20.7 && imc < 26.4) {
			return "Peso normal, imc: " + imc;

		} else if (Character.toUpperCase(s) == 'M' && imc >= 26.4 && imc < 27.8) {
			return "Marginalmente cima do peso, imc: " + imc;

		} else if (Character.toUpperCase(s) == 'M' && imc >= 27.8 && imc < 31.1) {
			return "Acima do peso ideial, imc: " + imc;

		} else if (Character.toUpperCase(s) == 'F' && imc < 20.7) {
			return "Abaixo do peso, imc: " + imc;

		} else if (Character.toUpperCase(s) == 'F' && imc >= 20.7 && imc < 26.4) {
			return "Peso normal, imc: " + imc;

		} else if (Character.toUpperCase(s) == 'F' && imc >= 26.4 && imc < 27.8) {
			return "Marginalmente cima do peso, imc: " + imc;

		} else if (Character.toUpperCase(s) == 'F' && imc >= 27.8 && imc < 31.1) {
			return "Acima do peso ideial, imc: " + imc;

		} else {
			return "Obeso, imc " + imc;
		}

	}

}
