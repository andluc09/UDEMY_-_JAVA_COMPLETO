package Programacao_Orientada_Objetos.application.Construtor.application;

import java.util.Locale;
import java.util.Scanner;

import Programacao_Orientada_Objetos.entities.Construtor.entities.Account;

public class Program_Account {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);

		Account account;
		
		System.out.printf("%nEnter account number: %n");
		int number = sc.nextInt();
		
		System.out.printf("%nEnter account holder: %n");
		sc.nextLine(); // Consumir a quebra de linha pendente do scanner,nextInt();
		String holder = sc.nextLine();
		
		System.out.println();
		System.out.println("Is there na initial deposit (y/n)? ");
		char response  = sc.next().charAt(0); // Caractere ('')
		
		if(response == 'y') {
			System.out.printf("%nEnter initial deposit value: %n");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit); // Todos os dados da minha conta
		} else {
			account = new Account(number, holder); // Sobrecarga dois argumentos
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		
		account.deposit(depositValue);
		
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		
		account.withdraw(withdrawValue);
		
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
	}

}
