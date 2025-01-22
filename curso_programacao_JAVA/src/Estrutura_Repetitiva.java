import java.util.Scanner;

public class Estrutura_Repetitiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ENQUANTO - WHILE
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%n Insira valores, interrompa digitando zero (0): %n");
		
		int x = sc.nextInt();
		int soma = 0;
		
		while(x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.printf("%n Valor acumulado: %d%n", soma);
		
		// PARA - FOR
		
		System.out.printf("%n Insira uma quantidade de repetições: ");
		
		int n = sc.nextInt();
		int adicao = 0;
		
		for(int i = 0; i < n; i++) {
			int z = sc.nextInt();
			adicao = adicao + z;
		}
		
		System.out.printf("%n Soma: %d %n", adicao);
		
		System.out.printf("%n Contagem Crescente: %n");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Valor de i: " + i);
		}
		
		System.out.printf("%n Contagem Decrescente: %n");
		
		for(int i = 4; i >= 0; i--) {
			System.out.println("Valor de i: " + i);
		}
		
		sc.close();
	}

}
