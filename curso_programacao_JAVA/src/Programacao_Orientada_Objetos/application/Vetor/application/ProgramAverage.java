package Programacao_Orientada_Objetos.application.Vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAverage {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number de positions of vector: ");
		
		int n = sc.nextInt();
		double amount = 0.0;
		double result = 0.0;
		
		double[] vect = new double[n]; // Instanciação do vetor
				
		for (int i = 0; i < n ; i++) {
			System.out.printf("%nEnter value %d° in vector: ", i+1);
			vect[i] = sc.nextDouble(); 
			amount += vect[i];
		}
		
		result = amount / n; 
		
		System.out.printf("%nAverage height value = %.2f %n", result);
		
		sc.close();
	}

}
