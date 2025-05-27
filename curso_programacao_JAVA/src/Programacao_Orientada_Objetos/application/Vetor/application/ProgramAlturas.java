package Programacao_Orientada_Objetos.application.Vetor.application;

import java.util.Locale;
import java.util.Scanner;

import Programacao_Orientada_Objetos.entities.Vetor.entities.People;

public class ProgramAlturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%nQuantas pessoas serao digitadas? ");
		
		int num = sc.nextInt();
		int cont = 0;
		double sumHeight = 0.0;
		double averageHeight = 0.0;
		double percentage = 0.0;
		String names = "";
		
		People[] people = new People[num];
		
		for (int i = 0; i < people.length; i++) {
			System.out.printf("%nDados da %dª pessoa: %n", i+1);
			System.out.print("Nome: ");
			
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			
			System.out.println();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			
			people[i] = new People(name, age, height);
			
			sumHeight += height;
			
			if (i == (people.length - 1)) {
				averageHeight = sumHeight / people.length;
			}
						
		}
				
		for (int i = 0; i < people.length; i++) {
			
			if (people[i].getAge() < 16.0) {
				 cont += 1;
				 names += people[i].getName() + "\n";
			}
			
			if (i == (people.length - 1)) {
				percentage = cont * 100.0 / people.length;
			}
		}
		
		System.out.printf("%nAltura média: %.2f", averageHeight);
		System.out.printf("%nPessoas com menos de 16 anos: %.1f%%", percentage);
		System.out.printf("%n%s", names);
		
		sc.close();
	}

}
