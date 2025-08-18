package Programacao_Orientada_Objetos.application.List.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Programacao_Orientada_Objetos.entities.List.entities.Employee;

public class ProgramListEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<Employee>(); // List with generics - Lista do tipo <Funcionário>
		
		System.out.printf("%nHow many employees will be registered? ");
		int num = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= num; i++) {
			System.out.printf("%nEmplyoee #%d: ", i);
			System.out.printf("%nId: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			while (hasId(list, id)) {
				System.out.printf("%nID already taken! Try again: ");
				id = sc.nextInt();
				sc.nextLine();
			}
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary));
		}
		
		System.out.printf("%nEnter the employee id that will have salary increase: ");
		int numEmployee = sc.nextInt();
		sc.nextLine();
		
		// Integer pos = positionId(list, numEmployee);
		Employee emp = list.stream().filter(x -> x.getId() == numEmployee).findFirst().orElse(null);
		
		if (emp == null) { // (pos == null)
			System.out.printf("%nThis ID does not exist!%n");
		} else {
			System.out.printf("%nEnter the percentage: ");
			double percentage = sc.nextDouble();
						
			emp.increaseSalary(percentage);
		}
		
		System.out.printf("%nList of employees: %n");
		for (Employee obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}
	
	public static Integer positionId(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
