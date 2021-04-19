package fourth_assignment;

public class Rectangle extends Shape {
	protected static double w;
	protected static double h;
	
	public Rectangle(String color, double width, double height) {
		super(color);
		w=width;
		h=height;
	}
	
	@Override
	public double calculateArea() {
		return w*h;
	}
	
	@Override
	public double calculatePerimeter() {
		return 2*w*2*h;
	}
	
	
	
}
