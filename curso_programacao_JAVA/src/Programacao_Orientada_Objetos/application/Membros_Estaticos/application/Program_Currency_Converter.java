package Programacao_Orientada_Objetos.application.Membros_Estaticos.application;

import java.util.Locale;
import java.util.Scanner;

import Programacao_Orientada_Objetos.entities.Membros_Estaticos.util.Currency_Converter;

public class Program_Currency_Converter {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.println();
		System.out.println("How many dollars will be bought? ");
		double amount = sc.nextDouble();

		System.out.println();
		double result = Currency_Converter.dollarToReal(amount, dollarPrice);
		System.out.printf("Amount to be paid in reais = %.2f %n", result);
		
		sc.close();
	}

}
