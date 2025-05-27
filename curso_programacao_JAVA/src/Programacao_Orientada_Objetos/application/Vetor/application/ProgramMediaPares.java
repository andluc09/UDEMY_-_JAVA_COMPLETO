package Programacao_Orientada_Objetos.application.Vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMediaPares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.printf("%nQuantos elementos vai ter o vetor? ");
		int quantity = sc.nextInt();
		int sum = 0;
		int cont = 0;
		
		int[] numbers = new int[quantity];
		
		double averagePairs = 0.0;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("%nDigite o %dº numero: ", i+1);
			numbers[i] = sc.nextInt();
			if (numbers[i] % 2 == 0.0) {
				sum += numbers[i];	
				cont++;
			}
		}
		
		if (cont > 0.0) {
			averagePairs = sum/ cont;
			System.out.printf("%nMEDIA DOS PARES = %.1f ", averagePairs);
		} else {
			System.out.printf("%nNENHUM NUMERO PAR ");
		}
		
		sc.close();
	}
	
}
