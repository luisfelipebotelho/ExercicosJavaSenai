package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		/*
		//Usamos quando já sabemos a quantidade vezes o que queremos executar determinada condição.		
		for(int i = 0; i <= 10; ++i) {
			System.out.println("O contador está valendo: " + i);
		}

		int i = 0;
		
		//Usamos quando não sabemos a quantidade de vezes que precisamos executar determinado bloco de código.
		while(i <= 10) {
			System.out.println("O contador do while está valento: " + i);
			i++;			
		}
		
		//Usamos quando queremos que o bloco de código seja execultado ao menos uma vez.
		do {
			System.out.println("o contador do while esta valendo: " + i);
			++i;			
		}while(i <= 10);
		*/
		
		int condicao = 0;
		int somar = 0;
		
		
		//System.out.println("Entre com o numero 1 para sim e 2 para não");
		//condicao = leia.nextInt();
		
		/*while(condicao == 1) {
			System.out.println("Apertou 1");	
			System.out.println("Entre com o numero 1 para sim e 2 para não");
			condicao = leia.nextInt();	
			somar++;
		}*/
		
		do {
			System.out.println("Entre com o numero 1 para sim e 2 para não");
			condicao = leia.nextInt();
			
		}while(condicao ==1);
		
		System.out.println("Saiu do bloco de repetição! Repetiu: ");
		
		leia.close();
	}

}
