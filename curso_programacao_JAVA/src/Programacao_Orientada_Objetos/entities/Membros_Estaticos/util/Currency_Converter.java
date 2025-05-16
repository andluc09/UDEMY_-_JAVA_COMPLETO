package Programacao_Orientada_Objetos.entities.Membros_Estaticos.util;

public class Currency_Converter {

	public static final double IOF = 0.06; // declaração de uma constante:  public static final
	
	public static double dollarToReal(double amount, double dollarPrice) {
		return amount * dollarPrice * (1.0 + IOF); // Conforme o exemplo: 1.06
	}
	
}
