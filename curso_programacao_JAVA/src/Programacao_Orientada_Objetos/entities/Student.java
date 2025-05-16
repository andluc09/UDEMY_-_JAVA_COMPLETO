package Programacao_Orientada_Objetos.entities;

public class Student {
	
	public String name;
	public double score1;
	public double score2;
	public double score3;
	
	public double finalAverage() {
		double average = score1 + score2 + score3;
		
		return average;
	}
	
	public double missingPoints() {
		if(finalAverage() < 60.0) {
			return 60.0 - finalAverage();
		}
		else {
			return 0.0;
		}
	}
}
