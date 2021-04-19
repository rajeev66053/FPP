package lesson12.systemexception;

public class MultiCatch {

		public static void main(String[] args) {
			// try block execute only one exception
			int a=10, b=0;
			int arr[] = new int[5];
			int vals[] = { 1, 2, 3 };
			String x = null;
			try {
				arr[0]=1;
				int k = a / arr[0];
			//	int len = x.length();
		//	int result = a / 0; 
			vals[3] = 19; // generate an ArrayIndexOutOfBoundsException
		//	System.out.println(vals[4]);
						} 
			
			catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
				System.err.println(e);
				System.out.println(e.getMessage());
				System.out.println("Exception Occured\n")	;
				
			}
		}

}
