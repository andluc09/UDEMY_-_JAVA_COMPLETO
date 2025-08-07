package Programacao_Orientada_Objetos.application.EnumeracoesComposicao.application;

import java.util.Date;

import Programacao_Orientada_Objetos.entities.EnumeracoesComposicao.entities.Order;
import Programacao_Orientada_Objetos.entities.EnumeracoesComposicao.entities.enums.OrderStatus;

public class ProgramEnumeracoes {

	// Documentação: https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
	
	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PEDDING_PAYMENT); // Order Satus criado como ENUM, TIPO enumerado

		System.out.println(order.toString()); // Mesma coisa que System.out.println(order);
		
		//___________________________________________________________________________________
		
		// Conversão de String para enum
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println("ENUM: " + os1); // Status como ENUM
		System.out.println("Conversão String para ENUM: " + os2); // Status String convertida para ENUM
		
	}

}
