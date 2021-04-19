package second_assignment2;

public final class Triangle {
	
	private final double base;
	private final double height;
	
	public Triangle(double b,double h) {
		this.base=b;
		this.height=h;
	}
	
	public double getBase() {
		return this.base;
	}
	public double getHeight() {
		return this.height;
	}
	
	public double computeArea()
	{
		return 0.5*base*height;
	}

}
