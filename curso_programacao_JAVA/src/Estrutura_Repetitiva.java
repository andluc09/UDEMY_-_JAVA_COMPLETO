import java.util.Scanner;

public class Estrutura_Repetitiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%n Insira valores, interrompa digitando zero (0): %n");
		
		int x = sc.nextInt();
		int soma = 0;
		
		while(x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.printf("%n Valor acumulado: %d%n", soma);
		sc.close();
	}

}
