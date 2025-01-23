package Topicos_Basicos;

public class StringFormatting{
	
	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();
		
		System.out.printf("%n Palavra Original: %s %n", original);
		
		System.out.printf("%n Palavra Original Minúscula: %s %n", s01);
		
	}
}