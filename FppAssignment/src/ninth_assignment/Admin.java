package ninth_assignment;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key,Student> ks=new HashMap<Key,Student>();
		for(Student s:students) {
			Key k=new Key(s.getFirstName(), s.getLastName());
			ks.put(k,s);
		}
		
		return ks;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
        //implements
		double totalGPA=0.0;
		int count=0;
		Set<Key> keySet= maps.keySet();
		
		for(Key k:keySet) {
			Student s=maps.get(k);
			totalGPA+=s.getGpa();
			count++;
		}
		
		return totalGPA/count;	 		  
}
}
