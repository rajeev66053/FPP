package lesson8.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lesson8.listapi.Apple;

public class Iterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Apple1> alist = new ArrayList<>();
		alist.add(new Apple1());
		 alist.add(new Apple1("Green",2.3,1.5));
		 alist.add(new Apple1("Yellow",2.5,1.2));
		 alist.add(new Apple1("Gold",1.5,2.2));
		 alist.add(new Apple1("Gold",1.5,2.7));
		 System.out.println(alist);
		 // Task : Print the list of Apples which starts with "G"
		 // Regular index based approach
		 System.out.println("1. Index based approach");
		 for(int i=0;i<alist.size();i++) {
			 Apple1 ap = alist.get(i);
			 if(ap.getColor().startsWith("G"))
				 System.out.println(ap.getColor());
		 }

		 System.out.println("2. for each approach");
		 for(Apple1 ob:alist) {
			 if(ob.getColor().startsWith("G"))
				 System.out.println(ob.getColor());
		 }
		 
		 System.out.println("3. lesson8.Iterator approach");
		 Iterator<Apple1> it = alist.iterator();
		 while(it.hasNext()) {
			 Apple1 ob = it.next();
			 if(ob.getColor().startsWith("G"))
				 System.out.println(ob.getColor());
		 }
		 
		 System.out.println("4. For each using lambda approach");
		 alist.forEach(x-> {
			 if(x.getColor().startsWith("G"))
				 System.out.println(x.getColor());
		 });
		 
		 // Print the list using for each consumer lambda implementation
		 alist.forEach(x->System.out.println(x));
	}

}
