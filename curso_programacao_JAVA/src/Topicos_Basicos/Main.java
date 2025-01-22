import java.util.Locale; // Biblioteca 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y 	     = 32;
		double x     = 10.35784;
		String nome  = "Maria";
		int idade	 = 31;
		double renda = 4000.0;
		
		System.out.print("Olá Mundo!");
		System.out.println("Bom dia!");
		System.out.println("Vamos programar!!");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);                     // printf - Formatado, máscara "%._f%n"
		System.out.printf("%.4f%n", x);                     // printf - Formatado, máscara "%._f%n"
		Locale.setDefault(Locale.US	);                      // mudar formatação de língua, usar ponto no lugar da vírgula
		System.out.printf("%.4f%n", x);                     // printf - Formatado, máscara "%._f%n"
		System.out.println("RESULTADO = " + x + " METROS"); // Concatenação
		System.out.printf("RESULTADO = %.2f metros%n", x);  // Concatenação com formatado, o %n se trata da quebra de linha
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); // %d é de decimal, dados interpolados em uma string 
	}

}
