// Demo to make use lesson8.Iterator for the Collection API
package lesson8.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nlist = new ArrayList<>(25);
		
		// Add element into the end of the list
		nlist.add("Abel");
		nlist.add("Tigist");
		nlist.add("Linh");
		nlist.add("Benjamin");
		nlist.add("Abeer");
		System.out.println(nlist);
		nlist.set(2, "Dinh");
		System.out.println(nlist);
		
		// Find out the name Startwith 'A' using lesson8.Iterator
		// Raw Type
		Iterator it = nlist.iterator();
		
		while(it.hasNext()){
			String x =(String) it.next();
			if(x.startsWith("A"))
				System.out.println(x);
		}
		
		
		// parameterized Type
		Iterator<String> it2 = nlist.iterator();
		
		while(it2.hasNext()){
			String x = it2.next();
			if(x.startsWith("A"))
				System.out.println(x);
		}
		
		// lesson8.Iterator for the nlist
		
		List<Shopping> list = new ArrayList<>();
		
		 Shopping i1 = new  Shopping("Ipad",499);
		 Shopping i2 = new  Shopping("Samasung S8",799);
		 Shopping i3 = new  Shopping("Mac Pro",1499);
		 Shopping i4 = new  Shopping("Samasung Mini",399);
          list.add(i1);
          list.add(i2);
          list.add(i3);
          list.add(i4);
          
          list.forEach(x->System.out.println(x));
		 
          // Parameterized type of lesson8.Iterator
          Iterator<Shopping> sit = list.iterator();
         
          while(sit.hasNext()){
        	  Shopping item = sit.next();
        	  if(item.getPrice()>500)
        		  System.out.println(item);
          }
		 // lesson8.Iterator for the Shopping list 
		
		 
		 LinkedList<Integer> nums = new LinkedList<>(Arrays.asList(10,20,30,40,50));
		 System.out.println(nums);
		 
		 // Sum the Linked list using lesson8.Iterator
		 ListIterator<Integer> it1 = nums.listIterator();
		 it1.add(100);
		 it1.add(200);
		 System.out.println(nums);
		 System.out.println(it1.hasPrevious());
		 
		 
		 
		
	}

}
