package seventh_assignment2;

import java.util.Comparator;

public class SalesComparator implements Comparator<Marketting> {

	@Override
	public int compare(Marketting m1, Marketting m2) {
		// TODO Auto-generated method stub
		if(Double.compare(m1.getSalesAmount(), m2.getSalesAmount())!=0){
			return Double.compare(m1.getSalesAmount(), m2.getSalesAmount());
		}else if(m1.getProductName().compareTo(m2.getProductName())!=0) {
			return m1.getProductName().compareTo(m2.getProductName());
		}else {
			return m1.getEmployeeName().compareTo(m2.getEmployeeName());
		}
	}

}

