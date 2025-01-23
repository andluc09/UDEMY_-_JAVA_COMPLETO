package Topicos_Basicos;

import java.util.Scanner;

public class Funcao_Java {
	
	public static void main(String[] args) {
		
		double y = 25.0;
		double x = Math.sqrt(y); // Função é um procedimento que têm um significado! 
								 // Ela pode receber um dado como argumento ou parâmetro —> () ENTRADA
								 // Ela pode ou não retornar uma resposta, neste caso há retorno SAÍDA
		
		System.out.printf("%n Raíz de %.2f é: %.2f %n", y, x); // Simplesmente executa a função de imprimir na tela
		
		// Principais Vantagens:
		/* • Modularização: Dividir o programa em várias partes;
		 * • Delegação: Delega a lógica de calcular/executar alguma coisa a outro lugar 
		 * • Reaproveitamento: Simples chamada da função, a complexidade fica isolada
		 */
		
		// Em orientação a objetos, funções em classes recebem o nome de "métodos"
 
		// Exemplo prático
		
		Scanner sc = new Scanner(System.in);

		System.out.printf("%n Enter three numbers: %n");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		/*if(a > b && a > c) {
			System.out.printf("%n Higher = %d %n", a);
		}else if (b > c) {
			System.out.printf("%n Higher = %d %n", b);
		}else {
			System.out.printf("%n Higher = %d %n", c);
		}*/
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		
		int aux;
		
		if(x > y && x > z) {
			aux = x;
		}else if (y > z) {
			aux = y;
		}else {
			aux= z;
		}
		
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.printf("%n Higher = %d %n", value);
	}
}