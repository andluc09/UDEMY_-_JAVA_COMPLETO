package Programacao_Orientada_Objetos.application.HerancaPolimorfismo.application;

import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.Account;
import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.BusinessAccount;
import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.SavingsAccount;

public class ProgramUpcasting {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		System.out.println(acc);
		
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING --> Super classe
		
		Account acc1 = bacc;
		System.out.printf("%nSaldo = %.2f%n", acc1.getBalance());
		
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		System.out.printf("%nTitular %s%n", acc2.getHolder());
		
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		System.out.println();
		System.out.println(acc1);
		System.out.println();
		System.out.println(acc2);
		System.out.println();
		System.out.println(acc3);
		
		// DOWNCASTING --> Sub classe
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.printf("%nLoan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.printf("%nUpdate!");
		}
	}

}
