package Programacao_Orientada_Objetos.application.HerancaPolimorfismo.application;

import java.util.Locale;

import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.Account;
import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.BusinessAccount;
import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.SavingsAccount;

public class ProgramSobreposicao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		// SOBREPOSIÇÃO
		
		Account acc1 = new Account(1001, "Alex", 1000.0); // Alterado método de Saque (withdraw)
		
		acc1.withdraw(200.0);
		System.out.println("Saque utilizando a classe Account: " + acc1.getBalance());
	
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.printf("%nSaque utilizando a classe SavingsAccount: %.2f%n", acc2.getBalance());
	
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.printf("%nSaque utilizando a classe BusinessAccount: %.2f", acc3.getBalance());
	}

}
