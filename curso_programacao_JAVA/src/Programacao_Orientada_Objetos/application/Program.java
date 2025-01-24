package Programacao_Orientada_Objetos.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Solução sem Orientação a Objetos
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.printf("%n Enter the measures of triangle X: %n");
		
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.printf("%n Enter the measures of triangle Y: %n");
		
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC)/ 2.0;
		
		double areaX = Math.sqrt(p * (p - xA) * (p -xB) * (p - xC));
		
		p = (yA + yB + yC)/ 2.0;
		
		double areaY = Math.sqrt(p * (p - yA) * (p -yB) * (p - yC));
		
		System.out.printf("%n Triangle X area: %.4f %n", areaX);
		
		System.out.printf("%n Triangle Y area: %.4f %n", areaY);
		
		if(areaX > areaY) {
			System.out.printf("%n Larger area: X %n");
		}else {
			System.out.printf("%n Larger area: Y %n");			
		}
		
		sc.close();
	}
	
	// Classe 
	
	// • É um tipo estruturado que pode conter (membros):
	/*
	 * 	• Atributos (dados/ campos)
	 * 	• Métodos (funções/ operações)
	 * */

}
