package Programacao_Orientada_Objetos.application.Vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramNumerosPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%nQuantos numeros voce vai digitar? ");
		int num = sc.nextInt(); 
		
		int[] inteiros = new int[num];
		
		int cont = 0;
		
		String numerosPares = "";
		
		for (int i = 0; i < inteiros.length; i++) {
			System.out.println();
			System.out.print("Digite o " + (i+1) + "º numero: ");
			inteiros[i] = sc.nextInt();
			
			if(inteiros[i] % 2 == 0) {
				numerosPares += Integer.toString(inteiros[i]) + " ";
				cont += 1;
			}
		}
			
		System.out.printf("%nNUMEROS PARES: %n%s", numerosPares);	
		System.out.println();
		System.out.printf("%nQUANTIDADE DE PARES = %d", cont);
		
		sc.close();
	}

}
