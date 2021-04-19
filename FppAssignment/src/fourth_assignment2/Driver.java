package fourth_assignment2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figure[] f=new Figure[5];
		f[0]=new UpwardHat();
		f[1]=new UpwardHat();
		f[2]=new DownwardHat();
		f[3]=new FaceMaker();
		f[4]=new Vertical();
		
		for(Figure x:f) {
			x.getFigure();
			
		}
		System.out.println();
		for(Figure x:f) {
			System.out.print(x.getClass().getSimpleName()+":");
			x.getFigure();
			System.out.println();
			
		}
	}

}
