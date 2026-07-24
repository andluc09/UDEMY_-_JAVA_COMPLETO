package Topicos_Basicos;

import java.util.Locale;
import java.util.Scanner;

public class Entrada_de_dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Texto

		System.out.printf("%nDigite um texto: %n");

		Scanner sc = new Scanner(System.in); // Associando o objeto do tipo scanner ao teclado no modo console
		String x;

		x = sc.next();

		System.out.printf("%nVocê digitou: " + x + "%n");

		// Inteiro

		System.out.printf("%nDigite um inteiro: %n");

		Scanner si = new Scanner(System.in); // Associando o objeto do tipo scanner ao teclado no modo console
		int y;

		y = si.nextInt();

		System.out.printf("%nVocê digitou: " + y + "%n");

		// Ponto Flutuante (Números Complexos)

		/*
		 * double w;
		 * 
		 * w = sc.nextDouble();
		 * 
		 * System.out.printf("%nVocê digitou: " + w + "%n");
		 * 
		 * sc.close(); // Desalocar memória, encerrando este recurso que fora criado
		 */

		// Resultou em um número com ponto ao digitar o número utilizando vírgula, vamos
		// contornar isso:

		System.out.printf("%nDigite um número complexo (ponto flutuante): %n");

		Locale.setDefault(Locale.US);
		Scanner sx = new Scanner(System.in);
		double i;

		i = sx.nextDouble();

		System.out.printf("%nVocê digitou: %.2f%n", i);

		// Caractere

		System.out.printf("%nDigite um caractere: %n");

		Scanner sd = new Scanner(System.in); // Associando o objeto do tipo scanner ao teclado no modo console

		char c;

		c = sd.next().charAt(0);

		System.out.printf("%nVocê digitou: %C%n", c);

		// Teste com vários tipos de dados

		System.out.printf(
				"%nDigite um texto, um número inteiro e um número complexo (ponto flutuante) confirmando a cada item: %n");

		Scanner sp = new Scanner(System.in); // Associando o objeto do tipo scanner ao teclado no modo console
		String l;
		int g;
		double h;

		l = sp.next();
		g = sp.nextInt();
		h = sp.nextDouble();

		System.out.printf("%n Dados digitados: %n");
		System.out.printf("%n%s%n", l);
		System.out.printf("%n%d%n", g);
		System.out.printf("%n%.3f%n", h);

		// Ler um texto ATÉ A QUEBRA DE LINHA

		System.out.printf("%nDigite um texto, após isso de ENTER e em seguida repita por até 2 vezes: %n%n");
		
		String x1, x2, x3;

		sp.nextLine();  // Solução nextLine() extra para dar a quantidade desejada (limpeza do buffer de leitura)
		x1 = sp.nextLine(); // Quebra de linha pendente, por conta de outro comando anterior utilizado!
		x2 = sp.nextLine();
		x3 = sp.nextLine();
		
		System.out.printf("%nDADOS DIGITADOS: %n%n");
		System.out.println(x1); // Variável consumida, por conta de outro comando anterior utilizado!
		System.out.println(x2);
		System.out.println(x3); // Impressão/Visualização da terceira palavra, comando extra: nextLine()!

		sp.close(); // Desalocar memória, encerrando este recurso que fora criado
		sd.close();
		sx.close();
		si.close();
		sc.close();
	}

}
