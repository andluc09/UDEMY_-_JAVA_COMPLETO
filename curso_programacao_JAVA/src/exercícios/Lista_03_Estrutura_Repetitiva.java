package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class Lista_03_Estrutura_Repetitiva {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// ENQUANTO - WHILE
		
		// Exercício 01
		
		System.out.printf("%n Insira uma senha numérica de quatro digítos: %n");
		
		int senha = sc.nextInt();
	
		while(senha != 2002) {
			System.out.printf("%n Senha Invalida %n");
			senha = sc.nextInt();
		}
		
		System.out.printf("%n Acesso Permetido %n");
		
		// Exercício 02
		
		int x, y;
		
		System.out.printf("%nInsira uma coordenada X: ");
		
		x = sc.nextInt();
		
		System.out.printf("Insira uma coordenada Y: ");
		
		y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.printf("%n Primeiro quadrante %n");				
			}
			else if(x  < 0 && y > 0) {
				System.out.printf("%n Segundo quadrante %n");
			}
			else if(x < 0 && y < 0) {
				System.out.printf("%n Terceiro quadrante %n");
			}
			else {
				System.out.printf("%n Quarto quadrante %n");
			}
			System.out.printf("%nInsira uma coordenada X: ");
			
			x = sc.nextInt();
			
			System.out.printf("Insira uma coordenada Y: ");
			
			y = sc.nextInt();
		}
		
		// Exercício 03
		
		System.out.printf("%n Insira uma opção para o combustível: %n");
		
		int tipo = sc.nextInt();
		
		int alcool = 0;
		int gasolina = 0; 
		int diesel = 0;
		String thanks = "MUITO OBRIGADO!";
		
		while(tipo != 4) {
			if(tipo == 1) {
				alcool = alcool + 1;
			}
			else if(tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if(tipo == 3) {
				diesel = diesel + 1;
			}
			
			System.out.printf("%n Insira uma opção para o combustível: %n");
			
			tipo = sc.nextInt();
		}
		
		System.out.printf("%n %s %n", thanks);
		System.out.printf("%n Alcool: %d %n", alcool);
		System.out.printf("%n Gasolina: %d %n", gasolina);
		System.out.printf("%n Diesel: %d %n",diesel);
		
		// PARA - FOR
		
		// Exercício 01
		
		System.out.printf("%nInsira um valor para exibir seus antecessores: ");
		
		int w = sc.nextInt();
		
		if(w >= 1 || w <= 1000) {
			System.out.println();
			for(int i = 1; i <= w; i++) {
				System.out.println(i);
			}
		}
		
		// Exercício 02
		
		System.out.printf("%n Insira a quantidade de valores: ");
		
		int in = 0;
		int out = 0;
		int digito;
		int valor = sc.nextInt();
		
		for(int i = 1; i <= valor; i++) {
		System.out.printf("%n Insira o %d° número: ", i);
			digito = sc.nextInt();
			if(digito > 10 && digito < 20) {
				in++;
			}else{
				out++;
			}
		}
		
		System.out.printf("%n %d in %n", in);
		System.out.printf("%n %d out %n", out);
		
		// Exercício 03

		int num = 0;
		
		System.out.printf("%nInsira a quantidade de números: %n");
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.printf("%n %d° Insira os três números reais: %n", i);
			
			double valor1 = sc.nextDouble();			
			double valor2 = sc.nextDouble();
			double valor3 = sc.nextDouble();
			
			double media = (valor1 * 2.0 + valor2 * 3.0 + valor3 * 5.0)/10.0;
			
			System.out.printf("%n Média Ponderada: %.1f%n", media);			
		}
		
		
		// Exercício 04
		
		int q, p, t = 0;
		
		System.out.printf("%nInsira a quantidade de números: %n");
		q = sc.nextInt();
		
		for(int i = 1; i <= q; i++) {
			System.out.printf("%n %d° Insira os dois números: %n", i);
			
			p = sc.nextInt();
			t = sc.nextInt();
			
			if(t == 0) {
				System.out.printf("%n Divisão Impossível!%n");
			}else {
				double div = (double) p/t;
				System.out.printf("%n Divisão = %.1f%n", div);
			}
		}
		
		// Exercício 05
		
		int fatorial = 0;
		int resultado = 1;
		
		System.out.printf("%n Insira um número para ter seu fatorial: %n");
		fatorial = sc.nextInt();
		
		for(int i = 1; i <= fatorial; i++) {
			resultado *= i;
		}
		
		System.out.printf("%n Fatorial: %d %n", resultado);
		
		// Exercício 06
		
		int g = 0;
		
		System.out.printf("%n Insira um número para calcular todos os seus divisores: %n");
		g = sc.nextInt();
		
		for(int i = 1; i <= g; i++) {
			if (g % i == 0) {
				System.out.printf("%n Divisor: %d %n", i);
			}
		}
		
		// Exercício 07
		
		int z = 0;
		
		System.out.printf("%n Insira um número inteiro positivo: %n");
		z = sc.nextInt();
		
		for(int i = 1; i<= z; i++) {
			System.out.printf("%n %d %d %d %n", i, i*i, i*i*i);
		}
		
		sc.close();
	}
}