package second_assignment2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput;
		boolean validShape;

		Scanner sc=new Scanner(System.in);
		do {		
			System.out.println("Choose Shape to calculate area.Enter C for Circle, R for Rectangle and T for Triangle.");
			userInput= sc.nextLine();			
			validShape=checkShape(userInput);
		}while(!validShape);
			
		switch (userInput.toUpperCase()) {
        case "C":
        	System.out.println("Enter radius of circle :");
    		double radius=sc.nextDouble();

    		Circle c=new Circle(radius);
    		System.out.println("the area of Circle is :"+c.computeArea());
            break;
        case "T":
        	System.out.println("Enter base of traingle :");
    		double base=sc.nextDouble();
        	System.out.println("Enter height of triangle :");
    		double height=sc.nextDouble();

    		Triangle t=new Triangle(base,height);
    		System.out.println("the area of Triangle is :"+t.computeArea());	
            break;
        case "R":
        	System.out.println("Enter length of rectangle :");
    		double length=sc.nextDouble();
    		System.out.println("Enter width of rectangle :");
    		double width=sc.nextDouble();

    		Rectangle r=new Rectangle(length,width);

    		System.out.println("the area of Rectangle is :"+r.computeArea());
            break;
        default:
            System.out.println("Incorrect input.Please enter C for circle, T for Triangle and R for rectangle.Other input beside this will not be accepted.");
            break;
         
        }
		sc.close();

	}
	
	public static boolean checkShape(String userinput) {
		
		Shape[] shapes = Shape.values();
		  for(Shape s : shapes){
			  String str=s.toString();
		     //Comparing
		     if(str.equalsIgnoreCase(userinput)){
		    	 return true;
		     }
		  } 
		return false;
	}

}
