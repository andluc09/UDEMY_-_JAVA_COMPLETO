package Topicos_Basicos;

import java.util.Locale;
import java.util.Scanner;

public class expressao_condicional_ternaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  Sintaxe:
		//	( condição ) ? valor_se_verdadeiro : valor_se_falso
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto;
		
		if (preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
		
		System.out.printf("%n Desconto: %.2f%n", desconto);
		
		double descontoternaria = (preco < 20.0) ? preco * 0.1 : preco * 0.05; // Uma única linha!
		
		System.out.printf("%n Desconto Condição Ternaria: %.2f%n", descontoternaria); 
		
		sc.close();
	}

}
