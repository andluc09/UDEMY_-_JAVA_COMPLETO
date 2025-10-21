package Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities;

public class Account {
	
	private Integer number;
	private String holder;
	protected Double balance; // Modificador de acesso - altera a visualização pela subclasse
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withdraw(double amount) { // Saque
		balance -= amount + 5.0;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + ", getNumber()="
				+ getNumber() + ", getHolder()=" + getHolder() + ", getBalance()=" + getBalance() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
