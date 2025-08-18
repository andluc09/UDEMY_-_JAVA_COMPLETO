package Programacao_Orientada_Objetos.application.DataHora.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ProgramDataHoraLocalParaGlobal {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2025-08-03"); // Conversão string para data
		LocalDateTime d05 = LocalDateTime.parse("2025-08-03T01:30:56"); // Conversão string para data
		Instant d06 = Instant.parse("2025-08-03T01:30:56Z"); // Date time Global - Londres

		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("Data Região Local: " + r1); // Londres —> São Paulo
		System.out.println("Data Região Portugal: " + r2); // Londres —> Portugal
		System.out.println("Data Horário Região Local: " + r3); // Londres —> São Paulo
		System.out.println("Data Horário Região Portugal: " + r4); // Londres —> Portugal
		
		System.out.println("Local Date, dia do mês = " + d04.getDayOfMonth());
		System.out.println("Local Date, mês numérico = " + d04.getMonthValue());
		System.out.println("Local Date, ano = " + d04.getYear());
		
		System.out.println("Local Date, hora = " + d05.getHour());
		System.out.println("Local Date, minuto = " + d05.getMinute());
		System.out.println("Local Date, segundo = " + d05.getSecond());
		
		/*for (String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}*/ // Listar todos os Zone IDs
		
	}

}
