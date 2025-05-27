package Programacao_Orientada_Objetos.application.Vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSomaVetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%nQuantos valores vai ter cada vetor? ");
		int num = sc.nextInt(); 
		
		int[] vetor1 = new int[num];
		int[] vetor2 = new int[num];
		int[] vetorSoma = new int[num];
		
		String numerosVetorSoma = "";
		
		System.out.printf("%nDigite os valores do vetor A: %n");
		for (int i =0; i < vetor1.length; i++) {
			vetor1[i] = sc.nextInt();
		}
		
		System.out.printf("%nDigite os valores do vetor B: %n");
		for (int i =0; i < vetor1.length; i++) {
			vetor2[i] = sc.nextInt();
		}
		
	    System.out.printf("%nVETOR RESULTANTE: %n");
	    
		for (int i = 0; i < vetorSoma.length; i++) {
			vetorSoma[i] = vetor1[i] + vetor2[i];
			//System.out.println(vetorSoma[i]);
			numerosVetorSoma += Integer.toString(vetorSoma[i]) + "\n";
		}
		
		System.out.print(numerosVetorSoma);
		
		sc.close();
	}
}
