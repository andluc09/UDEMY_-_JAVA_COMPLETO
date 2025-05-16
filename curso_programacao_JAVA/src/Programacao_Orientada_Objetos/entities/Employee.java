package Programacao_Orientada_Objetos.entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		double salary = grossSalary - tax;
		
		return salary;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.00;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}