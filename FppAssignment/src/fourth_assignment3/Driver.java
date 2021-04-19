package fourth_assignment3;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee[] e=new Employee[5];
		CommissionEmployee ce1=new CommissionEmployee("Rajeev","Thapaliya","611944");
		ce1.setGrossSales(75.4);
		ce1.setCommissionRate(25.5);
		CommissionEmployee ce2=new CommissionEmployee("Saurav","Thapa","611956");
		ce2.setGrossSales(89.7);
		ce2.setCommissionRate(15.8);
		
		HourlyEmployee he=new HourlyEmployee("Sanjay","Karki","624546");
		he.setHours(21.2);
		he.setWage(725.7);
		
		SalariedEmployee se=new SalariedEmployee("Bipin","Karki","624648");
		se.setWeeklySalary(600.0);
		BasePlusCommissionEmployee bce=new BasePlusCommissionEmployee("Aakash","Adhikari","644237");
		bce.setBaseSalary(1025.35);
		
		e[0]=ce1;
		e[1]=ce2;
		e[2]=he;
		e[3]=se;
		e[4]=bce;
		
		double totalSalary=0.0;
		for(Employee x:e) {
			totalSalary+=x.getPayment();
		}
		
		System.out.println("Total Salary of all employee is:"+totalSalary);
		

	}

}
