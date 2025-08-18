package Programacao_Orientada_Objetos.entities.EnumeracoesComposicao.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Programacao_Orientada_Objetos.entities.EnumeracoesComposicao.entities.enums.WorkerLevel;

public class Worker {

	// COMPOSIÇÃO DE OBJETOS
	
	// Atributos da Classe Principal
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	// Associações entre classes
	
	private Department department; // 1 para 1
	// Lista de Contratos - começa vazia e adiciona um contrato via argumento
	private List<HourContract> contracts = new ArrayList<>(); // 1 para N (Têm muitos) ---> Não se cria construtores para Lista!
	
	//___________________________________________________________________________________
	
	// Construtores
	
	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	//___________________________________________________________________________________
	
	// Gets e Sets dos atributos da Classe
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
	//___________________________________________________________________________________
	
	// Métodos da Classe com passagem de argumentos
	
	public void addContract(HourContract contract) { 
		contracts.add(contract); // Adiciona contrato ----> Fazer (Retirar o Set, razão implícita)
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract); // Remover contrato ----> Desfazer (Retirar o Set, razão implícita)
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		
		for (HourContract c : contracts) { // For-Each Loop para Listas<>
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH); // Começa em 0 JANEIRO até 11 DEZEMBRO
			
			if (year == c_year && month == c_month) { // Se o ano e o mês informado for igual aos dados obtidos da Lista realiza a ação do condicional
				sum += c.totalValue();
			}
		}
		return sum; // Valor fracionário
	}

}
