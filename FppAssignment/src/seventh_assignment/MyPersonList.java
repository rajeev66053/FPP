package seventh_assignment;

import java.util.Arrays;

public class MyPersonList {
	private final int INITIAL_LENGTH = 4;
	private Person[] personArray; 
	private int size;

	public MyPersonList() {
		personArray = new Person[INITIAL_LENGTH];
		size = 0;
	}
	// Add element in last
	public void add(Person p){
		if(p==null) return;
		if(size == personArray.length) resize();
		personArray[size++] = p;
	}

	public Person get(int i){
		if(i < 0 || i >= size){
			return null;
		}
		return personArray[i];
	}

	public boolean find(String lastName){
		if(lastName==null) return false;
		for(Person p : personArray){
			if(p.getLast().equals(lastName)) return true;
		}
		return false; // The element is not in the list
	}

	public void insert(Person p, int pos){
		if(pos > size || pos<0 ) return;
		if(pos ==personArray.length||size+1 > personArray.length) {
			resize();
		}
		Person[] tempPersonArray = new Person[personArray.length+1];
		System.arraycopy(personArray,0,tempPersonArray,0,pos); // src, spos,des,dspos,number of elements
		tempPersonArray[pos] = p;

		System.arraycopy(personArray,pos,tempPersonArray,pos+1, personArray.length - pos);
		personArray = tempPersonArray;
		++size;
	}

	public boolean remove(String s){
		if(size == 0) return false; // list is empty
		if(s==null) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(personArray[i].getLast().equals(s)){
				index = i;
				break;
			}
		}
		if(index==-1) return false; // p is not found in the list
		Person[] tempPersonArray = new Person[personArray.length];
		System.arraycopy(personArray,0,tempPersonArray,0,index);
		System.arraycopy(personArray,index+1,tempPersonArray,index,personArray.length-(index+1));
		personArray = tempPersonArray;
		--size;
		return true;
	}

	private void resize(){
		System.out.println("resizing");
		int len = personArray.length;
		int newlen = 2*len;
		Person[] tempPersonArray = new Person[newlen];
		System.arraycopy(personArray,0,tempPersonArray,0,len);
		// personArray = Arrays.copyOf(personArray, newlen);
		personArray = tempPersonArray;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(personArray[i].toString()+", ");
		}
		sb.append(personArray[size-1].toString()+"]");
		return sb.toString();
	}
	public int size() {
		return size;
	}
	public boolean isEmpty(){
		return(size==0);
	}

	public static void main(String[] args) {
		MyPersonList pl = new MyPersonList();
		Person p1=new Person("Rajeev","Thapaliya",31);
		Person p2=new Person("Sanjeevan","Sigdel",26);
		Person p3=new Person("Manish","Joshi",29);
		Person p4=new Person("Anuj","Aryal",29);
		Person p5=new Person("Prabhat","Gyawali",26);
		Person p6=new Person("Arjun","Khadka",39);
		Person p7=new Person("Saurav","Majumdar",33);
		Person p8=new Person("Vivek","Sukla",31);
		pl.add(p1);
		pl.add(p2);
		pl.add(p3);
		pl.add(p4);
		System.out.println("The person initial list of size "+pl.size()+" is "+pl);
		pl.insert(p5, 2);
		System.out.println("The list of size :"+pl.size()+" after inserting new person in position 2 is "+pl);
		pl.add(p6);
		System.out.println("The list of size :"+pl.size()+" after adding new person is "+pl);
		pl.remove("Thapaliya");
		pl.remove("Gyawali");
		System.out.println("The list of size :"+pl.size()+" after removing two person of last name \"Thapaliya and Gyawali\" from the list is "+pl);
		pl.insert(p7,3);
		System.out.println("The list of size "+pl.size()+" after inserting new person into pos 3 is "+pl);
		pl.insert(p8,0);
		System.out.println("The list of size "+pl.size()+" after inserting new person into pos 0 is "+pl);
	}

}
