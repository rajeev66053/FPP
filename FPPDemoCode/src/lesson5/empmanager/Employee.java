package lesson5.empmanager;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	// instance fields

	private String name;
	private double salary;
	private Date hireDay;

	// constructor
	Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
		name = aName;
		salary = aSalary;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
		hireDay = cal.getTime();
		
	}

	// instance methods
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getHireDay() {
		SimpleDateFormat fmt = new SimpleDateFormat("dd-MMM-yyyy");
        String dateFormatted = fmt.format(hireDay);
		return dateFormatted ;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}
