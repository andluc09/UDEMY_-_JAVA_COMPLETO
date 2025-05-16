package Programacao_Orientada_Objetos.application;

import java.util.Locale;
import java.util.Scanner;

import Programacao_Orientada_Objetos.entities.Student;

public class Program_Student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		Student student = new Student();
		
		System.out.println();
		System.out.println("Enter name of student: ");
		student.name = sc.nextLine();
		
		System.out.println();
		System.out.println("Enter the student first quarter score, max score equal thirty: ");
		student.score1 = sc.nextDouble();
		
		System.out.println();
		System.out.println("Enter the student second quarter score, max score equal thirty five: ");
		student.score2 = sc.nextDouble();
		
		System.out.println();
		System.out.println("Enter the student third quarter score, max score equal thirty five: ");
		student.score3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("FINAL GRADE: %.2f %n", student.finalAverage());
		
		if(student.finalAverage() < 60.00) {
			System.out.println();
			System.out.println("FAILED");
			System.out.println();
			System.out.printf("MISSING %.2f POINTS %n", student.missingPoints());
		} else {
			System.out.println();
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
