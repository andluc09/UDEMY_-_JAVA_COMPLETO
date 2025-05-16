package Programacao_Orientada_Objetos.application.Membros_Estaticos.application;

import java.util.Locale;
import java.util.Scanner;

import Programacao_Orientada_Objetos.entities.Membros_Estaticos.util.Calculator;

public class Program_Calculator {
	
	public static void main(String[] args) { // Um método estático só pode conter métodos estáticos, 
											 // não podendo ser invocado um método diferente!
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius); 
		
		double v = Calculator.volume(radius);
		
		System.out.println();
		System.out.printf("Circumference: %.2f %n", c);
		
		System.out.println();
		System.out.printf("Volume: %.2f %n", v);
		
		System.out.println();
		System.out.printf("PI value: %.2f %n", Calculator.PI);
		
		sc.close();
	}
	
}
