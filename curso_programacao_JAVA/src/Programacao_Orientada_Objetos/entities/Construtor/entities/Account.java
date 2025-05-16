package Programacao_Orientada_Objetos.entities.Construtor.entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	public Account() { // Construtor padrão
	}
	
	public Account(int number, String holder) { // Construtor com dois argumentos
		this.number = number;
		this.holder = holder;
	}
	
	public Account(int number, String holder, double initialDeposit) { // Construtor com três argumentos
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit); // O saldo da conta está ligado ao depósito, contudo o saldo existe por padrão como 0.00		
	}							 // Portanto os valores retidos são necessariamente depósitos, não quebrando o construtor futuramente

	// Number nunca será alterado permanecendo em estado de visualização normalmente
	
	public int getNumber() { // Pode ser visualizado
		return number;
	}

	// Holder é o único dado que pode ser tanto visualizado como alterado normalmente
	
	public String getHolder() { // Pode ser visualizado
		return holder;
	}

	public void setHolder(String holder) { // Pode ser alterado
		this.holder = holder;
	}

	public double getBalance() { // Pode ser visualizado
		return balance;
	}

	// Métodos que podem alterar especificamente: o balance (saldo)
	
	public void deposit(double amount)	{
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.00;		
	}
	
	public String toString() {
		return "Account "
				+ number 
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
