package aulas;

import java.util.Locale;
import java.util.Scanner;

public class atividadeparte2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		/*
		 * Peça para o usuário inserir o valor do seu salario bruto e faça o desconto de
		 * 5% do IRPF, e 11 % do INSS e mostre o salario liquido. Se o salario liquido
		 * for menor que 1200,00 o profissional receberá 5% a mais de bônus, se o
		 * salario liquido ultrapassar 3500,00 o funcionario recebera 2% a mais de bônus
		 */

		double bruto = 0;
		double irpf = 0.05;
		double inss = 0.11;
		double impostos = irpf + inss;

		System.out.println("Digite seu salário bruto: ");
		bruto = leia.nextDouble();

		double liquido = bruto - (bruto * impostos);
		System.out.println("Seu salário líquido é: R$ " + liquido);

		double bonus5 = liquido + (liquido * 0.05);
		double bonus2 = liquido + (liquido * 0.02);

		if (liquido <= 1200) {
			System.out.println("Recebe 5% de bônus totalizando: R$ " + bonus5);
		} else if (liquido >= 3500) {
			System.out.println("Recebe 2% de bônus totalizando: R$ " + bonus2);
		} else {
			System.out.println("Salário não compatível para bônus");
		}

		leia.close();

	}

}
