package Programacao_Orientada_Objetos.application.Vetor.application;

import java.util.Locale;
import java.util.Scanner;

import Programacao_Orientada_Objetos.entities.Vetor.entities.Rent;

public class ProgramPensionatoComClasse {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//Rent r = new Rent("Maria", "maria@gmail.com");
		
		Rent[] rooms = new Rent[10];
		
		System.out.printf("%nHow many rooms will be rented? ");
		int n =  sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= n; i++)	{
			System.out.printf("%nRent #%d:", i);
			System.out.printf("%nName: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			sc.nextLine();
			
			Rent rent = new Rent(name,email);
			
			rooms[roomNumber] = rent;
		}
		
		System.out.printf("%nBusy rooms: %n");
		
		for (int i = 0; i < rooms.length; i++) {
			if(rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
			}
		}
		
		sc.close();
	}
	
}
