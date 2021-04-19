package fourth_assignment1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Professor p0=new Professor("Paul",25000.00,LocalDate.parse("16/08/2016",formatter));
		p0.setNumberOfPublications(10);
		Professor p1=new Professor("Henry",23500.00,LocalDate.parse("16/08/2016",formatter));
		p1.setNumberOfPublications(10);
		Professor p2=new Professor("Tom",20900.00,LocalDate.parse("16/08/2016",formatter));
		p2.setNumberOfPublications(10);
		
		Secretary s0=new Secretary("Henry",19500.00,LocalDate.parse("16/08/2016",formatter));
		s0.setOvertimeHours(200);
		Secretary s1=new Secretary("Tom",18900.00,LocalDate.parse("16/08/2016",formatter));
		s1.setOvertimeHours(200);

		DeptEmployee[]  department=  new DeptEmployee[]{p0,p1,p2,s0,s1};
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want  to see the sum of all Professor and Secretary salary? Press \"Y\" for yes and \"N\" for no.");
		String s=sc.next();
		sc.close();
		
		if(s.equalsIgnoreCase("Y")) {
			System.out.printf("Sum total salary of department is %f",sumSalaryOfDepartment(department));
		}else {

			System.out.println("Sorry please try again later.");
		}

	}
	
	public static double sumSalaryOfDepartment(DeptEmployee[] department) {
		
		double salary=0.0;
		for(DeptEmployee d:department) {
			salary+=d.computeSalary();
		}
		return salary;
	}

}
