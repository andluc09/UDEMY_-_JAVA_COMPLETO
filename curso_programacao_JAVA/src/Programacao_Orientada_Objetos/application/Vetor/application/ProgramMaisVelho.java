package Programacao_Orientada_Objetos.application.Vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMaisVelho {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.printf("%nQuantas pessoas voce vai digitar? ");
		int num = sc.nextInt();
		int bigger = 0;
		
		String nameOldestPerson = "";
		
		String[] names = new String[num];
		
		int[] ages = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.printf("%nDados da %dª pessoa: ", i+1);
			sc.nextLine();
			System.out.printf("%nNome: ");
			names[i] = sc.nextLine();
			System.out.printf("Idade: ");
			ages[i] = sc.nextInt();
			
			if (ages[i] >= bigger) {
				bigger = ages[i];
			}
		}
		
		for (int i = 0; i < num; i++) {
			if (bigger == ages[i]) {	
				nameOldestPerson += names[i] + "\n";
			}
		}
		
		System.out.printf("%nPESSOA MAIS VELHA: %n%s", nameOldestPerson);
		
		sc.close();
	}
	
}
