package eighth_assignment;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayQueueImpl aqi=new ArrayQueueImpl();
		 

		 System.out.println("Size of array at the beginning is: "+aqi.size());
		 
		 for(int i=1;i<=13;++i) {
			 aqi.enqueue(i);
		 }
		 
		 
		 System.out.println("Size of array after adding 13 data in array :"+aqi.size());
		 
		 System.out.println("Top value of the queue is:"+aqi.peek());
		 
		 aqi.dequeue();
		 System.out.println("Top value of the queue after deleting one element from the queue is:"+aqi.peek());
		 
		 
		 aqi.dequeue();
		 System.out.println("Top value of the queue after deleting two element from the queue is:"+aqi.peek());

		 System.out.println(aqi.isEmpty());
		 

	}

}
