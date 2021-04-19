package mypackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i = 0; i < n; ++i){
			for(int j = 0; j < n; ++j){
			System.out.printf("%-3s","*");
			}
			System.out.println();
			}
		
		for(int i = 0; i < n; ++i){
			for(int j = 0; j <= i; ++j){
			System.out.printf("%-3s","*");
			}
			System.out.println();
			}
		LocalDate d=localDateForString("11/27/2020");
		
		System.out.println("Local Date :"+d);
		

		String sd=localDateAsString(d);
		System.out.println("Date string :"+sd);
		
		


	}
	
	// Formatting LocalDates as strings and reading date strings as LocalDates

	public static final String DATE_PATTERN = "MM/dd/yyyy";
	public static LocalDate localDateForString(String date) {
	return LocalDate.parse(date,
	DateTimeFormatter.ofPattern(DATE_PATTERN));
	}
	public static String localDateAsString(LocalDate date) {
	return date.format
	(DateTimeFormatter.ofPattern(DATE_PATTERN));
	}
	
	////LocalDate <--> GregorianCalendar conversions
	public static LocalDate
	LocalDateFromGregCalendar(GregorianCalendar cal) {
		return LocalDate.of(cal.get(Calendar.YEAR), 1 +
		cal.get(Calendar.MONTH),
		cal.get(Calendar.DATE));
	}
	public static GregorianCalendar
	GregorianCalendarFromLocalDate(LocalDate locDate) {
		return new GregorianCalendar(locDate.getYear(),
		locDate.getMonth().getValue()-1,
		locDate.getDayOfMonth());
	}

}
