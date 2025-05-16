package Programacao_Orientada_Objetos.entities.Membros_Estaticos.util;

public class Calculator {
	
	public static final double PI = 3.14159; // declaração de uma constante:  public static final
	
	public static double circumference(double radius) {
		return 2.00 * PI * radius;
	}

	public static double volume(double radius) {
		return (4.00 * PI * radius * radius * radius) / 3.00;
	}

}
