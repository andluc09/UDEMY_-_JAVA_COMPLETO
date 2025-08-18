package Programacao_Orientada_Objetos.application.BoxingUnboxing.application;

public class ProgramExample {

	public static void main(String[] args) {
		
		int x = 20;
		
		Object obj = x; // Boxing ---> Encaixotamento
		
		System.out.println("Boxing: ");
		System.out.println(obj);
		System.out.println();
		
		int y = (int) obj; // Casting – especificar o tipo da variável
		
		System.out.println("Unboxing: ");		
		System.out.println(y);
		System.out.println();
		
		// Wrapper Classes - Particularidade do Java (Onde tenho um hiper classe associado a um tipo de variável)
		// Tipos referência (classes) aceitam valor null e usufruem dos recursos Orientação a Objetos 
		
		System.out.println("Wrapper: ");		
		System.out.println();
		
		Integer objWrapper = x; // Boxing ---> Encaixotamento
		
		System.out.println("Boxing: ");
		System.out.println(obj);
		System.out.println();
		
		int yWrapper = objWrapper * 2; // Casting – especificar o tipo da variável 
		
		System.out.println("Unboxing: ");		
		System.out.println(yWrapper);
 
	}

}
