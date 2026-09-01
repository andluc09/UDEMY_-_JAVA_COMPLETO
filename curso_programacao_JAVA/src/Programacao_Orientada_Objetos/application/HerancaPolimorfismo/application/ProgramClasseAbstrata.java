package Programacao_Orientada_Objetos.application.HerancaPolimorfismo.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.Account;
import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.AccountAbstrata;
import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.BusinessAccount;
import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.SavingsAccount;

public class ProgramClasseAbstrata {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// Instanciação de uma classe abstrata, não é possível:
		
		//AccountAbstrata acc0 = new AccountAbstrata(1001, "Alex", 1000.00);
		Account acc1 = new Account(1001, "Alex", 1000.00);
		AccountAbstrata acc2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
		AccountAbstrata acc3 = new BusinessAccount(1003, "Bob", 1000.00, 500.00);

		List<AccountAbstrata> list = new ArrayList<>(); // Lista - Tipo Genérico
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.00));
		list.add(new SavingsAccount(1004, "Bob", 300.00, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.00, 500.00));
		
		double sum = 0.0;
		
		for (AccountAbstrata acc : list) {
			sum += acc.getBalance();	
		}
		
		System.out.printf("Total balance: %.2f%n", sum);

		for (AccountAbstrata acc : list) {
			acc.deposit(10.0);
		}

		for(AccountAbstrata acc : list) {
			System.out.printf("Update balance for Account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}

}
