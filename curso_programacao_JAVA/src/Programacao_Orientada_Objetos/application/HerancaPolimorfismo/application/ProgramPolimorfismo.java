package Programacao_Orientada_Objetos.application.HerancaPolimorfismo.application;

import java.util.Locale;

import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.Account;
import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.AccountAbstrata;
import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.SavingsAccount;

public class ProgramPolimorfismo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// POLIMORFISMO
		
		Account x = new Account(1020, "Alex", 1000.00);
		AccountAbstrata y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println("Saque Account: " + x.getBalance() + " (descontado a taxa de 5.00)");
		System.out.printf("%nSaque Savings Account: %.2f", y.getBalance());
	}
	
}
