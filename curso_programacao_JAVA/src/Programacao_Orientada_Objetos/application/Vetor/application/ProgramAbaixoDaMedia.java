package Programacao_Orientada_Objetos.application.Vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAbaixoDaMedia {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println();
		System.out.print("Quantos elementos vai ter o vetor? ");
		int quantity = sc.nextInt();
		
		double[] numbers = new double[quantity];
		double sum = 0.0;
		String numbersUnderAverage = "";
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.printf("%nDigite o %dº numero: ", i+1);
			numbers[i] = sc.nextDouble();
			sum += numbers[i];
		}
		
		for(int i = 0; i < numbers.length; i++) {
			if ((sum/numbers.length) > numbers[i]) {
				numbersUnderAverage += Double.toString(numbers[i]) + "\n";
			}
		}
		
		System.out.printf("%nMEDIA DO VETOR = %.3f", sum/numbers.length);
		System.out.printf("%nELEMENTOS ABAIXO DA MEDIA: %n%s ", numbersUnderAverage);
		
		sc.close();
	}

}
