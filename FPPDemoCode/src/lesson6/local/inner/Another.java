package lesson6.local.inner;

public class Another {
	int z = 4; // Outer class instance field
	void myMethod(int y, final int x) { // Cannot modify the 
		int w = 3; // Local variable
		final int u = 4;
		class LocalInner {
			int innerVble = 8; // Local class instance field
			private int inner() {
				int newInt = z + innerVble; // Local Variable
//				newInt += y; // compiler error
//				newInt += w; // compiler error
				newInt += u;
				newInt += x;
				return newInt;
			}
		}
		int res = new LocalInner().inner();
		System.out.println(res);
	}
	public static void main(String args[]) {
		new Another().myMethod(5, 5);
	}
}
