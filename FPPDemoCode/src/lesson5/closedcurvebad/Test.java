package lesson5.closedcurvebad;

class Test {
	public static void main(String[] args) {

		Object[] objects = { new Triangle(5, 5, 5), new Square(3),
				new Circle(3) };
		
				// compute areas
		for (Object o : objects) {
			    
			if (o instanceof Triangle) {
				
				
				Triangle t = (Triangle) o;
					
				System.out.println( t.getClass().getSimpleName() + " : " + t.computeArea());
			}
			if (o instanceof Square) {
				Square s = (Square) o;
				System.out.println(s.getClass().getSimpleName() + " : " +s.computeArea());
			}
			if (o instanceof Circle) {
				Circle c = (Circle) o;
				System.out.println(c.getClass().getSimpleName() + " : " +c.computeArea());
			}
		}
	}
}
