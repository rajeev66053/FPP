package fourth_assignment3;

public class BasePlusCommissionEmployee extends CommissionEmployee {

	private double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);	}

		
	public double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return baseSalary + (this.getGrossSales() * this.getCommissionRate());
	}
}
