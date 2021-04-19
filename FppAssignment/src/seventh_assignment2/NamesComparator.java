package seventh_assignment2;

import java.util.Comparator;

public class NamesComparator implements Comparator<Marketting> {

	@Override
	public int compare(Marketting m1, Marketting m2) {
		// TODO Auto-generated method stub
		
			return m1.getEmployeeName().compareTo(m2.getEmployeeName());
	}

}

