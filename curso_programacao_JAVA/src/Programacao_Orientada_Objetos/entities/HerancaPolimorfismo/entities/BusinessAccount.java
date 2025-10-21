package Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities;

public class BusinessAccount extends Account{
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // super classe - faz sentido, pois está derivando de outra classe) 
		this.loanLimit = loanLimit;
	}

	public Double getLoanlimit() {
		return loanLimit;
	}

	public void setLoanlimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			//deposit(amount);
			balance += amount - 10.0;
		}
	}

	@Override
	public String toString() {
		return "BusinessAccount [loanLimit=" + loanLimit + ", balance=" + balance + ", getLoanlimit()=" + getLoanlimit()
				+ ", getNumber()=" + getNumber() + ", getHolder()=" + getHolder() + ", getBalance()=" + getBalance()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
