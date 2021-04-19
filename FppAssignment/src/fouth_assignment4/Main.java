package fouth_assignment4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c1=new Computer("Advanced Micro Devices","AMD",8,2.05);
		Computer c2=new Computer("Advanced Micro Devices","AMD",8,2.05);
		
		System.out.println("Compare two object c1 and c2 :"+c1.equals(c2));
				
		System.out.println("HashCode value of c1 :"+c1.hashCode());
		
		System.out.println("HashCode value of c2 :"+c2.hashCode());
		

//		System.out.println("Compare two HashCode value of c2 :"+c1HashCode.equals(c2HashCode));

	}

}
