package Programacao_Orientada_Objetos.application.Construtor.application;

import java.util.Locale;
import java.util.Scanner;

import Programacao_Orientada_Objetos.entities.Construtor.entities.Product;

public class Program_Estoque {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Product product = new Product(); // Contrutores não se instância antes à
		// classe

		// Product p = new Product(); // Construtor Padrão da Classe

		/*
		 * System.out.println(product.name); System.out.println(product.price);
		 * System.out.println(product.quantity);
		 */

		System.out.printf("%n Enter product data: %n");
		System.out.printf("%n Enter name: %n");
		String name = sc.nextLine();
		System.out.printf("%n Name: %s %n", name);
		System.out.printf("%n Enter price: %n");
		double price = sc.nextDouble();
		System.out.printf("%n Price: %.2f %n", price);
		/*
		 * System.out.printf("%n Enter quantity: %n"); int quantity = sc.nextInt();
		 * System.out.printf("%n Quantity in stock: %d %n", quantity);
		 */

		// Product product = new Product(name, price, quantity);
		Product product = new Product(name, price);

		System.out.println();
		product.setName("Computer");
		System.out.println("Update name: " + product.getName());

		System.out.println();
		product.setPrice(1200.00);
		System.out.println("Update price: " + product.getPrice());

		// System.out.printf("%n %s - %.2f - %d %n", product.name, product.price,
		// product.quantity);
		System.out.printf("%n %s - %.2f %n", product.getName(), product.getPrice());

		System.out.println();
		System.out.println("Product data: " + product); // = System.out.println(product.toString());
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");

		int quantity = sc.nextInt();

		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");

		quantity = sc.nextInt();

		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();
	}

}
