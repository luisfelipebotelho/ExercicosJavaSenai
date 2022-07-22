package aulas;

import java.util.Locale;
import java.util.Scanner;

public class atividadeparte1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		/*
		 * Faça um programa que peça o nome e a senha e faça a verificação de uma
		 * variável que obtenha a senha e o usuário (como se fosse cadastrado) e retorne
		 * erro caso a senha ou o usuário esteja errado. A mensagem a ser mostrada deve
		 * ser de acordo com o respectivo erro!
		 */

		String n1 = "Luis";
		String nome;
		int s1 = 123;
		int senha;

		System.out.println("Digite seu usuario: ");
		nome = leia.nextLine();

		System.out.println("Digite sua senha: ");
		senha = leia.nextInt();

		if (!n1.equals(nome) && s1 == senha) {
			System.out.println("Login incorreto!");
		} else if (n1.equals(nome) && s1 != senha) {
			System.out.println("Senha incorreta!");
		} else if (!n1.equals(nome) && s1 != senha) {
			System.out.println("Login e senha incorretos!");
		} else {
			System.out.println("Acesso liberado!");
		}

		leia.close();
	}

}
