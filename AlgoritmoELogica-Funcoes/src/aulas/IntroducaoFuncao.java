package aulas;

public class IntroducaoFuncao {

	public static void main(String[] args) {

		// FUNÇÕES
		/*
		 * System.out.println(Math.sqrt(16));// Retorna a raiz quadrada;
		 * System.out.println(Math.PI);// Retorna o numero PI;
		 */

		ImprimeNome();
		RecebeNome("Felipe");
		System.out.println("a soma dos numeros é: " + Somar());
		System.out.println("A soma dos dois numeros é: " + SomarParametros(10, 20));
		System.out.println(DoisParametros("Luis", 32));

	}

	public static void ImprimeNome() {
		System.out.println("Meu nome é: Luis");

	}

	public static void RecebeNome(String Nome) {
		System.out.println("Meu nome é: " + Nome);
	}

	public static int Somar() {

		return 1 + 1;
	}

	public static int SomarParametros(int j, int f) {

		// int somar = j+f;
		// return somar; é a mesma coisa do return feito direto...

		return j + f;

	}

	public static String DoisParametros(String nome, int idade) {		
		return nome  + " tem " + idade + " anos";
		
	}
	


}
