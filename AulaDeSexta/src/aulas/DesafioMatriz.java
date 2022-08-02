package aulas;

import java.util.Locale;
import java.util.Scanner;

public class DesafioMatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int[][] numerosArray = new int[3][3];
		int contador = 10;

		for (int i = 0; i < numerosArray.length; i++) {

			for (int j = 0; j < numerosArray.length; j++) {

				numerosArray[i][j] = contador;
				contador++;

				if (i == j) {
					System.out.print(numerosArray[i][j] + "\t");
				}
			}

		}

		sc.close();

	}

}
