package Programacao_Orientada_Objetos.application;

import java.util.Locale;
import java.util.Scanner;

import Programacao_Orientada_Objetos.entities.Triangle;

public class Program_Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Triangle x,y; // Uma única variável representativa (Classe Triângulo)
					  // Classe: é a definição do tipo — Triangle
					  // Objetos: são instâncias da classe — Triângulo X e o Triângulo Y
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.printf("%n Enter the measures of triangle X: %n");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.printf("%n Enter the measures of triangle Y: %n");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
						
		double areaY = y.area();
		
		System.out.printf("%n Triangle X area: %.4f %n", areaX);
		
		System.out.printf("%n Triangle Y area: %.4f %n", areaY);
		
		if(areaX > areaY) {
			System.out.printf("%n Larger area: X %n");
		}else {
			System.out.printf("%n Larger area: Y %n");			
		}
		
		sc.close();
		
	}

}
