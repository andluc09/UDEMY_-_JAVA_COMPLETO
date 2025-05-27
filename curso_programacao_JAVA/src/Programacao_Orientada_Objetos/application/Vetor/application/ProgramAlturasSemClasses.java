package Programacao_Orientada_Objetos.application.Vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAlturasSemClasses {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc =new Scanner(System.in);
		
		System.out.printf("%nQuantas pessoas serao digitadas? ");
		
		int num = sc.nextInt();
		
		String[] nomes = new String[num];
		String nomesMaiorDezesseis = "";
		int[] idades = new int[num];
		int cont = 0;
 		double[] alturas = new double[num];
 		double somaAlturas = 0.0;
 		double mediaAlturas = 0.0;
		double porcentagem = 0.0;
 		
 		for (int i = 0; i < num; i++) {
			System.out.printf("%nDados da %dª pessoa: %n", i+1);
			System.out.print("Nome: ");
			
			sc.nextLine();
			nomes[i] = sc.nextLine();
			
			System.out.println();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			
			System.out.println();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
			
			somaAlturas += alturas[i];
			
			if (i == (num - 1)) {
				mediaAlturas = somaAlturas / num;
			}
 		}
 		
		for (int i = 0; i < num; i++) {
			
			if (idades[i] < 16.0) {
				 cont += 1;
				 nomesMaiorDezesseis += nomes[i] + "\n";
			}
			
			if (i == (num - 1)) {
				porcentagem = cont * 100.0 / num;
			}
		}
 		
		System.out.printf("%nAltura média: %.2f", mediaAlturas);
		System.out.printf("%nPessoas com menos de 16 anos: %.1f%%", porcentagem);
		System.out.printf("%n%s", nomesMaiorDezesseis);
		
		sc.close();
	}
}
