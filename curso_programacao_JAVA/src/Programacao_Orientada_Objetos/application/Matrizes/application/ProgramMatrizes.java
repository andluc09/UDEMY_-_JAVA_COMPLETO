package Programacao_Orientada_Objetos.application.Matrizes.application;

import java.util.Scanner;

public class ProgramMatrizes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%nEnter a number:%n");
		
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.printf("%nMain diagonal:%n"); // Diagonal principal
		
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.printf("%n%nNegative numbers = " + count);
		
		sc.close();
	}

}
