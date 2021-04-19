package mypackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int[] ints = {1, 3, 4};
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < ints.length; ++i) {
		list.add(ints[i]);
		}
		
		int x = list.get(1);
		System.out.println(x);*/
		
		/*List<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(1));
		list.add(new Integer(3));
//		list.add(3);
//		list.add("5"); //compiler won’t allow this 
		Integer[] listArr = (Integer[]) list.toArray(new Integer[3]);
		 System.out.println(Arrays.toString(listArr));*/
		
		/*ArrayList<Integer> myInts = new ArrayList<Integer>(25);
		System.out.println( "Size of myInts = " + myInts.size());
		for (int k = 0; k < 10; k++) {
			myInts.add( 3 * k );
		}

		System.out.println(myInts);
		int index = myInts.indexOf(3);
		System.out.println(index);
		int data = myInts.get(5);
		System.out.println(data);
		boolean retval = myInts.contains(29);
		System.out.println(retval);
		myInts.remove(1);
		System.out.println(myInts);
		myInts.remove(new Integer(21));
		System.out.println(myInts);
		myInts.set( 6, 44 );
		System.out.println(myInts);
		myInts.add( 4, 42 );
		System.out.println(myInts);
		Integer[] itemArray = new Integer[myInts.size()];
		Integer[] returnedArray = myInts.toArray(itemArray);
		System.out.println(Arrays.toString(returnedArray));
		
		myInts.clear();
		System.out.println(myInts);*/
		
		
		/*ArrayList<String> arrl = new ArrayList<String>();
		 //adding elements to the end
		 arrl.add("First");
		 arrl.add("Second");
		 arrl.add("Third");
		 arrl.add("Fourth");
		 System.out.println("Actual ArrayList:"+arrl);
		 ArrayList<String> copy = (ArrayList<String>) arrl.clone();
		 System.out.println("Cloned ArrayList:"+copy);*/
		
		LinkedList<String> arrl = new LinkedList<String>();
		 arrl.add("First");
		 arrl.add("Second");
		 arrl.add("Third");
		 arrl.add("Fourth");
		 List<String> list = new LinkedList<String>();
		 list.add("Second");
		 list.add("Fourth");
		 System.out.println("Does LinkedList contains all list elements?: "
		 +arrl.containsAll(list));
		 list.add("one");
		 System.out.println("Does LinkedList contains all list elements?: "
				 +arrl.containsAll(list));




	}

}
