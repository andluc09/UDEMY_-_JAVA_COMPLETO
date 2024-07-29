package br.com.Meu_projeto;

public class Contateste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta();
		conta.cliente = "André";
		conta.saldo = 4_000.00;
		conta.exibesaldo();
		
		//conta.saque(2000);
		//conta.exibesaldo();
	
		//conta.deposita(8000);
		//conta.exibesaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Lucas";
		destino.saldo = 5_000.00;
		destino.exibesaldo();
	}

}
