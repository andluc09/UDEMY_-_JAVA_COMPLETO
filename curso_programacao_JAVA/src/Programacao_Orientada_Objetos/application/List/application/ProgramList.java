package Programacao_Orientada_Objetos.application.List.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {

	public static void main(String[] args) {
		
		// List<String> list = new ArrayList<String>(); // Tipo Classe entre <...> opcional nas versões mais atuais do Java
		List<String> list = new ArrayList<String>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("Tamanho da Lista: " + list.size());
		System.out.println("_______________________________");
		System.out.println();
		
		list.add(2, "Marco");
		
		list.remove("Anna");
		
		list.remove(1);
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("Tamanho da Lista: " + list.size());
		System.out.println("_______________________________");
		System.out.println();
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("Tamanho da Lista: " + list.size());
		System.out.println("_______________________________");
		System.out.println();
		
		System.out.println("Index of Bob: " + list.indexOf("Bob")); // Predicato, indexação 
		
		System.out.println();
		System.out.println("Elemento não encontrado:");
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("_______________________________");
		System.out.println();
		
		List<String> listNames = new ArrayList<String>();
		
		listNames.add("Maria");
		listNames.add("Alex");
		listNames.add("Bob");
		listNames.add("Anna");
		
		for (String x : listNames) {
			System.out.println(x);
		}
		
		System.out.println("_______________________________");
		System.out.println();
		
		List<String> result = listNames.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); 
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("_______________________________");
		System.out.println();
		
		// Identificar um Predicato, por meio da primeira ocorrência
		
		System.out.println("Primeira ocorência da incial 'A': ");
		System.out.println();
		String name = result.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // Caso não encontre nenhum elemento, orElse(null) retornará nulo
		System.out.println(name);
	}
	
}
