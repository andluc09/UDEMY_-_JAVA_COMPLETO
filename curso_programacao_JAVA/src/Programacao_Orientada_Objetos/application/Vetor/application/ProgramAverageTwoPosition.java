package Programacao_Orientada_Objetos.application.Vetor.application;

import java.util.Locale;
import java.util.Scanner;

import Programacao_Orientada_Objetos.entities.Vetor.entities.Product;

public class ProgramAverageTwoPosition {
	
	// VETOR TIPO - CLASSE
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number de positions of vector: ");
		
		int n = sc.nextInt();
		double amount = 0.0;
		double result = 0.0;
		
		Product[] product = new Product[n]; // Aponta para à classe que detém 2 dois elementos, sendo um vetor de 3 três posições  
		
		for (int i = 0; i<product.length; i++) { // vetor.length = tamanho do vetor, já informado 
			System.out.printf("%nEnter a name in %dª position this vector: ", i+1);
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.printf("%nEnter a price in %dª position this vector: ", i+1);
			double price = sc.nextDouble();
			
			product[i] = new Product(name, price);
			amount += product[i].getPrice();
		}
		
		result = amount / product.length;
		
		System.out.printf("%nAverage price value = %.2f %n", result);
		
		sc.close();
	}

}
