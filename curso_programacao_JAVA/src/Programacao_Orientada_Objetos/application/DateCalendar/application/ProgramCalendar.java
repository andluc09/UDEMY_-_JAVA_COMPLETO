package Programacao_Orientada_Objetos.application.DateCalendar.application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ProgramCalendar {

	public static void main(String[] args) {

		//___________________________________________________________________________________
		
		// Somando uma unidade de tempo
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2025-08-05T15:42:07Z")); // UTC - Londres GMT
		
		System.out.println(sdf.format(d));

		Calendar cal = Calendar.getInstance();
		
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(sdf.format(d)); // Acresentado 4 horas 
		
		cal.add(Calendar.DAY_OF_WEEK, 5);
		d = cal.getTime();
		
		System.out.println(sdf.format(d)); // Acresentado 5 dias 
		
		cal.add(Calendar.MONTH, -4);
		d = cal.getTime();
		
		System.out.println(sdf.format(d)); // Retirando 4 meses 
		
		//___________________________________________________________________________________
		
		// Obtendo uma unidade de tempo 
		
		int hours = cal.get(Calendar.HOUR);
		int hoursDay = cal.get(Calendar.HOUR_OF_DAY);
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH); // Vai de 0 sendo Janeiro até 11 Dezembro
		int year = cal.get(Calendar.YEAR); 
		
		System.out.println("Hours AM/PM: " + hours);
		System.out.println("Hours system 23:99 = " + hoursDay);
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month); 
		System.out.println("Year: " + year);
		
	}

}
