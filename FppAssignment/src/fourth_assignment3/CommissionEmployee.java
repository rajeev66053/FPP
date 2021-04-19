package fourth_assignment3;

public class CommissionEmployee extends Employee {

		private double grossSales;
		private double commissionRate;

		public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber) {
			super(firstName, lastName, socialSecurityNumber);
		}
		
		public double getGrossSales() {
			return grossSales;
		}



		public void setGrossSales(double grossSales) {
			this.grossSales = grossSales;
		}



		public double getCommissionRate() {
			return commissionRate;
		}



		public void setCommissionRate(double commissionRate) {
			this.commissionRate = commissionRate;
		}
		
		
		@Override
		public double getPayment() {
			// TODO Auto-generated method stub
			return grossSales * commissionRate;
		}
}
