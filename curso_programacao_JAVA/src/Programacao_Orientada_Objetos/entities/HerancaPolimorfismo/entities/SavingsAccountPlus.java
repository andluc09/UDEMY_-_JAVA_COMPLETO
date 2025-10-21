package Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities;

public class SavingsAccountPlus extends SavingsAccount { // A palavra final impede de herdar da classe 

	// EXEMPLO - MÉTODO FINAL
	
	@Override // Sobreposição
	public void withdraw(double amount) { // Saque
		balance -= amount + 2.0;
	}
	
}
