package fourth_assignment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape[] s=new Shape[6];
		s[0]=new Circle("Green",4.5);
		
		s[1]=new Circle("Red",2);
		s[2]=new Rectangle("Blue",15,12);
		s[3]=new Rectangle("Brown",34,22.5);
		s[4]=new Square("Grey",5);
		s[5]=new Square ("White",12.5);
		
		printTotal(s);

	}
	
	
	public static void printTotal(Shape[] shapes) {
		// Implement your code
		double totalShapeArea=0.0;
		double totalShapePerimeter=0.0;
		
		for(Shape s:shapes) {
			totalShapeArea+=s.calculateArea();
			totalShapePerimeter=s.calculatePerimeter();
			
		}
		
		System.out.println("Total area of all the Shapes is:"+totalShapeArea);
		System.out.println("Total perimeter of all the Shapes is:"+totalShapePerimeter);
	 }

}
