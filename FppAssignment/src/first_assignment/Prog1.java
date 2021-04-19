package first_assignment;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=RandomNumbers.getRandomInt(1, 9);
		
		System.out.println("Random Number between 1 and 9 is :"+ x);
		
		double xpi=Math.pow(Math.PI, x);
		
		System.out.println("x power of pi is:" +  xpi);
		
		int y=RandomNumbers.getRandomInt(3, 14);
		
		System.out.println("Random Number between 3 and 14 is :"+ y);
		
		double ypi=Math.pow(y,Math.PI);
		
		System.out.println("pi power of y is:" +  ypi);
		
	}

}
