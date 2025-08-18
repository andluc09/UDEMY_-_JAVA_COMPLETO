package Programacao_Orientada_Objetos.application.EnumeracoesComposicao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Programacao_Orientada_Objetos.entities.EnumeracoesComposicao.entities.Comment;
import Programacao_Orientada_Objetos.entities.EnumeracoesComposicao.entities.Post;

public class ProgramPost {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!"); 
		Comment c2 = new Comment("Wow that's awesome!");
		
		Post p1 = new Post(
				sdf.parse("06/08/2025 13:05:44"), 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 
				12);

		//___________________________________________________________________________________
		
		// Adicionando comentários ao Post
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
		//___________________________________________________________________________________
		
		Comment c3 = new Comment("Good night!"); 
		Comment c4 = new Comment("May the Force be with you!!");
		
		Post p2 = new Post(
				sdf.parse("09/08/2025 23:15:19"), 
				"Good night guys", 
				"See you tommorrow!", 
				5);

		//___________________________________________________________________________________
		
		// Adicionando comentários ao Post
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p2);
		
		
	}

}
