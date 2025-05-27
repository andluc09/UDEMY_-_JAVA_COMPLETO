package Programacao_Orientada_Objetos.application.Vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramNegativo {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		while (num > 10 || num <= 0) {
			System.out.println("Quantos numeros voce vai digitar? ");
			num = sc.nextInt();
		}
		
		int[] vect = new int[num]; // Instanciação do vetor
		
		for(int i = 0; i<vect.length; i++) {
			System.out.printf("%nDigite o %dº numero: ", i+1);
			vect[i] = sc.nextInt();
		}
		
		System.out.printf("%nNúmeros Negativos: %n");
		
		for(int i = 0; i<vect.length; i++) {
			if (vect[i] < 0) {
				System.out.printf("%n%d", vect[i]);	
			}
		}
		
		sc.close();
	}
}
