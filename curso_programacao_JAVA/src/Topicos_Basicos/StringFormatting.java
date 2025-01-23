package Topicos_Basicos;

public class StringFormatting{
	
	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();
	
		String s02 = original.toUpperCase();
		
		String s03 = original.trim();
		
		String s04 = original.substring(2);
		
		String s05 = original.substring(2, 9);
		
		String s06 = original.replace('a', 'x');
		
		String s07 = original.replace("abc", "xy");
		
		int i = original.indexOf("bc");
		
		int j = original.lastIndexOf("bc");
				
		System.out.printf("%n Palavra Original: -%s- %n", original);
		
		System.out.printf("%n Palavra Original Minúscula: -%s- %n", s01);
		
		System.out.printf("%n Palavra Original Maiúscula: -%s- %n", s02);
		
		System.out.printf("%n Palavra Original Sem os Espaços em Branco, nas extremidades: -%s- %n", s03);
		
		System.out.printf("%n Palavra Original, a partir da terceira letra (2ª segunda posição): -%s- %n", s04);
		
		System.out.printf("%n Palavra Original, a partir da terceira letra (2ª segunda posição) até a decima letra (9ª nona posição): -%s- %n", s05);

		System.out.printf("%n Palavra Original, substituindo o caractere 'a' por 'x': -%s- %n", s06);

		System.out.printf("%n Palavra Original, substituindo o caractere 'abc' por 'xy': -%s- %n", s07);

		System.out.printf("%n Palavra Original, a primeira ocorrência da string 'bc': %d %n", i);

		System.out.printf("%n Palavra Original, a última ocorrência da string 'bc': %d %n", j);
		
		// Operação Split
		
		String s = "potato apple lemon orange";
		
		System.out.printf("%n Palavra Original: %s %n", s);
		
		String[] vect = s.split(" "); // Declaração de um vetor []
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		String word4 = vect[3];
		
		System.out.printf("%n Primeira palavra: %s %n", word1);
		System.out.printf("%n Segunda palavra: %s %n", word2);
		System.out.printf("%n Terceira palavra: %s %n", word3);
		System.out.printf("%n Quarta palavra: %s %n", word4);

	}
}