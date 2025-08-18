package Programacao_Orientada_Objetos.application.DataHora.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ProgramDataHoraConversaoString {

	public static void main(String[] args) {
		
		// Documentação: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		LocalDate d04 = LocalDate.parse("2025-08-03"); // Conversão string para data
		LocalDateTime d05 = LocalDateTime.parse("2025-08-03T01:30:56"); // Conversão string para data
		Instant d06 = Instant.parse("2025-08-03T01:30:56Z"); // Date time Global - Londres

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // Date time Global com chamada da Zona de Fuso horário corrente
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;		
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;	
		
		System.out.println("DateTimeFormatter = " + d04.format(fmt1)); // 1ª Primeira forma
		System.out.println("DateTimeFormatter v2 = " + fmt1.format(d04)); // 2ª Segunda forma
		System.out.println("DateTimeFormatter v3 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("DateTimeFormatter v4 = " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(d04));
		
		System.out.println("DateTimeFormatter com horário/ não exibido = " + d05.format(fmt1)); 
		System.out.println("DateTimeFormatter com horário = " + d05.format(fmt2)); 
		
		System.out.println("DateTimeFormatter com horário no formato ISO DATE TIME = " + d05.format(fmt4)); 
		
		System.out.println("DateTimeFormatter Global = " + fmt3.format(d06)); // Date Time - São Paulo
		System.out.println("DateTimeFormatter Global = " + fmt5.format(d06)); // Date Time - Londres		
		System.out.println("DateTimeFormatter Global = " + d06.toString()); // Formato ISO 8601 via toString()
		
	}

}
