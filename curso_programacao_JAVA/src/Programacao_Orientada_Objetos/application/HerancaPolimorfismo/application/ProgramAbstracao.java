package Programacao_Orientada_Objetos.application.HerancaPolimorfismo.application;

import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.Circle;
import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.Rectangle;
import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.Shape;
import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.enums.Color;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramAbstracao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Shape> listShapes = new ArrayList<>();

		System.out.printf("\nEnter the number of shapes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("\nShape = #%d data:", i);
			System.out.printf("\n\nRectangle or Circle (r/c)? ");
			char choice = sc.next().charAt(0);
			System.out.printf("\nColor (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());

			if (choice == 'r') {
				System.out.printf("\nWidth: ");
				double width = sc.nextDouble();
				System.out.printf("\nHeight: ");
				double height = sc.nextDouble();

				listShapes.add(new Rectangle(color, width, height));

			} else if(choice == 'c') {
				System.out.printf("\nRadius: ");
				double radius = sc.nextDouble();

				listShapes.add(new Circle(color, radius));
			}
		}

		System.out.println();

		System.out.printf("\nSHAPE AREAS: \n");
		for (Shape shape : listShapes) {
			System.out.println(String.format("%.2f", shape.area())); // Polimorfismo
		}

		sc.close();

	}

}
