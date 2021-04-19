package fourth_assignment3;

public class HourlyEmployee extends Employee {
	

	private double wage;
	private double hours;
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	
	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return wage * hours;
	}
	

}
