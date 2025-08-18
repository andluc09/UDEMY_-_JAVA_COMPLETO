package Programacao_Orientada_Objetos.application.Matrizes.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMatrizesDinamica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.printf("%nEnter a number of lines: %n");
		
		num1 = sc.nextInt();
		
		System.out.printf("%nEnter a number of columns: %n");
		
		num2 = sc.nextInt();
		
		int mat[][] = new int[num1][num2];
		
		for (int i = 0; i < num1; i++) {
			for (int j = 0; j < num2; j++) {
				
				System.out.printf("%nInsert a number at coordinate [%d] [%d]: %n", i, j);
				
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.printf("%nMatrix: %n");
		
		for (int i = 0; i < num1; i++) {
			for (int j = 0; j < num2; j++) {
				
				System.out.printf("[%d]", mat[i][j]);

			}
			System.out.println();
		} 
		
		int numSearch = 0;
		
		System.out.printf("%nEnter a number to shearch for in the matrix: %n");
		
		numSearch = sc.nextInt();
		
		for (int i = 0; i < num1; i++) {
			for (int j = 0; j < num2; j++) {
				if (numSearch == mat[i][j]) {
					
					System.out.printf("%nPosition %d, %d: %n", i, j);
					
					/*if (j-1 >= 0) { // Limite é a coluna 0
						System.out.printf("%nLeft: [%d] %n", mat[i][j-1]);
					}
					
					if (j+1 < mat[i].length) { // Limite é o tamanho total da linha (ou seja a última coluna)
						System.out.printf("%nRight: [%d] %n", mat[i][j+1]);
					}
					
					if (i-1 >=  0 && j < mat[i-1].length) { // Linha não pode ultrapassar o limite mínimo de 0 e também a coluna têm que ser menor que o tamanho da linha anterior
						System.out.printf("%nUp: [%d] %n", mat[i-1][j]);
					}
					
					if (i+1 < num1 && j < mat[i+1].length) { // Linha não pode ultrpassar o limite máximo de linhas e também a coluna têm que ser menor que o tamanho da linha posterior
						System.out.printf("%nDown: [%d] %n", mat[i+1][j]);
					}*/
					
					if (j > 0) { // Coluna maior que 0
						System.out.println("Left: " + mat[i][j-1]);
					}
					
					if (i > 0) { // Linha maior que 0
						System.out.println("Up: " + mat[i-1][j]);
					}
					
					if (j < mat[i].length-1) { // Coluna menor que o tamanho total daquela linha - 1
						System.out.println("Right: " + mat[i][j+1]);
					}
					
					if (i < mat.length-1) { // Linha é menor que o tamanho total da matriz - 1
						System.out.println("Down: " + mat[i+1][j]);
					}
					
				}
			}
		} 
		
		sc.close();
	}

}
