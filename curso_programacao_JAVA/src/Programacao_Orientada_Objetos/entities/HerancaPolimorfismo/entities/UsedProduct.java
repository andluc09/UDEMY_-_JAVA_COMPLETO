package Programacao_Orientada_Objetos.entities.HerancaPolimorfismo.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {

	private LocalDate manufactureDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price) {
		super(name, price);
	}

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return super.getName() 
				+ " (used) $ " 
				+ String.format("%.2f", super.getPrice())
				+ " (Manufacture date: "
				+ manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
	}
	
}
