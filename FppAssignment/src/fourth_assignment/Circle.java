package fourth_assignment;

public final class Circle extends Shape{
	protected double r;
	
	public Circle(String color, double radius) {
		super(color);
		r=radius;
	}
	
	@Override
	public double calculateArea() {
		return Math.PI* Math.pow(r, 2);
	}
	
	@Override
	public double calculatePerimeter() {
		return 2*Math.PI*r;
	}
}
