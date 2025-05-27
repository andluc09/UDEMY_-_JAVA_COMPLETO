package Programacao_Orientada_Objetos.application.Vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSomamMediaVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%nQuantos numeros voce vai digitar? ");
		
		int num = sc.nextInt();
		
		double[] vect = new double[num];
		double sum = 0.0;
		double average = 0.0;
		String text = "";
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%nDigite o %dº numero: ", i+1);
			vect[i] = sc.nextDouble();
			text += Double.toString(vect[i]) + " ";
			sum += vect[i];
			if (i == (vect.length - 1)) {
				average = sum / vect.length;
			}
		}

		
		System.out.printf("%nVALORES = " + text);
		System.out.printf("%nSOMA = %.2f", sum);
		System.out.printf("%nMEDIA = %.2f", average);
		
		sc.close();
	}
	
}
