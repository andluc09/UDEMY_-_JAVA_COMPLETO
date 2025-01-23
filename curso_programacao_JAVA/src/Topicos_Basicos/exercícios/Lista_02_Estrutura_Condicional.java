package Topicos_Basicos.exercícios;

import java.util.Locale;
import java.util.Scanner;

public class Lista_02_Estrutura_Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Exercício 01

		int num;

		System.out.printf("%n Digite um número: %n");

		num = sc.nextInt();

		if (num < 0) {
			System.out.printf("%n NEGATIVO %n");
		} else {
			System.out.printf("%n NÃO NEGATIVO %n");
		}

		// Exercício 02

		System.out.printf("%n Digite um número: %n");

		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.printf("%n PAR %n");
		} else {
			System.out.printf("%n IMPAR %n");
		}

		// Exercício 03

		int A, B;

		System.out.printf("%n Digite o primeiro número: %n");

		A = sc.nextInt();

		System.out.printf("%n Digite o segundo número: %n");

		B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.printf("%n São Múltiplos %n");
		} else {
			System.out.printf("%n Não são Múltiplos %n");
		}

		// Exercício 04
		
		int hora1, hora2, duracao;
		
		System.out.printf("%n Insira a hora inicial: %n");
		
		hora1 = sc.nextInt();
		
		System.out.printf("%n Insira a hora final: %n");
		
		hora2 = sc.nextInt();
		
		if (hora1 < hora2) {
			duracao = hora2 - hora1;
		}
		else {
			duracao = (24 - hora1) + hora2;		
		}
		
		System.out.printf("%n O JOGO DUROU %d HORA(S) %n", duracao);
	
		// Exercício 05

		int	codigo, quantidade;
		double total;
		
		System.out.printf("%n Insira o código de um item de 1 a 5: %n");
		
		codigo = sc.nextInt();
		
		System.out.printf("%n Insira a quantidade para o item escolhido: %n");
		
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			total = quantidade * 4.00;
		} else if (codigo == 2) {
			total = quantidade * 4.50;
		} else if (codigo == 3) {
			total = quantidade *	5.00;	
		} else if (codigo == 4) {
			total = quantidade *	2.00;
		} else {
			total = quantidade * 1.50;
		} 
		
		System.out.printf("%n Total: R$ %.2f%n", total);
		
		// Exercício 06

		double valor;
		
		System.out.printf("%n Digite um valor qualquer: %n");
		
		valor = sc.nextDouble();
		
		if (0.00 <= valor && valor <= 25.00) {
			System.out.printf("%n Intervalo: [0,25] %n");
		}
		else if (25.00 <= valor && valor <= 50.00) {
			System.out.printf("%n Intervalo: (25,50] %n");
		}
		else if (50.00 <= valor && valor <=75.00) {
			System.out.printf("%n Intervalo: (50,75] %n");
		} 
		else if (75.00 <= valor && valor <= 100.00){
			System.out.printf("%n Intervalo: (75,100] %n");
		}
		else {
			System.out.printf("%n Fora de intervalo %n");
		}
		
		// versão 0.1
		
		System.out.printf("%n Digite um valor qualquer: %n");
		
		double numero = sc.nextDouble();
		
		if (numero < 0.0 || numero > 100.0) {
			System.out.printf("%n Fora de intervalo %n ");
		}
		else if (numero <= 25.0) {
			System.out.printf("%n Intervalo [0,25] %n ");
		}
		else if (numero <= 50.0) {
			System.out.printf("%n Intervalo (25,50] %n ");
		}
		else if (numero <= 75.0) {
			System.out.printf("%n Intervalo (50,75] %n ");
		}		
		else {
			System.out.println("%n Intervalo (75,100] %n ");
		}
				
		// Exercício 07

		double x, y;
		
		System.out.printf("%n Digite o valor de X: %n");
		
		x = sc.nextDouble();
		
		System.out.printf("%n Digite o valor de Y: %n");
		
		y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.printf("%n Origem %n");
		}
		else if (x == 0.0) {
			System.out.printf("%n Eixo Y %n");
		}
		else if (y == 0.0) {
			System.out.printf("%n Eixo X %n");
		}
		else if (x > 0 && y > 0) {
			System.out.printf("%n Q1 %n");
		}
		else if (x < 0 && y > 0) {
			System.out.printf("%n Q2 %n");
		}
		else if (x < 0 && y < 0) {
			System.out.printf("%n Q3 %n");
		}
		else if (x > 0 && y < 0) {
			System.out.printf("%n Q4 %n");
		}
		
		// Exercício 08

		double renda, imposto;
		
		System.out.printf("%n Informe seu rendimento financeiro: %n");

		renda = sc.nextDouble();
				
		if (renda <= 2000.0) {
			imposto = 0.0;
		}
		else if (renda <= 3000.0) {
			imposto = (renda - 2000.0) * 0.08;
		}
		else if (renda <= 4500.0) {
			imposto = (renda - 3000.0) * 0.18 + (3000.0 - 2000.0) * 0.08;
		}
		else {
			imposto = (renda - 4500.0) * 0.28 + (4500.00 - 3000.0) * 0.18 + (3000.0 - 2000.0) * 0.08;
		}

		if (imposto == 0.0) {
			System.out.printf("%n Isento %n");
		}
		else {
			System.out.printf("%n R$ %.2f %n", imposto);
		}
		
		sc.close();
	}

}
