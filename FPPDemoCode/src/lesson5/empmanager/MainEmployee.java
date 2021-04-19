package lesson5.empmanager;
public class MainEmployee {
	// Inheritance Example
		public static void main(String[] args) {
			Manager boss = new Manager("Boss Guy", 80000, 2009, 12, 15);
		  boss.setBonus(5000);
		
			Employee[] staff = new Employee[3];

			staff[0] = boss; // Manager Instance
			staff[1] = new Employee("Jimbo", 50000, 2012, 10, 1);
			staff[2] = new Employee("Tommy", 40000, 2013, 3, 15);
		
					// print names and salaries
			for (Employee e : staff) {
				System.out.println("Name: " + e.getName() + "\nSalary: "
						+ e.getSalary() + "\nHire Day :" + e.getHireDay());
			
				// Downcasting
				Employee boss1 = new Manager("Boss Guy", 90000, 2009, 12, 15);
				  ((Manager) boss1).setBonus(5000);
				  System.out.println("Boss 1 Salary : "+boss1.getSalary());
			
			}
		}


}
