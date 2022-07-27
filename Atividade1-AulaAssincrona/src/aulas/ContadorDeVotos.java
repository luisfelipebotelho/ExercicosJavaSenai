package aulas;

import java.util.Locale;
import java.util.Scanner;

public class ContadorDeVotos {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		int voto;
		int votosMolusco = 0;
		int votosNelson = 0;
		int votosGomes = 0;
		int votosBolim = 0;

		System.out.println("----URNA ELETRÔNICA----\n");
		System.out.println("Escolha um dos canditatos abaixo: \n");
		System.out.println(" (13) Molusco da fenda do biquini");
		System.out.println(" (17) Nelson dos fazendeiros");
		System.out.println(" (12) Gomes dos coroneis");
		System.out.println(" (15) Bolim das casas");
		voto = leia.nextInt();

		while (voto > 0) {

			if (voto == 13) {
				votosMolusco++;
				System.out.println("Você votou no Molusco!");

			} else if (voto == 17) {
				votosNelson++;
				System.out.println("Você votou no Nelson!");
			} else if (voto == 12) {
				votosGomes++;
				System.out.println("Você votou no Gomes!");
			} else if (voto == 15) {
				votosBolim++;
				System.out.println("Você votou no Bolim!");
			} else {
				System.out.println("O candidato digitado não existe, vote novamente escolhendo uma das opções.");
			}

			System.out.println("Vote novamente.");
			System.out.println("(0) para sair");
			voto = leia.nextInt();

		}
		System.out.println("-----RESULTADO-----\n");
		System.out.println("Molusco: " + votosMolusco);
		System.out.println("Nelson: " + votosNelson);
		System.out.println("Gomes: " + votosGomes);
		System.out.println("Bolim: " + votosBolim);

		leia.close();

	}

}
