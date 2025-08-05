package Programacao_Orientada_Objetos.application.DateCalendar.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class ProgramDate {

	public static void main(String[] args) throws ParseException {
		
		// Documentação: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Date.html
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); // Instanciação
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date(); // Data e horário local
		Date x2 = new Date(System.currentTimeMillis()); // Coleta o tempo em milisegundos
		Date x3 = new Date(0L); // Coleta o tempo em milisegundos
		Date x4 = new Date(1000L * 60L * 60L * 3L); // Coleta o tempo em milisegundos
		
		Date y1 = sdf1.parse("01/08/2025");
		Date y2 = sdf2.parse("01/08/2025 15:40:07");
		Date y3 = Date.from(Instant.parse("2025-08-01T15:40:07Z"));
		
		System.out.println("SimpleDateFormat = " + y1); 
		System.out.println("SimpleDateFormat = " + y2);
		
		System.out.println("-------------------------------------");
		System.out.println("SimpleDateFormat = " + x1); 
		System.out.println("SimpleDateFormat v2 = " + x2);
		System.out.println("SimpleDateFormat v3 = " + x3); // Fuso horário de São Paulo para a data padrão do Java 01/01/1970 00:00 meia noite
		System.out.println("SimpleDateFormat v4 = " + x4); // Londres - Horário padrão GMT
		System.out.println("SimpleDateFormat = " + y1); 
		System.out.println("SimpleDateFormat = " + y2);
		System.out.println("Date Instant UTC = " + y3); // Horário UTC 
		System.out.println("-------------------------------------");
		System.out.println("SimpleDateFormat = " + sdf2.format(x1)); 
		System.out.println("SimpleDateFormat v2 = " + sdf2.format(x2));
		System.out.println("SimpleDateFormat v3 = " + sdf2.format(x3)); // Fuso horário de São Paulo para a data padrão do Java 01/01/1970 00:00 meia noite
		System.out.println("SimpleDateFormat v4 = " + sdf2.format(x4)); // Londres - Horário padrão GMT
		System.out.println("SimpleDateFormat = " + sdf1.format(y1)); 
		System.out.println("SimpleDateFormat = " + sdf2.format(y2));
		System.out.println("Date Instant UTC = " + sdf2.format(y3)); // Horário UTC 
		System.out.println("-------------------------------------");
		System.out.println("SimpleDateFormat = " + sdf3.format(x1)); // GMT
		System.out.println("SimpleDateFormat v2 = " + sdf3.format(x2)); // GMT
		System.out.println("SimpleDateFormat v3 = " + sdf3.format(x3)); // GMT Fuso horário de São Paulo para a data padrão do Java 01/01/1970 00:00 meia noite
		System.out.println("SimpleDateFormat v4 = " + sdf3.format(x4)); // GMT Londres - Horário padrão GMT
		System.out.println("SimpleDateFormat = " + sdf3.format(y1)); // GMT
		System.out.println("SimpleDateFormat = " + sdf3.format(y2)); // GMT
		System.out.println("Date Instant GMT = " + sdf3.format(y3)); // Horário GMT 
	 
	}

}
