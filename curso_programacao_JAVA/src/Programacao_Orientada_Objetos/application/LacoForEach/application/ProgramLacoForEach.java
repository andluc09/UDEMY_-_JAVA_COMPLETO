package Programacao_Orientada_Objetos.application.LacoForEach.application;

public class ProgramLacoForEach {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};

		// Laço For - Tradicional
		
		System.out.println("Laço Tradicional: ");
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("_____________________________________________");
		System.out.println();
		
		// Laço For Each - Laço para cada um
		
		System.out.println("Laço For Each: ");
		
		for (String obj : vect) {
			System.out.println(obj);
		}
		
	}

}
