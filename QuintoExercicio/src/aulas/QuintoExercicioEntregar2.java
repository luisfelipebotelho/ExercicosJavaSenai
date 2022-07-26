package aulas;

import java.util.Locale;
import java.util.Scanner;

public class QuintoExercicioEntregar2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		String nome, senha;

		System.out.println("Entre com seu usuário: ");
		nome = leia.nextLine();
		System.out.println("Entre com sua senha: ");
		senha = leia.nextLine();
		
		while (nome.equals(senha)) {
			
			System.out.println("Usuário e senha não podem ser iguais!");
			System.out.println();
			
			System.out.println("Entre com seu usuário: ");
			nome = leia.nextLine();
			System.out.println("Entre com sua senha: ");
			senha = leia.nextLine();
		}
			
		System.out.println("Login concluído com sucesso!");

		leia.close();
	}

}
