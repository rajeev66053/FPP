package lesson8.Iterator;

// Skeleton to create your own lesson8.Iterator
import java.util.Iterator;

public class MyOwnIterator implements Iterable{

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		Iterator it=new MyIterator();
		return it;
	}
	
	private class MyIterator implements Iterator{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	public static void main(String args[]){
		
		MyOwnIterator list = new MyOwnIterator();
		Iterator it = list.iterator();
		System.out.println(it.hasNext());
		
	}

}
