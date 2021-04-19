package lesson12.systemexception;

public class MultipleCatch {

		public static void main(String[] args) {
			// Individual try block to handle various kinds of exception
			int arr[] = null;
			try{
				System.out.printf("The 1st element is %d \r\n", arr[0]);
				
			}
			catch(NullPointerException e)
			{
//				System.err.println(e);
				System.out.println(e);
				arr = new int[5];
			}
			try
			{
				arr[0]= 12;
			System.out.printf("The 6th element is %d \r\n", arr[6]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			try
			{
				Object[] arr2 = new String[3];
				arr2[0] = new Integer(0);
			}
			catch(ArrayStoreException e){
				System.out.println(e);
			}
			
		}
}


