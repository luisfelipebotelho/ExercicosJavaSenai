package aulas;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Aula27_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		/*
		 * ArrayList<String> lista = new ArrayList<>();
		 * 
		 * lista.add("Luis"); lista.add("Felipe"); lista.add("Cristina");
		 * 
		 * 
		 * System.out.println(lista.get(2)); lista.sort(null); for(String nomesNaLista :
		 * lista) { System.out.println(nomesNaLista); }
		 */

		int[][] numerosArray = new int[3][3];
		int contador = 10;

		for (int i = 0; i < numerosArray.length; i++) {
			for (int j = 0; j < numerosArray.length; j++) {
				numerosArray[i][j] = contador;
				System.out.print(numerosArray[i][j] + "\t");
				contador++;
			}
			System.out.println("\n");
		}
		

		sc.close();
	}

}
