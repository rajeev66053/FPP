package lesson5.defaultmethodrules.intfaceclash2;

public interface SupInt1 {
	default void myMethod(int x) {
		myMethod(x + x);
	}
}
