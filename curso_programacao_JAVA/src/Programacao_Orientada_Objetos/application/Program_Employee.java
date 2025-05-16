package Programacao_Orientada_Objetos.application;

import java.util.Locale;
import java.util.Scanner;

import Programacao_Orientada_Objetos.entities.Employee;

public class Program_Employee {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		
		System.out.println();
		System.out.println("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println();
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		
		employee.increaseSalary(percentage);
		
		System.out.println();	
		System.out.println("Updated data: " + employee);
		
		sc.close();
	}
}
