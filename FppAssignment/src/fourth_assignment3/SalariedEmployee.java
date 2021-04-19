package fourth_assignment3;

public class SalariedEmployee extends Employee {
	

	private double weeklySalary;
	
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
	}	
	

	public double getWeeklySalary() {
		return weeklySalary;
	}


	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return weeklySalary;
	}
}
