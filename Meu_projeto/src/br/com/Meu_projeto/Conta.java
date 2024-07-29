package br.com.Meu_projeto;

public class Conta {

	String cliente;
	double saldo;
	
	void exibesaldo() {
		System.out.println(cliente + " seu saldo é " + saldo);
	}
	
	void saque(double valor) {
		saldo -= valor;
	}
	
	void deposita(double valor) {
		saldo += valor;
	}
	
	void transferenciaVlaor(Conta destino, double valor) {
		this.saque(valor);
		destino.deposita(valor);
	}
}
