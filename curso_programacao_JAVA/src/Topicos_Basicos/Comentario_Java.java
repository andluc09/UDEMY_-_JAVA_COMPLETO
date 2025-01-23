package Topicos_Basicos;

import java.util.Locale;
import java.util.Scanner;

	/*
	Este programa calcula as raízes de uma equação do segundo grau 
	Os valores dos coeficientes devem ser digitados um por linha
	*/
	
public class Comentario_Java {
	
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	
	Scanner sc = new Scanner(System.in);
	
	double a, b, c, delta;
	
	System.out.printf("%n Digite os valores dos três coeficientes: %n");
	a = sc.nextDouble();
	b = sc.nextDouble();
	c = sc.nextDouble();

	delta = b * b - 4 * a * c; // cálculo do valor de delta
	
	System.out.printf("%n Valor do Delta: %.2f %n", delta);
	
	sc.close();
	
	}
}
