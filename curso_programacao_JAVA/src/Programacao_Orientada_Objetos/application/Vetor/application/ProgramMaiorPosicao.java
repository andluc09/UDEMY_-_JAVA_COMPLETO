package Programacao_Orientada_Objetos.application.Vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMaiorPosicao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%nQuantos numeros voce vai digitar? ");
		int num = sc.nextInt(); 
		
		int[] inteiros = new int[num];
		int maior = 0;
		int posicao = 0;
		
		for (int i = 0; i < inteiros.length; i++) {
			System.out.println();
			System.out.print("Digite o " + (i+1) + "º numero: ");
			inteiros[i] = sc.nextInt();
			
			if(maior < inteiros[i]) {
				maior = inteiros[i];
				posicao = i;
			}
		}
			
		System.out.printf("%nMAIOR VALOR = %d", maior);	
		System.out.println();
		System.out.printf("%nPOSICAO DO MAIOR VALOR = %d", posicao);
		
		sc.close();
	}
	
}
