package Programacao_Orientada_Objetos.application;

import java.util.Locale;
import java.util.Scanner;

import Programacao_Orientada_Objetos.entities.Rectangle;

public class Program_Rectangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();	
		rectangle.height = sc.nextDouble();
		
		System.out.println();
		System.out.printf("%n AREA = %.2f", rectangle.area());
		
		System.out.println();
		System.out.printf("%n PERIMETER = %.2f", rectangle.perimeter());

		System.out.println();
		System.out.printf("%n DIAGONAL = %.2f", rectangle.diagonal());
		
		sc.close();
	}

}
