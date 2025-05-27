package Programacao_Orientada_Objetos.application.Vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramDadosPessoas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%nQuantas pessoas serao digitadas? ");
		int num = sc.nextInt();
		
		double[] height = new double[num];
		char[] sex = new char[num];
		
		int contM = 0; 
		int contF = 0;
		double sumHeight = 0.0;
		double bigger = 0.0;
		double smaller = bigger;
		
		for (int i = 0; i < num; i++)  {
			System.out.printf("%nAltura da %dª pessoa: ", i+1);
			height[i] = sc.nextDouble();
			System.out.printf("%nGenero da %dª pessoa: ", i+1);
			sex[i] = sc.next().charAt(0);
			
		    if (i == 0) { // No primeiro instante a maior altura e a menor altura serão consideradas às informadas inicialmente
		        bigger = height[i];
		        smaller = height[i];
		    } else {
		        if (height[i] > bigger) {
		            bigger = height[i];
		        }
		        if (height[i] < smaller) {
		            smaller = height[i];
		        }
		    }
			
			if(sex[i] == 'F') { // F - Feminino
				sumHeight += height[i];
				contF++;
			} else if (sex[i] == 'M') { // M - Masculino
				contM++;
			}
		}
		
		System.out.printf("%nMenor altura = %.2f", smaller);
		System.out.printf("%nMaior altura = %.2f", bigger);
		System.out.printf("%nMedia das alturas das mulheres = %.2f", sumHeight/contF);
		System.out.printf("%nNumero de homens = %d", contM);
		
		sc.close();
	}

}
