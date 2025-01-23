package Topicos_Basicos;

import java.util.Scanner;

public class Estrutura_Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if
		
		int x = 5;

		System.out.println("Bom dia!");

		if (x < 0) {
			System.out.println("Boa tarde!");
		}

		System.out.println("Boa noite!");
		
		// if - else
		
		Scanner sc = new Scanner(System.in);
		
		int hora, horas;
		
		System.out.printf("%n Quantas horas? %n");
		
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.printf("%n Bom dia !! ");
		}
		else {
			if(hora < 18) { // 12 <= hora && hora < 18
				System.out.printf("%n Boa tarde!! ");
			}
			else {
				System.out.printf("%n Boa noite!! ");
			}
			
		}
		
		// Organização: Mesmo alinhamento!
		
		System.out.printf("%n%n Quantas horas? %n");
		
		horas = sc.nextInt();
		
		if(horas < 12) {
			System.out.printf("%n Bom dia !! ");
		}
		else if(horas < 18) { // 12 <= hora && hora < 18
			System.out.printf("%n Boa tarde!! ");
		}
		else { // else apenas no último!
			System.out.printf("%n Boa noite!! ");
		}
		
		sc.close();		
	}

}
