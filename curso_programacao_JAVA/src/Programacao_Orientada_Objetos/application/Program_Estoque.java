package Programacao_Orientada_Objetos.application;

import java.util.Locale;
import java.util.Scanner;

import Programacao_Orientada_Objetos.entities.Product;

public class Program_Estoque {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();
		
		System.out.printf("%n Enter product data: %n");
		System.out.printf("%n Enter name: %n");
		product.name = sc.nextLine();
		System.out.printf("%n Name: %s %n", product.name);
		System.out.printf("%n Enter price: %n");
		product.price = sc.nextDouble();
		System.out.printf("%n Price: %.2f %n", product.price);
		System.out.printf("%n Enter quantity: %n");
		product.quantity = sc.nextInt();
		System.out.printf("%n Quantity in stock: %d %n", product.quantity);

		System.out.printf("%n %s - %.2f - %d %n", product.name, product.price, product.quantity);

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
