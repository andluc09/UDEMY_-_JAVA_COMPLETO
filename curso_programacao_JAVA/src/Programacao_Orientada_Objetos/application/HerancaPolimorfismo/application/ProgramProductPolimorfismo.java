package Programacao_Orientada_Objetos.application.HerancaPolimorfismo.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.ImportedProduct;
import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.Product;
import Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities.UsedProduct;

public class ProgramProductPolimorfismo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in); 
		
		List<Product> list = new ArrayList<>();
		
		/*Product product = new Product("Notebook", 1100.00);
		
		System.out.print(product.priceTag());
		
		ImportedProduct importedProduct = new ImportedProduct("Tablet", 260.00, 20.00);

		System.out.println();
		System.out.print(importedProduct.priceTag());
		
		UsedProduct usedProduct = new UsedProduct("Iphone", 400.00,  LocalDate.of(2017, 03, 15));

		System.out.println();
		System.out.print(usedProduct.priceTag());*/
		
		System.out.print(" Enter the number of products: ");
		int num = sc.nextInt();
		
		for (int i=1; i <= num; i++) {
			
			System.out.printf("%nProduct #%d data: %n", i);
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (type == 'c') {
				list.add(new Product(name, price));
			}
			else if (type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			}
			else {
				System.out.print("Customs fee: ");
				double custmosFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, custmosFee));
			}
			
		}
		
		System.out.printf("%nPRICE TAGS: %n");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}

}
