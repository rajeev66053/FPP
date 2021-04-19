package second_assignment2;

public final class Circle {
	
	private final double radius;
	
	public Circle(double r) {
		radius=r;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double computeArea()
	{
		return Math.PI*radius*radius;
	}
	
}
