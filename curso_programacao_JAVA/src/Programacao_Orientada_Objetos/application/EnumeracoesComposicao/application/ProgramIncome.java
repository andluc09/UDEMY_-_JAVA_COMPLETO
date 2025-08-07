package Programacao_Orientada_Objetos.application.EnumeracoesComposicao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Programacao_Orientada_Objetos.entities.EnumeracoesComposicao.entities.Department;
import Programacao_Orientada_Objetos.entities.EnumeracoesComposicao.entities.HourContract;
import Programacao_Orientada_Objetos.entities.EnumeracoesComposicao.entities.Worker;
import Programacao_Orientada_Objetos.entities.EnumeracoesComposicao.entities.enums.WorkerLevel;

public class ProgramIncome {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter department's name: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter worker data: ");
		System.out.println("Name: ");
		String workerName = sc.nextLine();
		
		System.out.println("Level: ");
		String workerLevel = sc.nextLine();
		
		System.out.println("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		// Objetos na memória:
		
		// Novo objeto do tipo Worker		  // Vem da Lista                               // Vem da Classe Department, associada à classe Worker                 
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.println("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for (int i= 1; i <= n; i++) {
			System.out.printf("%nEnter contract #%d data: ", i);
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			
			// Instanciação do Contrato
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			
			// Realizar a associação entre Contrato e Trabalhador 
			worker.addContract(contract); // Implementação
		}
		
		System.out.printf("%nEnter month and year to calculate income (MM/YYYY): %n");
		
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year =	Integer.parseInt(monthAndYear.substring(3));	
		
		System.out.printf("%nName: %s%n", worker.getName());
		System.out.printf("%nDepartment: %s%n", worker.getDepartment().getName()); // Composição: Pego o Departamento do objeto trabalhador, depois eu através do departamento pego o nome deste
		System.out.printf("%nIncome for %s: %.2f%n", monthAndYear, worker.income(year, month));
		
		sc.close();
	}

}
