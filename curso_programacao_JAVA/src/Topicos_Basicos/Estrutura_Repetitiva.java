package Topicos_Basicos;

import java.util.Locale;
import java.util.Scanner;

public class Estrutura_Repetitiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ENQUANTO - WHILE
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%n Insira valores, interrompa digitando zero (0): %n");
		
		int x = sc.nextInt();
		int soma = 0;
		
		while(x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.printf("%n Valor acumulado: %d%n", soma);
		
		// PARA - FOR
		
		System.out.printf("%n Insira uma quantidade de repetições: ");
		
		int n = sc.nextInt();
		int adicao = 0;
		
		for(int i = 0; i < n; i++) {
			int z = sc.nextInt();
			adicao = adicao + z;
		}
		
		System.out.printf("%n Soma: %d %n", adicao);
		
		System.out.printf("%n Contagem Crescente: %n");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Valor de i: " + i);
		}
		
		System.out.printf("%n Contagem Decrescente: %n");
		
		for(int i = 4; i >= 0; i--) {
			System.out.println("Valor de i: " + i);
		}
		
		// FAÇA - ENQUANTO —> DO - WHILE
		
		/* Fórmula: F = 9.C/5 + 32 */
		
		char resp;
		
		do {
			System.out.printf("%n Digite a temperatura em Celsius: %n");
			
			double celsius = sc.nextDouble();
			
			double fahrenheit = (9.0 * celsius/5.0) + 32.0;
			
			System.out.printf("%n Equivalente em Fahrenheit: %.2f %n", fahrenheit);
			
			System.out.printf("%n Deseja repetir (s/n)? %n ");
			
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		System.out.printf("%n FIM ");
		
		sc.close();
	}

}
