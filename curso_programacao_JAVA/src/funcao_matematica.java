
public class funcao_matematica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println();
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println();
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println();
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);

		// Triângulo Retângulo
		
		double delta, x1, x2;
		double a = 5.90;
		double b = 9.0;
		double c = 2.45;
		
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		
		System.out.printf("%n Delta: %.2f%n", delta);
		
		x1 = (-b + Math.sqrt(delta))/(2.0*a);
		System.out.printf("%nX1: %.2f%n", x1);
		
		x2 = (-b - Math.sqrt(delta))/(2.0*a);
		System.out.printf("%nX2: %.2f%n", x2);
	}

}
