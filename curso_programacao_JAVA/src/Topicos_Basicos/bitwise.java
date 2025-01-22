import java.util.Scanner;

public class bitwise {
	
	public static void main(String[] args) {
		
		// Programação de Baixo Nível
		
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		// Exemplo prático
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000;
		
		System.out.printf("%n Insira um número para verificar se o sexto bit é 1: %n");
		int n = sc.nextInt();
		
		if((n & mask) != 0) {
			System.out.printf("%n 6th bit is true! %n");
		}else {
			System.out.printf("%n 6th bit is false! %n");
		}
		
		sc.close();
	}
	
}
