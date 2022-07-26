package aulas;

import java.util.Locale;
import java.util.Scanner;

public class StringsJava {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		String frase = "Aula Java professor Luan dia vinte e seis";
		char caractere = 's';
		
		System.out.println(frase.length()); //conta a qtd de caracteres, inclusive espaços em branco
		
		System.out.println(frase.charAt(2));//localiza o caractere na posição indicada, começando pelo zero
		
		System.out.println(frase.lastIndexOf("Z"));//localiza a ultima ocorrência do caractere passado como parametro
		
		System.out.println(frase.concat(" Foi concatenado")); //Concatena Strings
		
		System.out.println(frase.contentEquals("Aula Java professor Luan dia vinte e seis"));//Compara se o conteudo da string é igual ao conteudo passsado no parâmetro;
		
		System.out.println(frase.endsWith("s"));//Ultima ocorrencia da string  e compara se é igual ao conteudo
		
		System.out.println(frase.trim().endsWith("s")); 
		
		System.out.println(frase.trim());//remove espaços em branco no começo e no final da string
		
		System.out.println(frase.toLowerCase());//coloca todas as letras da string em letras minusculas
		
		System.out.println(frase.toUpperCase());//coloca todas as letras da string em letras maiusculas
		
		System.out.println(frase.replace("a", "b"));//altera uma letra por outra passada como referencia
		
		System.out.println(frase.replace("Luan", "Muruk"));//altera o conjunto de cacteres
		
		System.out.println(frase.replaceAll("a", "A"));
		
		frase = " ";
		System.out.println(frase.isEmpty());//verifica se a string contem valor, retorna verdadeiro ou falso
		
		double x = 1254.36498;		
		System.out.println(String.format("%.2f", x));
		
		System.out.println(Character.toUpperCase(caractere)); //converte para letra maiuscula
		System.out.println(Character.toLowerCase(caractere)); //converte para letra minuscula
		
		leia.close();
		

	}

}
