package Programacao_Orientada_Objetos.entities;

public class Triangle {
	
	public double a; // ATRIBUTO
	public double b; // ATRIBUTO
	public double c; // ATRIBUTO
	
	public double area() {
		double p = (a + b +c)/2.0;
		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		return result;
	}
}
