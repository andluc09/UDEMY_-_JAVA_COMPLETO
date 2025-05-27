package Programacao_Orientada_Objetos.application.Vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAprovados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
				
		System.out.printf("%nQuantos alunos serao digitados? ");
		int num = sc.nextInt();
		sc.nextLine();
		
		String namesApproved = "";
		
		String[] names = new String[num];
		double[][] notes = new double[num][3];
		
		for (int i = 0; i < names.length; i++) {
			System.out.printf("%nDigite nome, primeira e segunda nota do %dº aluno: %n", i+1);
			names[i] = sc.nextLine();
			notes[i][0] = sc.nextDouble();
			notes[i][1] = sc.nextDouble();
			notes[i][2] = ( notes[i][0] + notes[i][1] ) / 2.0;
			sc.nextLine(); 
			
			if (notes[i][2] >= 6.0) {
				namesApproved += names[i] + "\n";
			}
		}
		
		System.out.printf("%nAlunos aprovados: %n%s", namesApproved);
		
		sc.close();
	}
}
