package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Herois {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		Produto Heroi = new Produto();
		
		System.out.print("Entre com o nome do herói: ");
		String superHeroi = sc.nextLine();
		Heroi.setNomeHeroi(superHeroi);
		
		System.out.println(Heroi.getNomeDeHeroi());
		
		System.out.print("Qual universo o herói pertence: ");
		String universo = sc.nextLine();
		Heroi.setUniversoPertence(universo);
		
		System.out.println(Heroi.getUniversoPertence());
		
		
		
		sc.close();
	}

}
