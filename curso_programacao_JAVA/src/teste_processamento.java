import java.util.Locale;

public class teste_processamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int x, y;
		int x;
		double y;
		
		x = 5;
		
		y = 2 * x;
				
	    System.out.println(x);
		System.out.println(y);
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B)/ 2.0 * h;
		
		Locale.setDefault(Locale.US);
		System.out.println();
		System.out.printf("Área: %.2f%n",area);
		
		int a, c;
		double resultado;
		
		a = 5;
		c = 2;
		
		resultado = a/c;
		
		System.out.printf("%n" + resultado + "%n" ); // Não deu 2.5 e sim 2.0 (expressão com números inteiros)
		
		resultado = (double) a/c;
		
		System.out.printf("%n" + resultado + "%n");
		
		double z;
		int w;
		
		z = 5.0;
		w = (int) z; // Casting ou fundição, não importa as casas decimais entre os tipos de dados
		
		System.out.printf("%n" + w);
	}

}
