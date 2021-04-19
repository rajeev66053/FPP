package tenth_assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number between 0 and 100.");
		try {
			double score=sc.nextDouble();

			if(score<0 || score>100) {
				throw new UnsupportedOperationException("Score should be in the range of 0 to 100");
			}
		}catch(InputMismatchException e){
			System.err.println(e);
			//throw new InputMismatchException();
		}




	}

}
