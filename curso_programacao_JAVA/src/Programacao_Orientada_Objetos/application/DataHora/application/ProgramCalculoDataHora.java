package Programacao_Orientada_Objetos.application.DataHora.application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class ProgramCalculoDataHora {
	
	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2025-08-03"); // Conversão string para data
		LocalDateTime d05 = LocalDateTime.parse("2025-08-03T01:30:56"); // Conversão string para data
		Instant d06 = Instant.parse("2025-08-03T01:30:56Z"); // Date time Global - Londres
		
		LocalDate pastWeekLocalDate = d04.minusDays(7); // Há várias sobrecargas (-) minus (+) plus
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		LocalDate nextTreeYearsLocalDate = d04.plusYears(3);
		
		System.out.println("LocalDate = " + d04.toString());
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		System.out.println("nextTreeYearsLocalDate = " + nextTreeYearsLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7); // Há várias sobrecargas (-) minus (+) plus
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		LocalDateTime nextTreeYearsLocalDateTime = d05.plusYears(3);
		
		System.out.println("LocalDateTime = " + d05.toString());
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		System.out.println("nextTreeYearsLocalDateTime = " + nextTreeYearsLocalDateTime);
		
		ZonedDateTime zdt = d06.atZone(ZoneId.systemDefault());
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); // Global - Há várias sobrecargas (-) minus (+) plus
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS); // Global
		Instant nextTreeYearsInstant = zdt.plusYears(3).toInstant(); // Global
		
		System.out.println("Instant = " + d06.toString());
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		System.out.println("nextTreeYearsInstant = " + nextTreeYearsInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atTime(0, 0));
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		System.out.println("Duração entre datas, em dias = " + t1.toDays());
		System.out.println("Duração entre datas, em dias = " + t2.toDays());
		System.out.println("Duração entre datas, em dias = " + t3.toDays());
		System.out.println("Duração entre datas, em dias (data posterior - data anterior) = " + t4.toDays());
		
	}
	
}
