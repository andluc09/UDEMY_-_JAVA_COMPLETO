package Programacao_Orientada_Objetos.application.DataHora.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProgramDataHora {

	public static void main(String[] args) {

		// Documentação ORACLE: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Passar um formato customizado
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Formato customizado
		
		LocalDate d01 = LocalDate.now(); // Instanciação
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now(); // Fuso horário de Londres GMT
		
		LocalDate d04 = LocalDate.parse("2025-08-03"); // Conversão string para data
		LocalDateTime d05 = LocalDateTime.parse("2025-08-03T01:30:56"); // Conversão string para data
		Instant d06 = Instant.parse("2025-08-03T01:30:56Z");
		
		Instant d07 = Instant.parse("2025-08-03T01:30:56-03:00"); // Time-Zone diferente do GMT
		
		// Texto Customizado
		
		LocalDate d08 = LocalDate.parse("01/08/2025", fmt1); 
		LocalDateTime d09 = LocalDateTime.parse("01/08/2025 01:30", fmt2);
		LocalDate d10 = LocalDate.parse("01/08/2025", DateTimeFormatter.ofPattern("dd/MM/yyyy")); 
		
		LocalDate d11 = LocalDate.of(2025, 8, 1);
		LocalDateTime d12 = LocalDateTime.of(2025, 8, 1, 01, 33); // Existe várias formas ou sobrecargas de dados a se optar
		
		// DATA HORA - LOCAL x GLOBAL
		
		System.out.println("LocalDate = " + d01.toString());
		System.out.println("LocalDateTime = " + d02.toString());
		System.out.println("Instant Global = " + d03.toString());
		System.out.println("LocalDate parse = " + d04.toString()); // ISO 8601
		System.out.println("LocalDateTime parse = " + d05.toString()); // ISO 8601
		System.out.println("Instant Global parse = " + d06.toString()); // ISO 8601
		System.out.println("Instant Global parse Time Zone diferente = " + d07.toString()); // ISO 8601
		System.out.println("LocalDate Customizado = " + d08.toString()); // ISO 8601
		System.out.println("LocalDateTime Customizado = " + d09.toString()); // ISO 8601
		System.out.println("LocalDate Customizado v2 = " + d10.toString()); // ISO 8601
		System.out.println("LocalDate of = " + d11.toString());
		System.out.println("LocalDateTime of = " + d12.toString());
		
	}

}
