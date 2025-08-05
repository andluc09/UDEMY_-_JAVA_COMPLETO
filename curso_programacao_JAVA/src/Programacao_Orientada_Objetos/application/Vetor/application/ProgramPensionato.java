package Programacao_Orientada_Objetos.application.Vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramPensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%nHow many rooms will be rented? ");
		int num = sc.nextInt();
		sc.nextLine();
		
		String roomsRented = "";
		
		String[][] rooms = new String[10][3];
		
		for (int i = 0; i < num; i++) {
			System.out.printf("%nRent #%d:", i+1);
			System.out.printf("%nName: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			
			rooms[room][0] = name; 
			rooms[room][1] = email;
			rooms[room][2] = Integer.toString(room);
		}
		
		System.out.printf("%nBusy rooms: ");
		
		for (int i = 0; i < rooms.length; i++) {
			if(rooms[i][2] != null) {
				roomsRented += rooms[i][2] + ": " + rooms[i][0] + ", " + rooms[i][1] + "\n";
			}
		}
		
		System.out.printf("%n%s", roomsRented);
		
		sc.close(); 
	}
}
