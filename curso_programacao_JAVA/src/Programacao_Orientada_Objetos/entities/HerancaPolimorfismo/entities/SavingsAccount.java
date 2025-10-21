package Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities;

public class SavingsAccount extends Account{
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}

	@Override // Sobreposição
	public void withdraw(double amount) { // Saque
		balance -= amount;
	}
	
	@Override
	public String toString() {
		return "SavingsAccount [interestRate=" + interestRate + ", balance=" + balance + ", getInterestRate()="
				+ getInterestRate() + ", getNumber()=" + getNumber() + ", getHolder()=" + getHolder()
				+ ", getBalance()=" + getBalance() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
		
}
