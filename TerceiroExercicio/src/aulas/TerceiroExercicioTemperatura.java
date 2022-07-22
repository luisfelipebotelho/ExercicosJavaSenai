package aulas;

import java.util.Locale;
import java.util.Scanner;

public class TerceiroExercicioTemperatura {

	public static void main(String[] args) {
		
		double temperatura = 0;
		double resultado = 0;
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite a temperatura em Fahrenheit: ");
		temperatura = leia.nextDouble();
		
		resultado = 5*((temperatura-32)/9);
		System.out.println("A temperatura em graus Celsius é: " + resultado + "°C");
		
		/*System.out.printf("A temperatura em Celsius é: %.2f", resultado,"°C");
		*/
		
		leia.close();
		
		
		
	}

}
