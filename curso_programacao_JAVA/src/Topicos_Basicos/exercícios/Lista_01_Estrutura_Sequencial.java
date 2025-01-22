package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class Lista_01_Estrutura_Sequencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercício 01

		Locale.setDefault(Locale.US);

		Scanner sx = new Scanner(System.in);

		int parcela1, parcela2, soma;

		System.out.printf("%nDigite dois valores: %n");
		parcela1 = sx.nextInt();
		parcela2 = sx.nextInt();

		soma = parcela1 + parcela2;

		System.out.printf("%nSOMA: %d%n", soma);

		// Exercício 02

		double raio, area, pi;

		pi = 3.14159;

		System.out.printf("%nInsira o valor para o raio de um círculo: %n");

		raio = sx.nextDouble();

		area = pi * Math.pow(raio, 2);

		System.out.printf("%nA = %.4f%n", area);

		// Exercício 03

		int A, B, C, D, DIFERENCA;

		System.out.printf("%n Insira quatro valores: %n");

		A = sx.nextInt();
		B = sx.nextInt();
		C = sx.nextInt();
		D = sx.nextInt();

		DIFERENCA = (A * B - C * D);

		System.out.printf("%n DIFERENCA = %d%n", DIFERENCA);

		// Exercício 04

		int NUMBER, HOUR;
		double VALUE, SALARY;

		System.out.printf("%nDigite o número do funcionário: %n");
		NUMBER = sx.nextInt();
		System.out.printf("%nDigite o número de horas trabalhadas: %n");
		HOUR = sx.nextInt();
		System.out.printf("%nDigite o valor da hora: %n");
		VALUE = sx.nextDouble();

		SALARY = VALUE * HOUR;
		System.out.printf("%nNúmero do funcionário e seu salário: %n");
		System.out.printf("%nNUMBER = %d%n", NUMBER);
		System.out.printf("%nSALARY = U$ %.2f%n", SALARY);

		// Exercício 05

		int COD1, QTDPC1, COD2, QTDPC2;
		double VLUNIT1, VLUNIT2, VLRTOTAL;

		System.out.printf("%nInsira o código da peça 1: %n");
		COD1 = sx.nextInt();
		System.out.printf("%nInsira a quantidade de peças 1: %n");
		QTDPC1 = sx.nextInt();
		System.out.printf("%nInsira o valor unitário da peça 1: %n");
		VLUNIT1 = sx.nextDouble();

		System.out.printf("%nInsira o código da peça 2: %n");
		COD2 = sx.nextInt();
		System.out.printf("%nInsira a quantidade de peças 2: %n");
		QTDPC2 = sx.nextInt();
		System.out.printf("%nInsira o valor unitário da peça 2: %n");
		VLUNIT2 = sx.nextDouble();

		VLRTOTAL = (QTDPC1 * VLUNIT1) + (QTDPC2 * VLUNIT2);
		System.out.printf("%nVALOR A PAGAR PELA PEÇAS: %d E %d = %.2f%n", COD1, COD2, VLRTOTAL);

		// Exercício 06

		double A1, B2, C3, TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO, PI;

		PI = 3.14159;

		System.out.printf("%nInsira o primeiro valor: ");
		A1 = sx.nextDouble();

		System.out.printf("%nInsira o segundo valor: ");
		B2 = sx.nextDouble();

		System.out.printf("%nInsira o terceiro valor: ");
		C3 = sx.nextDouble();

		TRIANGULO = A1 * C3 / 2.0;
		System.out.printf("%nTRIANGULO: %.3f%n", TRIANGULO);

		CIRCULO = PI * Math.pow(C3, 2.0);
		System.out.printf("%nCIRCULO: %.3f%n", CIRCULO);

		TRAPEZIO = ((A1 + B2) * C3) / 2.0;
		System.out.printf("%nTRAPEZIO: %.3f%n", TRAPEZIO);

		QUADRADO = B2 * B2;
		System.out.printf("%nQUADRADO: %.3f%n", QUADRADO);

		RETANGULO = A1 * B2;
		System.out.printf("%nRETANGULO: %.3f%n", RETANGULO);

		sx.close();
	}

}
