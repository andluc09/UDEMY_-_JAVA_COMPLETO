package Programacao_Orientada_Objetos.application.EnumeracoesComposicao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Programacao_Orientada_Objetos.entities.EnumeracoesComposicao.entities.Client;
import Programacao_Orientada_Objetos.entities.EnumeracoesComposicao.entities.OrderExercicio;
import Programacao_Orientada_Objetos.entities.EnumeracoesComposicao.entities.OrderItem;
import Programacao_Orientada_Objetos.entities.EnumeracoesComposicao.entities.Product;
import Programacao_Orientada_Objetos.entities.EnumeracoesComposicao.entities.enums.OrderStatus;

public class ProgramOrderSummary {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); // Instanciação
		
		System.out.printf("%nEnter cliente data: %n%n");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthdateText = sc.nextLine();
		
		Date birthdate = sdf1.parse(birthdateText);
		
		Client client = new Client(name, email, birthdate);
		
		System.out.printf("%nEnter order data: %n%n");
		
		System.out.print("Status: ");
		String status = sc.nextLine();
				
		System.out.print("How many items to this order? ");
		int quantityItem = sc.nextInt();
		
		Date dateOrder = new Date(); 
		
		OrderExercicio order = new OrderExercicio(dateOrder, OrderStatus.valueOf(status), client);
		
		for (int i = 1; i <= quantityItem; i++) {
			System.out.printf("%nEnter #%d item data: %n%n", i);
			System.out.print("Product name: ");
			String productName = sc.next();
			sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			
			Product product = new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			Integer productQuantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
			
			order.addItem(orderItem);
		}
		
		System.out.printf("%n%s", order);
		
		sc.close();
	}

}
