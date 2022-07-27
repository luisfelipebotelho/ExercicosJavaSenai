package aulas;

import java.util.Locale;
import java.util.Scanner;

public class QuintoExercicioEntregar3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		String nome;
		int idade = 0;
		double salario = 0.0;
		char sexo, ec;

		// Validação de nome;

		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();

		while (nome.length() < 3) {

			System.out.println("O nome precisa ser maior de 3 caracteres!");
			System.out.print("Digite seu nome: ");
			nome = leia.nextLine();

		}
		System.out.println("Você se chama: " + nome);

		// Validação de idade

		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();

		while (idade < 0 || idade > 150) {

			System.out.println("A idade deve ser entre 0 e 150 anos!");
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();

		}
		System.out.println("Você tem " + idade + " anos");

		// Validação de salário

		System.out.println("Digite o seu salário: ");
		salario = leia.nextDouble();

		while (salario <= 0) {
			System.out.println("Seu salário precisa ser maior que 0");
			System.out.println("Digite o seu salário: ");
			salario = leia.nextDouble();

		}
		System.out.println("Seu salário é " + salario);

		// Validação do sexo;

		System.out.println("Digite seu sexo: ");
		sexo = leia.next().charAt(0);

		while (Character.toUpperCase(sexo) == 'M' || Character.toUpperCase(sexo) == 'F') {
			System.out.println("O sexo precisa ser M ou F ");
			System.out.println("Digite seu sexo: ");
			sexo = leia.next().charAt(0);

		}
		System.out.println("Seu sexo é :" + sexo);

		// Validação do estado civil

		System.out.println("Digite seu estado civil: ");
		ec = leia.next().charAt(0);

		while (Character.toUpperCase(ec) == 'S' 
				|| Character.toUpperCase(ec)== 'C' 
				|| Character.toUpperCase(ec) == 'V' 
				|| Character.toUpperCase(ec) == 'D')
			;
		{
			System.out.println(" O estado civil precisa ser: S, C, V ou D");
			System.out.println("Digite seu estado civil: ");
			ec = leia.next().charAt(0);

		}
		System.out.println("Seu estado civil é: " + ec);

		leia.close();

	}

}
