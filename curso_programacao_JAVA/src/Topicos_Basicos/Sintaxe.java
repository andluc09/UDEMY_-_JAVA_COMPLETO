import java.util.Locale;
import java.util.Scanner;

public class Sintaxe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

// Operador de Atribuição Cumulativa		
		
		System.out.printf("%n Insira a quantidade de minutos consumido: %n");

		int minutos = sc.nextInt();

		double conta = 50.00;

		if (minutos > 100) {
			conta += ((minutos - 100) * 2.0);
		}
		
		System.out.printf("%n Valor da conta = R$  %.2f%n", conta);

// Switch-Case
		
		System.out.printf("%n Insira um número: %n");
		
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabádo";
			break;
		default:
			dia = "Valor inválido!";
			break;
		}
		
		System.out.printf("%n Dia da semana: %s%n", dia);
		
		sc.close();
	}

}
