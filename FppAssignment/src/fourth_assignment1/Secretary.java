package fourth_assignment1;

import java.time.LocalDate;
import java.util.Date;

public final class Secretary extends DeptEmployee {
	
	private double overtimeHours;
	
	public Secretary(String name,double salary,LocalDate hireDate) {
		super(name,salary,hireDate);
	}


	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	
	public double computeSalary() {
		
		return super.computeSalary()+12*overtimeHours;
	}
}
