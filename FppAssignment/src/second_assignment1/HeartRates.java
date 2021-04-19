package second_assignment1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HeartRates {
	
	private static String firstName;
	private static String lastName;
	private static LocalDate dateOfBirth;
	
	private static final int RHR=70;
	private static final double LB=0.5;
	private static final double UB=0.85;

	
	public HeartRates(String firstname, String lastname, LocalDate DOB) {
		firstName=firstname;
		lastName=lastname;
		dateOfBirth=DOB;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstname) {
		firstName=firstname;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastname) {
		lastName=lastname;
	}
	
	public LocalDate getDOB() {
		return dateOfBirth;
	}
	
	public void setDOB(LocalDate dateOfBirth) {
		this.dateOfBirth=dateOfBirth;
	}
	
	public int  calculateAge() {
		LocalDate today = LocalDate.now();
		Period age= Period.between(dateOfBirth, today); // Return periods as Year, Month and Days
		return  age.getYears();
        
	}
	
	public int calculateMHR() {
		return (220 - calculateAge());
	}

	
	public void calculateTHRR() {
		double AHR = calculateMHR()  - RHR;
		double LBTHR=(AHR*LB) + RHR;
		double UBTHR=(AHR*UB) + RHR;
		System.out.println("The Target Heart Rate Range is between "+LBTHR+" and :"+UBTHR);
		
	}
	
	
	@Override
	public String toString() {
		return "First Name :"+this.getFirstName()+
				"\nLast Name :"+this.getLastName()+
				"\nDOB :"+this.getDOB()+
				"\nAge :"+calculateAge() +
				"\nMaximum Heart Rate :"+calculateMHR();
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your first name:");
		String fname=sc.nextLine();
		System.out.println("Please enter your last name:");
		String lname=sc.nextLine();

		LocalDate dateOfBirth = null;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
		while (true) {
			System.out.println("Please, enter your birth date in the format-(yyyy-mm-dd)-Example 1989-4-14");
			try {
				String input = sc.nextLine();
				dateOfBirth = LocalDate.parse(input, formatter);
				break;
			} catch (Exception e) {
				System.out.println("Error!, Invalid birth date try again!");
			}
		}	
		
		sc.close();
		
		HeartRates hr=new HeartRates(fname,lname,dateOfBirth);
		hr.calculateTHRR();		
		System.out.println(hr);
	
	}
	
	

}
