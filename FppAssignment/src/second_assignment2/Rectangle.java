package second_assignment2;

public final class Rectangle {
	

	private final double length;
	private final double width;
	
	public Rectangle(double l, double w) {
		this.length=l;
		this.width=w;
	}
	
	public double getLength() {
		return this.length;
	}
	public double getWidth() {
		return this.width;
	}
	
	public double computeArea()
	{
		return width * length;
	}

}
